package itfmod.itf;

import itfmod.ITFMod;
import net.minecraft.item.ItemHoe;

public abstract class ITFItemHoe extends ItemHoe implements OrderedItem
{
	public ITFItemHoe(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
