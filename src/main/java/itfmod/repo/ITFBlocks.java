package itfmod.repo;

import java.util.HashSet;
import java.util.Set;

import itfmod.SimpleRegistry;
import itfmod.itf.ITFBlock;
import itfmod.itf.block.BlockFoxyAltar;
import itfmod.itf.block.BlockFoxyBlock;
import itfmod.itf.block.BlockFoxyOre;
import net.minecraft.block.Block;

public class ITFBlocks
{
	public static final BlockFoxyOre FOXY_ORE = new BlockFoxyOre();
	public static final BlockFoxyBlock FOXY_BLOCK = new BlockFoxyBlock();
	public static final BlockFoxyAltar FOXY_ALTAR = new BlockFoxyAltar();
	
	private static final Set<Block> blocks = new HashSet<>();
	
	static
	{
		ITFBlocks.blocks.add(ITFBlocks.FOXY_ORE);
		ITFBlocks.blocks.add(ITFBlocks.FOXY_BLOCK);
		ITFBlocks.blocks.add(ITFBlocks.FOXY_ALTAR);
	}
	
	public static void registerBlocks()
	{
		SimpleRegistry.setBlocks(ITFBlocks.blocks);
	}
}
