package itfmod.itf;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class ITFCreativeTab extends CreativeTabs
{
	private Item iconItem;
	
	public ITFCreativeTab(String label)
	{
		super(label);
	}
	
	public Item getIconItem()
	{
		return this.iconItem;
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(this.iconItem);
	}
	
	public void setIconItem(Item iconItem)
	{
		this.iconItem = iconItem;
	}
}
