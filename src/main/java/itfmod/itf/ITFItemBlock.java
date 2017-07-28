package itfmod.itf;

import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * Represents an {@link ItemBlock}
 */
public class ITFItemBlock extends ItemBlock implements OrderedItem
{
	private int orderId;
	
	/**
	 * Creates a new ItemBlock and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param block the block to create an ItemBlock from
	 */
	public ITFItemBlock(Block block)
	{
		super(block);
		this.setRegistryName(block.getRegistryName().toString());
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.orderId = ((OrderedItem) block).getOrderId();
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return this.orderId;
	}
}
