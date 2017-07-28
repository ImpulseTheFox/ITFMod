package itfmod.itf.block;

import itfmod.itf.ITFBlock;
import net.minecraft.block.material.Material;

import static itfmod.repo.Names.NAME_BLOCK_FOXY_ALTAR_DISABLED;

public class BlockFoxyAltarDisabled extends ITFBlock
{

	public BlockFoxyAltarDisabled()
	{
		super(NAME_BLOCK_FOXY_ALTAR_DISABLED, Material.ROCK);
		setHardness(10.0F);
	}

	@Override
	public int getOrderId()
	{
		return 3;
	}
}
