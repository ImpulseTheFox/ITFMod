package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemHoe;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.item.Item;

import static itfmod.repo.Names.NAME_ITEM_FOXY_HOE;

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
