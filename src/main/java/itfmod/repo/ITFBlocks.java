package itfmod.repo;

import java.util.HashSet;
import java.util.Set;

import itfmod.SimpleRegistry;
import itfmod.itf.ITFBlock;
import itfmod.itf.block.BlockFoxyAltar;
import itfmod.itf.block.BlockFoxyAltarDisabled;
import itfmod.itf.block.BlockFoxyBlock;
import itfmod.itf.block.BlockFoxyOre;
import net.minecraft.block.Block;

public class ITFBlocks
{
	public static final Block FOXY_ORE = new BlockFoxyOre();
	public static final Block FOXY_BLOCK = new BlockFoxyBlock();
	public static final Block FOXY_ALTAR = new BlockFoxyAltar();
	public static final Block FOXY_ALTAR_DISABLED = new BlockFoxyAltarDisabled();
	
	private static final Set<Block> blocks = new HashSet<>();
	
	static
	{
		ITFBlocks.blocks.add(ITFBlocks.FOXY_ORE);
		ITFBlocks.blocks.add(ITFBlocks.FOXY_BLOCK);
		ITFBlocks.blocks.add(ITFBlocks.FOXY_ALTAR);
		ITFBlocks.blocks.add(ITFBlocks.FOXY_ALTAR_DISABLED);
	}
	
	public static void registerBlocks()
	{
		SimpleRegistry.setBlocks(ITFBlocks.blocks);
	}
	public static Set<Block> getBlocks() { return blocks; }
}
