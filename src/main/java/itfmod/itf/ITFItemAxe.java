package itfmod.itf;

import itfmod.ITFMod;
import itfmod.repo.ITFCreativeTabs;
import net.minecraft.item.ItemAxe;

public abstract class ITFItemAxe extends ItemAxe implements OrderedItem
{
	public ITFItemAxe(String name, ToolMaterial material, float damage, float speed)
	{
		super(material, damage * 4, speed);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
