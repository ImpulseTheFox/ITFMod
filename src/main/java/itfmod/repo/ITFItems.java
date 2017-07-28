package itfmod.repo;

import java.util.HashSet;
import java.util.Set;

import itfmod.SimpleRegistry;
import itfmod.itf.item.ItemFoxyAxe;
import itfmod.itf.item.ItemFoxyBoots;
import itfmod.itf.item.ItemFoxyChestplate;
import itfmod.itf.item.ItemFoxyHelmet;
import itfmod.itf.item.ItemFoxyHoe;
import itfmod.itf.item.ItemFoxyIngot;
import itfmod.itf.item.ItemFoxyLeggings;
import itfmod.itf.item.ItemFoxyNugget;
import itfmod.itf.item.ItemFoxyPickaxe;
import itfmod.itf.item.ItemFoxyShovel;
import itfmod.itf.item.ItemFoxySword;
import net.minecraft.item.Item;

public class ITFItems
{
	public static final ItemFoxyAxe FOXY_AXE = new ItemFoxyAxe();
	public static final ItemFoxyHoe FOXY_HOE = new ItemFoxyHoe();
	public static final ItemFoxyIngot FOXY_INGOT = new ItemFoxyIngot();
	public static final ItemFoxyPickaxe FOXY_PICKAXE = new ItemFoxyPickaxe();
	public static final ItemFoxyShovel FOXY_SHOVEL = new ItemFoxyShovel();
	public static final ItemFoxySword FOXY_SWORD = new ItemFoxySword();
	public static final ItemFoxyHelmet FOXY_HELMET = new ItemFoxyHelmet();
	public static final ItemFoxyChestplate FOXY_CHESTPLATE = new ItemFoxyChestplate();
	public static final ItemFoxyLeggings FOXY_LEGGINGS = new ItemFoxyLeggings();
	public static final ItemFoxyBoots FOXY_BOOTS = new ItemFoxyBoots();
	public static final ItemFoxyNugget FOXY_NUGGET = new ItemFoxyNugget();
	
	private static final Set<Item> items = new HashSet<>();
	
	static
	{
		ITFItems.items.add(ITFItems.FOXY_AXE);
		ITFItems.items.add(ITFItems.FOXY_HOE);
		ITFItems.items.add(ITFItems.FOXY_INGOT);
		ITFItems.items.add(ITFItems.FOXY_PICKAXE);
		ITFItems.items.add(ITFItems.FOXY_SHOVEL);
		ITFItems.items.add(ITFItems.FOXY_SWORD);
		ITFItems.items.add(ITFItems.FOXY_HELMET);
		ITFItems.items.add(ITFItems.FOXY_CHESTPLATE);
		ITFItems.items.add(ITFItems.FOXY_LEGGINGS);
		ITFItems.items.add(ITFItems.FOXY_BOOTS);
		ITFItems.items.add(ITFItems.FOXY_NUGGET);
	}
	
	public static void registerItems()
	{
		SimpleRegistry.setItems(ITFItems.items);
	}
}
