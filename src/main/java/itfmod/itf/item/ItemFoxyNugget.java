package itfmod.itf.item;

import itfmod.itf.ITFItem;
import itfmod.repo.ITFCreativeTabs;

import static itfmod.repo.Names.NAME_ITEM_FOXY_NUGGET;

public class ItemFoxyNugget extends ITFItem
{
	public ItemFoxyNugget()
	{
		super(NAME_ITEM_FOXY_NUGGET);
	}
	
	@Override
	public int getOrderId()
	{
		return 3001;
	}
}
