package itfmod.itf.block;

import itfmod.itf.ITFBlock;
import net.minecraft.block.material.Material;

public class BlockFoxyAltar extends ITFBlock
{

	public BlockFoxyAltar()
	{
		super("foxy_altar", Material.ROCK);
		setBlockUnbreakable();
	}

	@Override
	public int getOrderId()
	{
		return 2;
	}
	
}
