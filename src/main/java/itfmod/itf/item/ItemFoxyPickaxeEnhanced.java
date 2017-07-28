package itfmod.itf.item;

import itfmod.itf.ITFItemPickaxe;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.ItemStack;

import static itfmod.ref.Names.NAME_ITEM_FOXY_PICKAXE_ENHANCED;

/**
 * Enhanced version of {@link ItemFoxyPickaxe}
 */
public class ItemFoxyPickaxeEnhanced extends ITFItemPickaxe
{
	public ItemFoxyPickaxeEnhanced()
	{
		super(NAME_ITEM_FOXY_PICKAXE_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 1001;
	}
}
