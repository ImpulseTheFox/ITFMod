package itfmod.itf;

import itfmod.ITFMod;
import itfmod.itf.creativetab.CreativeTabITFMod;
import itfmod.ref.ITFCreativeTabs;
import net.minecraft.item.ItemSpade;

/**
 * Represents a shovel
 */
public abstract class ITFItemShovel extends ItemSpade implements OrderedItem
{
	/**
	 * Creates a new shovel and sets it to the {@link CreativeTabITFMod}
	 *
	 * @param name name of the shovel
	 * @param material material of the shovel
	 */
	public ITFItemShovel(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
