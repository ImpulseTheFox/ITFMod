package itfmod.itf;

import net.minecraft.block.state.IBlockState;

/**
 * Represents a structure
 */
public abstract class ITFStructure
{
	/**
	 * Returns a 3D representation of the structure
	 *
	 * @return a 3D representation of the structure
	 */
	public abstract IBlockState[][][] getBlockStates();
}
