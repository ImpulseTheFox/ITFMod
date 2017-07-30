package itfmod.itf.structure;

import itfmod.itf.ITFStructure;
import itfmod.ref.ITFBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.Rotation;

/**
 * An enhancement altar structure which can be used to enhance items
 */
public class StructureEnhancementAltar extends ITFStructure
{
	private IBlockState[][][] blockStates = new IBlockState[3][1][3];
	
	public StructureEnhancementAltar()
	{
		final IBlockState ALTAR = ITFBlocks.FOXY_ALTAR.getDefaultState();
		final IBlockState ROT0 = Blocks.JUNGLE_STAIRS.getDefaultState();
		final IBlockState ROT90 = Blocks.JUNGLE_STAIRS.getDefaultState().withRotation(Rotation.CLOCKWISE_90);
		final IBlockState ROT180 = Blocks.JUNGLE_STAIRS.getDefaultState().withRotation(Rotation.CLOCKWISE_180);
		final IBlockState ROT270 = Blocks.JUNGLE_STAIRS.getDefaultState().withRotation(Rotation.COUNTERCLOCKWISE_90);
		
		blockStates[0][0][0] = ROT180; 	blockStates[1][0][0] = ROT180; 	blockStates[2][0][0] = ROT270;
		blockStates[0][0][1] = ROT90; 	blockStates[1][0][1] = ALTAR; 	blockStates[2][0][1] = ROT270;
		blockStates[0][0][2] = ROT90; 	blockStates[1][0][2] = ROT0; 	blockStates[2][0][2] = ROT0;
	}
	
	@Override
	public IBlockState[][][] getBlockStates()
	{
		return blockStates;
	}
}
