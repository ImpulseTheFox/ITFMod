package itfmod.itf.item;

import itfmod.itf.ITFItemSword;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;

public class ItemFoxySword extends ITFItemSword
{
	public ItemFoxySword()
	{
		super("foxy_sword", ITFMaterials.FOXY_MATERIAL);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 1002;
	}
}
