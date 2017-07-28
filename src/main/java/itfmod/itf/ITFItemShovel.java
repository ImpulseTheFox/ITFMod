package itfmod.itf;

import itfmod.ITFMod;
import itfmod.repo.ITFCreativeTabs;
import net.minecraft.item.ItemSpade;

public abstract class ITFItemShovel extends ItemSpade implements OrderedItem
{
	public ITFItemShovel(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
