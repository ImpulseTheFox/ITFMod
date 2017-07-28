package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemArmor;
import itfmod.ref.ITFItems;
import itfmod.ref.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import static itfmod.ref.Names.NAME_ITEM_FOXY_HELMET;

/**
 * Enhanced version: {@link ItemFoxyHelmetEnhanced}
 */
public class ItemFoxyHelmet extends ITFItemArmor implements Enhanceable
{
	public ItemFoxyHelmet()
	{
		super(NAME_ITEM_FOXY_HELMET, ITFMaterials.FOXY_MATERIAL_ARMOR, 4, EntityEquipmentSlot.HEAD);
	}
	
	@Override
	public int getOrderId()
	{
		return 2000;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_HELMET_ENHANCED;
	}
}
