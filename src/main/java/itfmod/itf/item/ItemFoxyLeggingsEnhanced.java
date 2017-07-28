package itfmod.itf.item;

import itfmod.itf.ITFItemArmor;
import itfmod.ref.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import static itfmod.ref.Names.NAME_ITEM_FOXY_LEGGINGS_ENHANCED;

/**
 * Enhanced version of {@link ItemFoxyLeggings}
 */
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
