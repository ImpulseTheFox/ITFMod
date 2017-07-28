package itfmod.itf;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Represents a CreativeTab
 */
public abstract class ITFCreativeTab extends CreativeTabs
{
	/**
	 * The item which icon will be used
	 */
	private Item iconItem;
	
	/**
	 * Creates a new CreativeTab.
	 *
	 * @param name name of the CreativeTab
	 */
	public ITFCreativeTab(String name)
	{
		super(name);
	}
	
	/**
	 * Returns the item which icon will be used.
	 *
	 * @return the item which icon will be used
	 */
	public Item getIconItem()
	{
		return this.iconItem;
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(this.iconItem);
	}
	
	/**
	 * Sets the item which icon will be used.
	 *
	 * @param iconItem the item which icon will be used
	 */
	public void setIconItem(Item iconItem)
	{
		this.iconItem = iconItem;
	}
}
