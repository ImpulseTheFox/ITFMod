package itfmod.itf.item;

import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import static itfmod.repo.Names.NAME_ITEM_FOXY_CHESTPLATE;
import static itfmod.repo.Names.NAME_ITEM_FOXY_CHESTPLATE_ENHANCED;

public class ItemFoxyChestplateEnhanced extends ITFItemArmor
{
	public ItemFoxyChestplateEnhanced()
	{
		super(NAME_ITEM_FOXY_CHESTPLATE_ENHANCED, ITFMaterials.FOXY_MATERIAL_ARMOR_ENHANCED, 4, EntityEquipmentSlot.CHEST);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 2003;
	}
}
