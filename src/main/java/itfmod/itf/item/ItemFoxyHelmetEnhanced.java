package itfmod.itf.item;

import itfmod.itf.ITFItemArmor;
import itfmod.ref.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import static itfmod.ref.Names.NAME_ITEM_FOXY_HELMET_ENHANCED;

/**
 * Enhanced version of {@link ItemFoxyHelmet}
 */
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
