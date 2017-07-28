package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemArmor;
import itfmod.ref.ITFItems;
import itfmod.ref.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import static itfmod.ref.Names.NAME_ITEM_FOXY_CHESTPLATE;

/**
 * Enhanced version: {@link ItemFoxyChestplateEnhanced}
 */
public class ItemFoxyChestplate extends ITFItemArmor implements Enhanceable
{
	public ItemFoxyChestplate()
	{
		super(NAME_ITEM_FOXY_CHESTPLATE, ITFMaterials.FOXY_MATERIAL_ARMOR, 4, EntityEquipmentSlot.CHEST);
	}
	
	@Override
	public int getOrderId()
	{
		return 2002;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_CHESTPLATE_ENHANCED;
	}
}
