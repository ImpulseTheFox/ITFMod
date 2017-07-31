package itfmod.itf.item;

import static itfmod.ref.Names.*;
import itfmod.itf.ITFItemHoe;
import itfmod.ref.ITFMaterials;

/**
 * Enhanced version: {@link ItemFoxyHoeEnhanced}
 */
public class ItemFoxyHoe extends ITFItemHoe
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
}
