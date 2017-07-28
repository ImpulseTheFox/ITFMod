package itfmod.itf;

import itfmod.ITFMod;
import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * Represents a pickaxe
 */
public abstract class ITFItemPickaxe extends ItemPickaxe implements OrderedItem
{
	/**
	 * Creates a new pickaxe and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param name name of the pickaxe
	 * @param material material of the pickaxe
	 */
	public ITFItemPickaxe(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
