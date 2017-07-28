package itfmod.itf.item;

import itfmod.itf.ITFItem;
import itfmod.repo.ITFCreativeTabs;

public class ItemFoxyNugget extends ITFItem
{
	public ItemFoxyNugget()
	{
		super("foxy_nugget");
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 3001;
	}
}
