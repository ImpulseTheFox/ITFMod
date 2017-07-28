package itfmod.itf.block;

import itfmod.itf.ITFBlock;
import net.minecraft.block.material.Material;

import static itfmod.repo.Names.NAME_BLOCK_FOXY_ALTAR;

public class BlockFoxyAltar extends ITFBlock
{

	public BlockFoxyAltar()
	{
		super(NAME_BLOCK_FOXY_ALTAR, Material.ROCK);
		setBlockUnbreakable();
	}

	@Override
	public int getOrderId()
	{
		return 2;
	}
}
