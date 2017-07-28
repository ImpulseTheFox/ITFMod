package itfmod.itf.block;

import itfmod.itf.ITFBlock;
import net.minecraft.block.material.Material;

import static itfmod.ref.Names.NAME_BLOCK_FOXY_BLOCK;

public class BlockFoxyBlock extends ITFBlock
{
	public BlockFoxyBlock()
	{
		super(NAME_BLOCK_FOXY_BLOCK, Material.ROCK);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 1);
	}
	
	@Override
	public int getOrderId()
	{
		return 0;
	}
}
