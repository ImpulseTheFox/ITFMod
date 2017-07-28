package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static itfmod.repo.Names.NAME_ITEM_FOXY_LEGGINGS;
import static itfmod.repo.Names.NAME_ITEM_FOXY_LEGGINGS_ENHANCED;

public class ItemFoxyLeggingsEnhanced extends ITFItemArmor
{
	public ItemFoxyLeggingsEnhanced()
	{
		super(NAME_ITEM_FOXY_LEGGINGS_ENHANCED, ITFMaterials.FOXY_MATERIAL_ARMOR_ENHANCED, 4, EntityEquipmentSlot.LEGS);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 2005;
	}
}
