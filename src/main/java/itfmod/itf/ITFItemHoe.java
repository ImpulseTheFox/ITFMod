package itfmod.itf;

import itfmod.ITFMod;
import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.item.ItemHoe;

/**
 * Represents a hoe
 */
public abstract class ITFItemHoe extends ItemHoe implements OrderedItem
{
	/**
	 * Creates a new hoe and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param name name of the hoe
	 * @param material material of the hoe
	 */
	public ITFItemHoe(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
