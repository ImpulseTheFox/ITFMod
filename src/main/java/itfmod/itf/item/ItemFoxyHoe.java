package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemHoe;
import itfmod.ref.ITFItems;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.Item;

import static itfmod.ref.Names.NAME_ITEM_FOXY_HOE;

/**
 * Enhanced version: {@link ItemFoxyHoeEnhanced}
 */
public class ItemFoxyHoe extends ITFItemHoe implements Enhanceable
{
	public ItemFoxyHoe()
	{
		super(NAME_ITEM_FOXY_HOE, ITFMaterials.FOXY_MATERIAL);
	}
	
	@Override
	public int getOrderId()
	{
		return 1008;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_HOE_ENHANCED;
	}
}
