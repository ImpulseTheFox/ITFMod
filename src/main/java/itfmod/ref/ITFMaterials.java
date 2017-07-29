package itfmod.ref;

import itfmod.ITFMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Class to store Materials
 *
 * @see ToolMaterial
 * @see ItemArmor.ArmorMaterial
 */
public class ITFMaterials
{
	public static final ToolMaterial FOXY_MATERIAL = EnumHelper.addToolMaterial("FOXY_MATERIAL", 2, 500, 6.5F, 1.5F, 17);
	public static final ToolMaterial FOXY_MATERIAL_ENHANCED = EnumHelper.addToolMaterial("FOXY_MATERIAL_ENHANCED", 3, 5000, 13.0F, 4.0F, 27);
	public static final ItemArmor.ArmorMaterial FOXY_MATERIAL_ARMOR = EnumHelper.addArmorMaterial("FOXY_MATERIAL_ARMOR", ITFMod.MODID + ":foxy", 500, new int[] { 2, 6, 5, 3 }, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial FOXY_MATERIAL_ARMOR_ENHANCED = EnumHelper.addArmorMaterial("FOXY_MATERIAL_ARMOR_ENHANCED", ITFMod.MODID + ":foxy", 5000, new int[] { 3, 7, 6, 4 }, 27, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
}
