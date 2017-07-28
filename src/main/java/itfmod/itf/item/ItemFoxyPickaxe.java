package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemPickaxe;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.item.Item;

import static itfmod.repo.Names.NAME_ITEM_FOXY_PICKAXE;

public class ItemFoxyPickaxe extends ITFItemPickaxe implements Enhanceable
{
	public ItemFoxyPickaxe()
	{
		super(NAME_ITEM_FOXY_PICKAXE, ITFMaterials.FOXY_MATERIAL);
	}
	
	@Override
	public int getOrderId()
	{
		return 1000;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_PICKAXE_ENHANCED;
	}
}
