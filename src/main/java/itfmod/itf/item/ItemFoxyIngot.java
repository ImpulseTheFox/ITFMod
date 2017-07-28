package itfmod.itf.item;

import itfmod.itf.ITFItem;
import itfmod.repo.ITFCreativeTabs;

public class ItemFoxyIngot extends ITFItem
{
	public ItemFoxyIngot()
	{
		super("foxy_ingot");
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 3000;
	}
}
