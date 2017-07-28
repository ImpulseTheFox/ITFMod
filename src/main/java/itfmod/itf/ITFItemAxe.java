package itfmod.itf;

import itfmod.ITFMod;
import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.item.ItemAxe;

/**
 * Represents an axe
 */
public abstract class ITFItemAxe extends ItemAxe implements OrderedItem
{
	/**
	 * Creates a new axe and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param name name of the axe
	 * @param material material of the axe
	 * @param damage damage of the axe
	 * @param speed attack speed of the axe
	 */
	public ITFItemAxe(String name, ToolMaterial material, float damage, float speed)
	{
		super(material, damage * 4, speed);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
