package itfmod.itf.block;

import itfmod.itf.ITFBlock;
import itfmod.repo.ITFCreativeTabs;
import net.minecraft.block.material.Material;

import static itfmod.repo.Names.NAME_BLOCK_FOXY_ORE;

public class BlockFoxyOre extends ITFBlock
{
	public BlockFoxyOre()
	{
		super(NAME_BLOCK_FOXY_ORE, Material.ROCK);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 1);
	}
	
	@Override
	public int getOrderId()
	{
		return 1;
	}
}
