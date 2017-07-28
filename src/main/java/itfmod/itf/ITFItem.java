package itfmod.itf;

import itfmod.ITFMod;
import net.minecraft.item.Item;

public abstract class ITFItem extends Item implements OrderedItem
{
	public ITFItem(String name)
	{
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
