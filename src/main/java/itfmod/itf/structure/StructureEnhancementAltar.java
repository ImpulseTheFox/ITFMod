package itfmod.itf.structure;

import itfmod.itf.ITFStructure;
import itfmod.repo.ITFBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.Rotation;

public class StructureEnhancementAltar extends ITFStructure
{
	private IBlockState[][][] blockStates = new IBlockState[3][1][3];
	
	public StructureEnhancementAltar()
	{
		int y = 0; //For performance
		
		for (int x = 0; x < 3; x++)
		{
			//Y = 0
			{
				for (int z = 0; z < 3; z++)
				{
					if (x == 0)
					{
						//Middle
						blockStates[x][y][z] = Blocks.JUNGLE_STAIRS.getDefaultState().withRotation(Rotation.CLOCKWISE_90);
					}
					else if (x == 2)
					{
						blockStates[x][y][z] = Blocks.JUNGLE_STAIRS.getDefaultState().withRotation(Rotation.COUNTERCLOCKWISE_90);
					}
					else if (z == 0)
					{
						blockStates[x][y][z] = Blocks.JUNGLE_STAIRS.getDefaultState().withRotation(Rotation.CLOCKWISE_180);
					}
					else if (z == 2)
					{
						blockStates[x][y][z] = Blocks.JUNGLE_STAIRS.getDefaultState();
					}
					else if (x == 1 && z == 1)
					{
						blockStates[x][y][z] = ITFBlocks.FOXY_BLOCK.getDefaultState(); //TODO Foxy Altar Block (function, texture)
					}
					else
					{
						//Fill the rest
						blockStates[x][y][z] = Blocks.AIR.getDefaultState();						
					}
				}
			}
		}
	}
	
	@Override
	public IBlockState[][][] getBlockStates()
	{
		return blockStates;
	}
}
