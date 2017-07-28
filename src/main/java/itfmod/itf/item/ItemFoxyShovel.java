package itfmod.itf.item;

import itfmod.itf.ITFItemShovel;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;

public class ItemFoxyShovel extends ITFItemShovel
{
	public ItemFoxyShovel()
	{
		super("foxy_shovel", ITFMaterials.FOXY_MATERIAL);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 1003;
	}
}
