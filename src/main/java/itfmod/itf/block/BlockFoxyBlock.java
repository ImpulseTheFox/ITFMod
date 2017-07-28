package itfmod.itf.block;

import itfmod.itf.ITFBlock;
import itfmod.repo.ITFCreativeTabs;
import net.minecraft.block.material.Material;

public class BlockFoxyBlock extends ITFBlock
{
	public BlockFoxyBlock()
	{
		super("foxy_block", Material.ROCK);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 0;
	}
}
