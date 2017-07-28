package itfmod.itf.item;

import itfmod.itf.ITFItem;
import itfmod.repo.ITFCreativeTabs;

import static itfmod.repo.Names.NAME_ITEM_FOXY_INGOT;

public class ItemFoxyIngot extends ITFItem
{
	public ItemFoxyIngot()
	{
		super(NAME_ITEM_FOXY_INGOT);
	}
	
	@Override
	public int getOrderId()
	{
		return 3000;
	}
}
