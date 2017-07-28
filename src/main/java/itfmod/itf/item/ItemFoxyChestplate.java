package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import static itfmod.repo.Names.NAME_ITEM_FOXY_CHESTPLATE;

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
