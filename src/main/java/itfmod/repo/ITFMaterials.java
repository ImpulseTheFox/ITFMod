package itfmod.repo;

import itfmod.ITFMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ITFMaterials
{
	public static final ToolMaterial FOXY_MATERIAL = EnumHelper.addToolMaterial("FOXY_MATERIAL", 2, 500, 6.5F, 1.5F, 17);
	public static final ItemArmor.ArmorMaterial FOXY_MATERIAL_ARMOR = EnumHelper.addArmorMaterial("FOXY_MATERIAL_ARMOR", ITFMod.MODID + ":foxy", 500, new int[] { 2, 7, 5, 3 }, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
}
