package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemHoe;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static itfmod.repo.Names.NAME_ITEM_FOXY_HOE;
import static itfmod.repo.Names.NAME_ITEM_FOXY_HOE_ENHANCED;

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
