package itfmod.itf.item;

import itfmod.itf.ITFItemAxe;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;

public class ItemFoxyAxe extends ITFItemAxe
{
	public ItemFoxyAxe()
	{
		super("foxy_axe", ITFMaterials.FOXY_MATERIAL, ITFMaterials.FOXY_MATERIAL.getDamageVsEntity(), -3.0F);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 1001;
	}
}
