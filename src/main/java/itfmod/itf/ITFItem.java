package itfmod.itf;

import itfmod.ITFMod;
import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.item.Item;

/**
 * Represents an item
 */
public abstract class ITFItem extends Item implements OrderedItem
{
	/**
	 * Creates a new item and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param name name of the item
	 */
	public ITFItem(String name)
	{
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
