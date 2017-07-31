package itfmod.ref;

import java.util.HashSet;
import java.util.Set;

import itfmod.SimpleRegistry;
import itfmod.itf.item.*;
import net.minecraft.item.Item;

/**
 * Class to store Items
 */
public class ITFItems
{
	public static final Item FOXY_AXE = new ItemFoxyAxe();
	public static final Item FOXY_AXE_ENHANCED = new ItemFoxyAxeEnhanced();
	public static final Item FOXY_HOE = new ItemFoxyHoe();
	public static final Item FOXY_INGOT = new ItemFoxyIngot();
	public static final Item FOXY_PICKAXE = new ItemFoxyPickaxe();
	public static final Item FOXY_PICKAXE_ENHANCED = new ItemFoxyPickaxeEnhanced();
	public static final Item FOXY_SHOVEL = new ItemFoxyShovel();
	public static final Item FOXY_SHOVEL_ENHANCED = new ItemFoxyShovelEnhanced();
	public static final Item FOXY_SWORD = new ItemFoxySword();
	public static final Item FOXY_SWORD_ENHANCED = new ItemFoxySwordEnhanced();
	public static final Item FOXY_HELMET = new ItemFoxyHelmet();
	public static final Item FOXY_HELMET_ENHANCED = new ItemFoxyHelmetEnhanced();
	public static final Item FOXY_CHESTPLATE = new ItemFoxyChestplate();
	public static final Item FOXY_CHESTPLATE_ENHANCED = new ItemFoxyChestplateEnhanced();
	public static final Item FOXY_LEGGINGS = new ItemFoxyLeggings();
	public static final Item FOXY_LEGGINGS_ENHANCED = new ItemFoxyLeggingsEnhanced();
	public static final Item FOXY_BOOTS = new ItemFoxyBoots();
	public static final Item FOXY_BOOTS_ENHANCED = new ItemFoxyBootsEnhanced();
	public static final Item FOXY_NUGGET = new ItemFoxyNugget();
	
	private static final Set<Item> items = new HashSet<>();
	
	static
	{
		ITFItems.items.add(ITFItems.FOXY_AXE);
		ITFItems.items.add(ITFItems.FOXY_AXE_ENHANCED);
		ITFItems.items.add(ITFItems.FOXY_HOE);
		ITFItems.items.add(ITFItems.FOXY_INGOT);
		ITFItems.items.add(ITFItems.FOXY_PICKAXE);
		ITFItems.items.add(ITFItems.FOXY_PICKAXE_ENHANCED);
		ITFItems.items.add(ITFItems.FOXY_SHOVEL);
		ITFItems.items.add(ITFItems.FOXY_SHOVEL_ENHANCED);
		ITFItems.items.add(ITFItems.FOXY_SWORD);
		ITFItems.items.add(ITFItems.FOXY_SWORD_ENHANCED);
		ITFItems.items.add(ITFItems.FOXY_HELMET);
		ITFItems.items.add(ITFItems.FOXY_HELMET_ENHANCED);
		ITFItems.items.add(ITFItems.FOXY_CHESTPLATE);
		ITFItems.items.add(ITFItems.FOXY_CHESTPLATE_ENHANCED);
		ITFItems.items.add(ITFItems.FOXY_LEGGINGS);
		ITFItems.items.add(ITFItems.FOXY_LEGGINGS_ENHANCED);
		ITFItems.items.add(ITFItems.FOXY_BOOTS);
		ITFItems.items.add(ITFItems.FOXY_BOOTS_ENHANCED);
		ITFItems.items.add(ITFItems.FOXY_NUGGET);
	}
	
	public static void registerItems()
	{
		SimpleRegistry.getItems().addAll(ITFItems.items);
	}
	public static Set<Item> getItems() { return items; }
}
