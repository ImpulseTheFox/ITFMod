package itfmod.itf;

import itfmod.ITFMod;
import net.minecraft.item.ItemAxe;

public abstract class ITFItemAxe extends ItemAxe implements OrderedItem
{
	public ITFItemAxe(String name, ToolMaterial material, float damage, float speed)
	{
		super(material, damage * 4, speed);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}
