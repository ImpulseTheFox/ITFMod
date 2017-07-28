package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static itfmod.repo.Names.NAME_ITEM_FOXY_HELMET;
import static itfmod.repo.Names.NAME_ITEM_FOXY_HELMET_ENHANCED;

public class ItemFoxyHelmetEnhanced extends ITFItemArmor
{
	public ItemFoxyHelmetEnhanced()
	{
		super(NAME_ITEM_FOXY_HELMET_ENHANCED, ITFMaterials.FOXY_MATERIAL_ARMOR_ENHANCED, 4, EntityEquipmentSlot.HEAD);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 2001;
	}
}
