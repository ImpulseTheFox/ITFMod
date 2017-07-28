package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import static itfmod.repo.Names.NAME_ITEM_FOXY_BOOTS;

public class ItemFoxyBoots extends ITFItemArmor implements Enhanceable
{
	public ItemFoxyBoots()
	{
		super(NAME_ITEM_FOXY_BOOTS, ITFMaterials.FOXY_MATERIAL_ARMOR, 4, EntityEquipmentSlot.FEET);
	}
	
	@Override
	public int getOrderId()
	{
		return 2006;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_BOOTS_ENHANCED;
	}
}
