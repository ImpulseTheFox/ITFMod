package itfmod.itf.block;

import itfmod.itf.ITFBlock;
import itfmod.repo.ITFCreativeTabs;
import net.minecraft.block.material.Material;

public class BlockFoxyOre extends ITFBlock
{
	public BlockFoxyOre()
	{
		super("foxy_ore", Material.ROCK);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 1;
	}
}
