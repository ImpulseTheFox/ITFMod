package itfmod.world;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import itfmod.itf.ITFStructure;
import itfmod.ref.ITFBlocks;
import itfmod.ref.ITFStructures;
import itfmod.util.KeyValue;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

/**
 * A custom world generator
 */
public class ITFWorldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimensionType())
		{
			case THE_END:
				break;
			case OVERWORLD:
				this.generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				break;
			case NETHER:
				break;
		}
	}
	
	/**
	 * Generates ore
	 *
	 * @param ore ore to be generated
	 * @param world world to be generated in
	 * @param random random
	 * @param x X pos
	 * @param z Z pos
	 * @param minY minimum Y pos
	 * @param maxY maximum Y pos
	 * @param size size of lode
	 * @param chances chances
	 */
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	
	/**
	 * Generates a chunk of the overworld
	 *
	 * @param random random
	 * @param chunkX chunk X pos
	 * @param chunkZ chunk Z pos
	 * @param world world of chunk
	 * @param chunkGenerator the chunkGenerator
	 * @param chunkProvider the chunkProvider
	 */
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		// Generate FOXY_ORE
		this.generateOre(ITFBlocks.FOXY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 12, 32, 4 + random.nextInt(5), 2);
		// Generate Structure
		this.generateStructure(ITFStructures.ENHANCEMENT_ALTAR, world, random, chunkX * 16, chunkZ * 16,    250);
	}
	
	/**
	 * Generates a {@link ITFStructure structure}
	 *
	 * @param structure structure to be generated
	 * @param world world to be generated in
	 * @param random random
	 * @param x X pos
	 * @param z Z pos
	 * @param chanceReduction higher chanceReduction reduces the probability (1 is almost every chunk, 10 is almost every 10 chunks; flatter areas have a higher probability of spawning the structure).
	 */
	private void generateStructure(ITFStructure structure, World world, Random random, int x, int z, int chanceReduction)
	{
		if (!(random.nextInt(chanceReduction) == 0)) //Reduce chances
			return;
		
		int randomX = x + random.nextInt(16);
		int randomZ = z + random.nextInt(16);
		int topY;
		
		try
		{
			topY = fetchTopLevel(world, 48, randomX, randomZ);
		}
		catch (ReachedBadLevelException e)
		{
			return;
		}
		
		BlockPos pos = new BlockPos(randomX, topY, randomZ);
		
		try
		{
			buildStructure(world, pos, structure, false);			
		}
		catch (ObstacledStructureException e)
		{
			return;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Actually spawns a {@link ITFStructure structure}
	 *
	 * @param world world to be generated in
	 * @param pos position to be generated at
	 * @param structure structure to be generated
	 * @param ignoreObstacles ignore {@link #isSuitableForBuilding(Material) obstacles} and replace them, rather than throwing an exception
	 * @throws ObstacledStructureException if the structure would be inside {@link #isSuitableForBuilding(Material) blocks suitable for building} OR if the structure wouldn't have a {@link #isSuitableForBuilding(Material) suitable block for building} beneath it at some point
	 */
	private void buildStructure(World world, BlockPos pos, ITFStructure structure, boolean ignoreObstacles) throws ObstacledStructureException
	{
		IBlockState[][][] blockStates = structure.getBlockStates();
		BlockPos currentPos;
		//using a buffer so it's possible to check if the method would throw a ObstacledStructureException at some point before placing any block
		Set<KeyValue<BlockPos, IBlockState>> buildBuffer = new HashSet<>();
		
		for (int x = 0; x < blockStates[0][0].length; x++)
		{
			for (int y = 0; y < blockStates[0].length; y++)
			{
				for (int z = 0; z < blockStates.length; z++)
				{
					currentPos = pos.add(x, y, z);
					
					if (!isSuitableForBuilding(world.getBlockState(currentPos).getMaterial()) || isSuitableForBuilding(world.getBlockState(currentPos.add(0, -1, 0)).getMaterial()))
					{
						if (!ignoreObstacles) throw new ObstacledStructureException();
					}
					
					buildBuffer.add(new KeyValue<BlockPos, IBlockState>(currentPos, blockStates[x][y][z]));
				}
			}
		}
		
		for (KeyValue<BlockPos, IBlockState> kv : buildBuffer)
		{
			world.setBlockState(kv.getKey(), kv.getValue());
		}
	}
	
	/**
	 * Fetches the position (Y) of the top non-{@link #isSuitableForBuilding(Material) suitableForBuilding} block of a X/Z position.
	 *
	 * @param world world to be fetching from
	 * @param badLevel if Y level reaches or falls below badLevel, a {@link ReachedBadLevelException} will be thrown.
	 * @param x X pos
	 * @param z Z pos
	 * @return the top level (Y)
	 * @throws ReachedBadLevelException
	 */
	private int fetchTopLevel(World world, int badLevel, int x, int z) throws ReachedBadLevelException
	{
		IBlockState belowBlock;
		int y;
		
		for (y = world.getHeight(x, z); y >= badLevel; y--)
		{
			belowBlock = world.getBlockState(new BlockPos(x, y - 1, z));
			
			Material material = belowBlock.getMaterial();
			
			if (!isSuitableForBuilding(material))
			{				
				break;
			}
		}
		
		if (y <= badLevel) throw new ReachedBadLevelException();
		
		return y;
	}
	
	/**
	 * Defines a material as suitable for building or not.
	 *
	 * @param mat material
	 * @return if the material is suitable for building
	 */
	private boolean isSuitableForBuilding(Material mat)
	{
		return mat == Material.AIR  || mat == Material.CACTUS || mat == Material.LAVA || mat == Material.WATER || mat == Material.LEAVES
			|| mat == Material.SNOW || mat == Material.FIRE   || mat == Material.VINE || mat == Material.CORAL || mat == Material.PLANTS;
	}
}
