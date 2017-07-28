package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemArmor;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import static itfmod.repo.Names.NAME_ITEM_FOXY_LEGGINGS;

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
