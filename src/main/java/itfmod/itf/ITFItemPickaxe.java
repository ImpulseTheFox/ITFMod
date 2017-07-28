package itfmod.itf;

import itfmod.ITFMod;
import net.minecraft.item.ItemPickaxe;

public abstract class ITFItemPickaxe extends ItemPickaxe implements OrderedItem
{
	public ITFItemPickaxe(String name, ToolMaterial material)
	{
		super(material);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
