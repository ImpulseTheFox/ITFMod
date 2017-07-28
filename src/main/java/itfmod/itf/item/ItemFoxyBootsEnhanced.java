package itfmod.itf.item;

import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import static itfmod.repo.Names.NAME_ITEM_FOXY_BOOTS;
import static itfmod.repo.Names.NAME_ITEM_FOXY_BOOTS_ENHANCED;

public class ItemFoxyBootsEnhanced extends ITFItemArmor
{
	public ItemFoxyBootsEnhanced()
	{
		super(NAME_ITEM_FOXY_BOOTS_ENHANCED, ITFMaterials.FOXY_MATERIAL_ARMOR_ENHANCED, 4, EntityEquipmentSlot.FEET);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 2007;
	}
}
