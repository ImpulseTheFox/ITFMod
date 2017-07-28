package itfmod.itf.item;

import itfmod.itf.ITFItem;

import static itfmod.ref.Names.NAME_ITEM_FOXY_INGOT;

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
