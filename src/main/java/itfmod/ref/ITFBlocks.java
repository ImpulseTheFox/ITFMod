package itfmod.ref;

import java.util.HashSet;
import java.util.Set;
import itfmod.SimpleRegistry;
import itfmod.itf.ITFItemBlock;
import itfmod.itf.block.BlockFoxyAltar;
import itfmod.itf.block.BlockFoxyAltarDisabled;
import itfmod.itf.block.BlockFoxyBlock;
import itfmod.itf.block.BlockFoxyOre;
import net.minecraft.block.Block;

/**
 * Class to store blocks
 */
public class ITFBlocks
{
	public static final Block FOXY_ORE = new BlockFoxyOre();
	public static final Block FOXY_BLOCK = new BlockFoxyBlock();
	public static final Block FOXY_ALTAR = new BlockFoxyAltar();
	public static final Block FOXY_ALTAR_DISABLED = new BlockFoxyAltarDisabled();

	private static final Set<Block> blocks = new HashSet<>();
	private static final Set<ITFItemBlock> itemBlocks = new HashSet<>();
	
	static
	{
		ITFBlocks.blocks.add(ITFBlocks.FOXY_ORE);
		ITFBlocks.blocks.add(ITFBlocks.FOXY_BLOCK);
		ITFBlocks.blocks.add(ITFBlocks.FOXY_ALTAR);
		ITFBlocks.blocks.add(ITFBlocks.FOXY_ALTAR_DISABLED);
	}
	
	public static void registerBlocks()
	{
		SimpleRegistry.getBlocks().addAll(ITFBlocks.blocks);
	}
	
	public static void registerItemBlocks()
	{
		SimpleRegistry.getItems().addAll(getItemBlocks());
	}
	
	public static Set<ITFItemBlock> getItemBlocks()
	{
		if (itemBlocks.isEmpty())
		{
			for (Block block : ITFBlocks.blocks)
			{
				itemBlocks.add(new ITFItemBlock(block));
			}
		}
		
		return itemBlocks;
	}
	
	public static Set<Block> getBlocks() { return blocks; }
}
