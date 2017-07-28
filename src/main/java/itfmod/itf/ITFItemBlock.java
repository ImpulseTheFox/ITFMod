package itfmod.itf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ITFItemBlock extends ItemBlock implements OrderedItem
{
	private int orderId;
	
	public ITFItemBlock(Block block)
	{
		super(block);
		this.setRegistryName(block.getRegistryName().toString());
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.orderId = ((OrderedItem) block).getOrderId();
	}
	
	@Override
	public int getOrderId()
	{
		return this.orderId;
	}
}
