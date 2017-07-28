package itfmod.itf.item;

import itfmod.itf.ITFItemHoe;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;

public class ItemFoxyHoe extends ITFItemHoe
{
	public ItemFoxyHoe()
	{
		super("foxy_hoe", ITFMaterials.FOXY_MATERIAL);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 1004;
	}
}
