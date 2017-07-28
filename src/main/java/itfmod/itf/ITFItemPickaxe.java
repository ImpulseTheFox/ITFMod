package itfmod.itf;

import itfmod.ITFMod;
import itfmod.repo.ITFCreativeTabs;
import net.minecraft.item.ItemPickaxe;

public abstract class ITFItemPickaxe extends ItemPickaxe implements OrderedItem
{
	public ITFItemPickaxe(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
