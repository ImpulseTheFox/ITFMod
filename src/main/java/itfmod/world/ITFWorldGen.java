package itfmod.world;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import itfmod.itf.ITFStructure;
import itfmod.repo.ITFBlocks;
import itfmod.repo.ITFStructures;
import itfmod.util.KeyValue;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

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
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		// Generate FOXY_ORE
		this.generateOre(ITFBlocks.FOXY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 12, 44, 4 + random.nextInt(5), 4);
		// Generate Structure
		this.generateStructure(ITFStructures.ENHANCEMENT_ALTAR, world, random, chunkX * 16, chunkZ * 16);
	}

	private void generateStructure(ITFStructure structure, World world, Random random, int x, int z)
	{
		if (!(random.nextInt(250) == 0)) //Reduce chances
			return;
		
		int randomX = x + random.nextInt(16);
		int randomZ = z + random.nextInt(16);
		int topY;
		
		try
		{
			topY = fetchTopBlock(world, 48, randomX, randomZ);
		}
		catch (TopBelowMinimunException e)
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
	
	private void buildStructure(World world, BlockPos pos, ITFStructure structure, boolean ignoreObstacles) throws ObstacledStructureException
	{
		IBlockState[][][] blockStates = structure.getBlockStates();
		BlockPos currentPos;
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

	private int fetchTopBlock(World world, int min, int x, int z) throws TopBelowMinimunException
	{
		IBlockState belowBlock;
		int y;
		
		for (y = world.getHeight(x, z); y >= min; y--)
		{
			belowBlock = world.getBlockState(new BlockPos(x, y - 1, z));
			
			Material material = belowBlock.getMaterial();
			
			if (!isSuitableForBuilding(material))
			{				
				break;
			}
		}
		
		if (y == min) throw new TopBelowMinimunException();
		
		return y;
	}
	
	private boolean isSuitableForBuilding(Material mat)
	{
		return mat == Material.AIR  || mat == Material.CACTUS || mat == Material.LAVA || mat == Material.WATER || mat == Material.LEAVES
			|| mat == Material.SNOW || mat == Material.FIRE   || mat == Material.VINE || mat == Material.CORAL || mat == Material.PLANTS;
	}
}
