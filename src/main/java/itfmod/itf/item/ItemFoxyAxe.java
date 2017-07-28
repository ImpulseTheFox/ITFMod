package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItem;
import itfmod.itf.ITFItemAxe;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.item.Item;

import static itfmod.repo.Names.NAME_ITEM_FOXY_AXE;
import static itfmod.repo.Names.NAME_ITEM_FOXY_AXE_ENHANCED;

public class ItemFoxyAxe extends ITFItemAxe implements Enhanceable
{
	public ItemFoxyAxe()
	{
		super(NAME_ITEM_FOXY_AXE_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED.getDamageVsEntity(), 0.0F);
		this.setCreativeTab(ITFCreativeTabs.CREATIVE_TAB_ITF_MOD);
	}
	
	@Override
	public int getOrderId()
	{
		return 1002;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_AXE_ENHANCED;
	}
}
