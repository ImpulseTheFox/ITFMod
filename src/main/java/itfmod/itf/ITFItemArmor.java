package itfmod.itf;

import itfmod.ITFMod;
import itfmod.repo.ITFCreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public abstract class ITFItemArmor extends ItemArmor implements OrderedItem
{
	public ITFItemArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(ITFMod.MODID, name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
}
