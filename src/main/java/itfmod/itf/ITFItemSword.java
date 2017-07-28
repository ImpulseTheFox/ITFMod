package itfmod.itf;

import itfmod.ITFMod;
import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Represents a sword
 */
public abstract class ITFItemSword extends ItemSword implements OrderedItem
{
	/**
	 * Creates a new sword and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param name name of the sword
	 * @param material material of the sword
	 */
	public ITFItemSword(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
