package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemSword;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static itfmod.repo.Names.NAME_ITEM_FOXY_SWORD;
import static itfmod.repo.Names.NAME_ITEM_FOXY_SWORD_ENHANCED;

public class ItemFoxySwordEnhanced extends ITFItemSword
{
	public ItemFoxySwordEnhanced()
	{
		super(NAME_ITEM_FOXY_SWORD_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 1005;
	}
}
