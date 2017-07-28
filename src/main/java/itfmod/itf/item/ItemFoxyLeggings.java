package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemArmor;
import itfmod.ref.ITFItems;
import itfmod.ref.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import static itfmod.ref.Names.NAME_ITEM_FOXY_LEGGINGS;

/**
 * Enhanced version: {@link ItemFoxyLeggingsEnhanced}
 */
public class ItemFoxyLeggings extends ITFItemArmor implements Enhanceable
{
	public ItemFoxyLeggings()
	{
		super(NAME_ITEM_FOXY_LEGGINGS, ITFMaterials.FOXY_MATERIAL_ARMOR, 4, EntityEquipmentSlot.LEGS);
	}
	
	@Override
	public int getOrderId()
	{
		return 2004;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_LEGGINGS_ENHANCED;
	}
}
