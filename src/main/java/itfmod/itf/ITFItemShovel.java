package itfmod.itf;

import itfmod.ITFMod;
import net.minecraft.item.ItemSpade;

public abstract class ITFItemShovel extends ItemSpade implements OrderedItem
{
	public ITFItemShovel(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
