package itfmod.itf.item;

import itfmod.itf.ITFItemPickaxe;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFMaterials;

public class ItemFoxyPickaxe extends ITFItemPickaxe
{
	public ItemFoxyPickaxe()
	{
		super("foxy_pickaxe", ITFMaterials.FOXY_MATERIAL);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 1000;
	}
}
