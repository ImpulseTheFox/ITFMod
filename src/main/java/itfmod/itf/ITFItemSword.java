package itfmod.itf;

import itfmod.ITFMod;
import net.minecraft.item.ItemSword;

public abstract class ITFItemSword extends ItemSword implements OrderedItem
{
	public ITFItemSword(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
