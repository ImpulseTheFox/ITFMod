package itfmod.itf.item;

import itfmod.itf.ITFItemHoe;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.ItemStack;

import static itfmod.ref.Names.NAME_ITEM_FOXY_HOE_ENHANCED;

/**
 * Enhanced version of {@link ItemFoxyHoe}
 */
public class ItemFoxyHoeEnhanced extends ITFItemHoe
{
	public ItemFoxyHoeEnhanced()
	{
		super(NAME_ITEM_FOXY_HOE_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 1009;
	}
}
