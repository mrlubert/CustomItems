package com.MrLubert.Custom;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;


public class Recipes {

	private String format(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);

	}

	public static final ItemStack Sword = customWrapper(Material.NETHERITE_SWORD);
	public static final ItemStack Axe = customWrapper(Material.NETHERITE_AXE);
	public static final ItemStack PickAxe = customWrapper(Material.NETHERITE_PICKAXE);
	public static final ItemStack PickAxe1 = customWrapper(Material.NETHERITE_PICKAXE);
	public static final ItemStack Shovel = customWrapper(Material.NETHERITE_SHOVEL);
	public static final ItemStack Shovel1 = customWrapper(Material.NETHERITE_SHOVEL);
	public static final ItemStack Hoe = customWrapper(Material.NETHERITE_HOE);
	public static final ItemStack Elytra = customWrapper(Material.ELYTRA);
	public static final ItemStack Helmet = customWrapper(Material.NETHERITE_HELMET);
	public static final ItemStack Chest = customWrapper(Material.NETHERITE_CHESTPLATE);
	public static final ItemStack Legs = customWrapper(Material.NETHERITE_LEGGINGS);
	public static final ItemStack Boots = customWrapper(Material.NETHERITE_BOOTS);
	public static final ItemStack Bow = customWrapper(Material.BOW);
	public static final ItemStack CrossBow = customWrapper(Material.CROSSBOW);
	public static final ItemStack Totem = customWrapper(Material.TOTEM_OF_UNDYING);
	public static final ItemStack FlightTotem = customWrapper(Material.TOTEM_OF_UNDYING);
	public static final ItemStack LauncherCrossBow = customWrapper(Material.CROSSBOW);
	public static final ItemStack MagnetHopper = customWrapper(Material.HOPPER);
	public static final ItemStack RandomBlock = customWrapper(Material.CHEST);
	
	public static void initItems() {
		initItemMeta(Sword);
		initItemMeta(Axe);
		initItemMeta(PickAxe1);
		initItemMeta(PickAxe);
		initItemMeta(Shovel1);
		initItemMeta(Shovel);
		initItemMeta(Hoe);
		initItemMeta(Elytra);
		initItemMeta(Helmet);
		initItemMeta(Chest);
		initItemMeta(Legs);
		initItemMeta(Boots);
		initItemMeta(Bow);
		initItemMeta(CrossBow);
		initItemMeta(Totem);
		initItemMeta(FlightTotem);
		initItemMeta(LauncherCrossBow);
		initItemMeta(MagnetHopper);
		initItemMeta(RandomBlock);

	}

	public static void initItemMeta(ItemStack stack) {
		ItemMeta meta = stack.getItemMeta();
		stack.setItemMeta(meta);
	}

	public void createRecipe() {
		Sword();
		PickAxe();
		PickAxe1();
		Axe();
		Shovel();
		Shovel1();
		Hoe();
		Elytra();
		Helmet();
		Chest();
		Legs();
		Boots();
		Bow();
		CrossBow();
		Totem();
		FlightTotem();
		LauncherCrossBow();
		MagnetHopper();
		RandomBlock();
	}

	public void Sword() {

		ItemMeta metaSword = Sword.getItemMeta();
		metaSword.setDisplayName(format("&4&l&nNetherite Sword"));
		Sword.setItemMeta(metaSword);
		Sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		Sword.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 10);
		Sword.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Sword.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 10);
		Sword.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
		Sword.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
		Sword.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Swordrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomSword"), Recipes.Sword.clone());
		Swordrecipe.shape("BNB", "NSN", "BNB");
		Swordrecipe.setIngredient('B', Material.NETHERITE_BLOCK);
		Swordrecipe.setIngredient('S', Material.NETHERITE_SWORD);
		Swordrecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Swordrecipe);
	}
	
	public void Axe() {

		ItemMeta metaAxe = Axe.getItemMeta();
		metaAxe.setDisplayName(format("&4&l&nNetherite Axe"));
		Axe.setItemMeta(metaAxe);
		Axe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		Axe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		Axe.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Axe.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Axerecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomAxe"), Recipes.Axe.clone());
		Axerecipe.shape("BNB", "NSN", "BNB");
		Axerecipe.setIngredient('B', Material.NETHERITE_BLOCK);
		Axerecipe.setIngredient('S', Material.NETHERITE_AXE);
		Axerecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Axerecipe);
	}

	public void PickAxe() {

		ItemMeta metaPickAxe = PickAxe.getItemMeta();
		metaPickAxe.setDisplayName(format("&4&l&nFortune Netherite PickAxe"));
		PickAxe.setItemMeta(metaPickAxe);
		PickAxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		PickAxe.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		PickAxe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
		PickAxe.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe PickAxerecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomPickAxe"), Recipes.PickAxe.clone());
		PickAxerecipe.shape("ENE", "NPN", "ENE");
		PickAxerecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		PickAxerecipe.setIngredient('P', Material.NETHERITE_PICKAXE);
		PickAxerecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(PickAxerecipe);
	}
	
	public void PickAxe1() {

		ItemMeta metaPickAxe1 = PickAxe1.getItemMeta();
		metaPickAxe1.setDisplayName(format("&4&l&nSilkTouch Netherite PickAxe"));
		PickAxe1.setItemMeta(metaPickAxe1);
		PickAxe1.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		PickAxe1.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		PickAxe1.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
		PickAxe1.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe PickAxerecipe1 = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomPickAxe1"), Recipes.PickAxe1.clone());
		PickAxerecipe1.shape("ENE", "NPN", "ENE");
		PickAxerecipe1.setIngredient('E', Material.NETHERITE_INGOT);
		PickAxerecipe1.setIngredient('P', Material.NETHERITE_PICKAXE);
		PickAxerecipe1.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(PickAxerecipe1);
	}
	
	public void Shovel() {

		ItemMeta metaPickAxe = Shovel.getItemMeta();
		metaPickAxe.setDisplayName(format("&4&l&nFortune Netherite Shovel"));
		Shovel.setItemMeta(metaPickAxe);
		Shovel.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		Shovel.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Shovel.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
		Shovel.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Shovelrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomShovel"), Recipes.Shovel.clone());
		Shovelrecipe.shape("ENE", "NPN", "ENE");
		Shovelrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		Shovelrecipe.setIngredient('P', Material.NETHERITE_SHOVEL);
		Shovelrecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Shovelrecipe);
	}
	
	public void Shovel1() {

		ItemMeta metaPickAxe1 = Shovel1.getItemMeta();
		metaPickAxe1.setDisplayName(format("&4&l&nSilkTouch Netherite Shovel"));
		Shovel1.setItemMeta(metaPickAxe1);
		Shovel1.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		Shovel1.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Shovel1.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
		Shovel1.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Shovelrecipe1 = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomShovel1"), Recipes.Shovel1.clone());
		Shovelrecipe1.shape("ENE", "NPN", "ENE");
		Shovelrecipe1.setIngredient('E', Material.NETHERITE_INGOT);
		Shovelrecipe1.setIngredient('P', Material.NETHERITE_SHOVEL);
		Shovelrecipe1.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Shovelrecipe1);
	}

	public void Hoe() {

		ItemMeta metaHoe = Hoe.getItemMeta();
		metaHoe.setDisplayName(format("&4&l&nNetherite Hoe"));
		Hoe.setItemMeta(metaHoe);
		Hoe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		Hoe.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Hoe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
		Hoe.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Hoerecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomHoe"), Recipes.Hoe.clone());
		Hoerecipe.shape("ENE", "NPN", "ENE");
		Hoerecipe.setIngredient('E', Material.NETHERITE_INGOT);
		Hoerecipe.setIngredient('P', Material.NETHERITE_HOE);
		Hoerecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Hoerecipe);
	}

	public void Elytra() {

		ItemMeta Elytrameta = Elytra.getItemMeta();
		Elytrameta.setDisplayName(format("&4&l&nElytra"));
		Elytra.setItemMeta(Elytrameta);
		Elytra.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Elytra.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		Elytra.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Elytrarecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomElytra"), Recipes.Elytra.clone());
		Elytrarecipe.shape("INI", "FCF", "INI");
		Elytrarecipe.setIngredient('N', Material.NETHER_STAR);
		Elytrarecipe.setIngredient('C', Material.NETHERITE_CHESTPLATE);
		Elytrarecipe.setIngredient('I', Material.NETHERITE_INGOT);
		Elytrarecipe.setIngredient('F', Material.FEATHER);
		Bukkit.addRecipe(Elytrarecipe);
	}
	
	public void Helmet() {

		ItemMeta metaHelmet = Helmet.getItemMeta();
		metaHelmet.setDisplayName(format("&4&l&nNetherite Helmet"));
		Helmet.setItemMeta(metaHelmet);
		Helmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
		Helmet.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 10);
		Helmet.addUnsafeEnchantment(Enchantment.OXYGEN, 10);
		Helmet.addUnsafeEnchantment(Enchantment.WATER_WORKER, 10);
		Helmet.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Helmet.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Helmetrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomHelmet"), Recipes.Helmet.clone());
		Helmetrecipe.shape("ENE", "NPN", "ENE");
		Helmetrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		Helmetrecipe.setIngredient('P', Material.NETHERITE_HELMET);
		Helmetrecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Helmetrecipe);
	}
	
	public void Chest() {

		ItemMeta metaChest = Chest.getItemMeta();
		metaChest.setDisplayName(format("&4&l&nNetherite ChestPlate"));
		Chest.setItemMeta(metaChest);
		Chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
		Chest.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 10);
		Chest.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Chest.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Chestrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomChest"), Recipes.Chest.clone());
		Chestrecipe.shape("ENE", "NPN", "ENE");
		Chestrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		Chestrecipe.setIngredient('P', Material.NETHERITE_CHESTPLATE);
		Chestrecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Chestrecipe);
	}
	
	public void Legs() {

		ItemMeta metaLegs = Legs.getItemMeta();
		metaLegs.setDisplayName(format("&4&l&nNetherite Leggings"));
		Legs.setItemMeta(metaLegs);
		Legs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
		Legs.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 10);
		Legs.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Legs.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Legsrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomLegs"), Recipes.Legs.clone());
		Legsrecipe.shape("ENE", "NPN", "ENE");
		Legsrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		Legsrecipe.setIngredient('P', Material.NETHERITE_LEGGINGS);
		Legsrecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Legsrecipe);
	}
	
	public void Boots() {

		ItemMeta metaBoots = Boots.getItemMeta();
		metaBoots.setDisplayName(format("&4&l&nNetherite Boots"));
		Boots.setItemMeta(metaBoots);
		Boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
		Boots.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 10);
		Boots.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 10);
		Boots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
		Boots.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Boots.addUnsafeEnchantment(Enchantment.SOUL_SPEED, 5);
		Boots.addUnsafeEnchantment(Enchantment.MENDING, 1);

		ShapedRecipe Bootsrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomBoots"), Recipes.Boots.clone());
		Bootsrecipe.shape("ENE", "NPN", "ENE");
		Bootsrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		Bootsrecipe.setIngredient('P', Material.NETHERITE_BOOTS);
		Bootsrecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Bootsrecipe);
	}
	
	public void Bow() {

		ItemMeta metaBow = Bow.getItemMeta();
		metaBow.setDisplayName(format("&4&l&nBow"));
		Bow.setItemMeta(metaBow);
		Bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
		Bow.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 5);
		Bow.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		Bow.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
		Bow.addUnsafeEnchantment(Enchantment.MENDING, 1);
		Bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);

		ShapedRecipe Bowrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomBow"), Recipes.Bow.clone());
		Bowrecipe.shape("ENE", "NPN", "ENE");
		Bowrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		Bowrecipe.setIngredient('P', Material.BOW);
		Bowrecipe.setIngredient('N', Material.NETHER_STAR);
		Bukkit.addRecipe(Bowrecipe);
	}
	
	public void CrossBow() {

		ItemMeta metaCrossBow = CrossBow.getItemMeta();
		metaCrossBow.setDisplayName(format("&4&l&nCrossBow"));
		CrossBow.setItemMeta(metaCrossBow);
		CrossBow.addUnsafeEnchantment(Enchantment.PIERCING, 25);
		CrossBow.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		// Makes It Give 3 Arrows When Shot // CrossBow.addUnsafeEnchantment(Enchantment.MULTISHOT, 10);
		CrossBow.addUnsafeEnchantment(Enchantment.QUICK_CHARGE, 5);
		CrossBow.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 5);
		CrossBow.addUnsafeEnchantment(Enchantment.MENDING, 1);
		CrossBow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);

		ShapedRecipe CrossBowrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomCrossBow"), Recipes.CrossBow.clone());
		CrossBowrecipe.shape("ENE", "ACA", "ENE");
		CrossBowrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		CrossBowrecipe.setIngredient('C', Material.CROSSBOW);
		CrossBowrecipe.setIngredient('N', Material.NETHER_STAR);
		CrossBowrecipe.setIngredient('A', Material.ENCHANTED_GOLDEN_APPLE);
		Bukkit.addRecipe(CrossBowrecipe);
	}
	
	public void LauncherCrossBow() {

		ItemMeta metaLauncherCrossBow = LauncherCrossBow.getItemMeta();
		metaLauncherCrossBow.setDisplayName(format("&4&l&nLauncherCrossBow"));
		LauncherCrossBow.setItemMeta(metaLauncherCrossBow);
		LauncherCrossBow.addUnsafeEnchantment(Enchantment.PIERCING, 25);
		LauncherCrossBow.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		// Makes It Give 3 Arrows When Shot // LauncherCrossBow.addUnsafeEnchantment(Enchantment.MULTISHOT, 10);
		LauncherCrossBow.addUnsafeEnchantment(Enchantment.QUICK_CHARGE, 5);
		LauncherCrossBow.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 5);
		LauncherCrossBow.addUnsafeEnchantment(Enchantment.MENDING, 1);
		LauncherCrossBow.addUnsafeEnchantment(Enchantment.RIPTIDE, 1);

		ShapedRecipe LauncherCrossBowrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomLauncherCrossBow"), Recipes.LauncherCrossBow.clone());
		LauncherCrossBowrecipe.shape("ENE", "PCP", "ENE");
		LauncherCrossBowrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		LauncherCrossBowrecipe.setIngredient('C', Material.CROSSBOW);
		LauncherCrossBowrecipe.setIngredient('N', Material.NETHER_STAR);
		LauncherCrossBowrecipe.setIngredient('P', Material.DRAGON_BREATH);
		Bukkit.addRecipe(LauncherCrossBowrecipe);
	}
	
	public void Totem() {

		ItemMeta metaTotem = Totem.getItemMeta();
		metaTotem.setDisplayName(format("&4&l&nTotem Of Undying"));
		Totem.setItemMeta(metaTotem);
		Totem.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);

		ShapedRecipe Totemrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomTotem"), Recipes.Totem.clone());
		Totemrecipe.shape("EGE", "DND", "GEG");
		Totemrecipe.setIngredient('E', Material.EMERALD_BLOCK);
		Totemrecipe.setIngredient('G', Material.GOLD_BLOCK);
		Totemrecipe.setIngredient('N', Material.NETHER_STAR);
		Totemrecipe.setIngredient('D', Material.DIAMOND_BLOCK);
		Bukkit.addRecipe(Totemrecipe);
	}
	
	public void FlightTotem() {

		ItemMeta metaFlightTotem = FlightTotem.getItemMeta();
		metaFlightTotem.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		metaFlightTotem.setDisplayName(format("&4&l&nTotem Of Flight"));
		FlightTotem.setItemMeta(metaFlightTotem);
		FlightTotem.addUnsafeEnchantment(Enchantment.LOYALTY, 1);
		FlightTotem.getMaxStackSize();
		
		ShapedRecipe FlightTotemrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomFlightTotem"), Recipes.FlightTotem.clone());
		FlightTotemrecipe.shape("SES", "ENE", "SES");
		FlightTotemrecipe.setIngredient('E', Material.ELYTRA);
		FlightTotemrecipe.setIngredient('S', Material.NETHER_STAR);
		FlightTotemrecipe.setIngredient('N', Material.NETHERITE_BLOCK);
		Bukkit.addRecipe(FlightTotemrecipe);
	}
	
	public void MagnetHopper() {

		ItemMeta metaMagnetHopper = MagnetHopper.getItemMeta();
		metaMagnetHopper.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		metaMagnetHopper.setDisplayName(format("&4&l&nMagnet Hopper"));
		MagnetHopper.setItemMeta(metaMagnetHopper);
		MagnetHopper.getMaxStackSize();
		
		ShapedRecipe MagnetHopperrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomMagnetHopper"), Recipes.MagnetHopper.clone());
		MagnetHopperrecipe.shape("SNS", "NEN", "SNS");
		MagnetHopperrecipe.setIngredient('E', Material.NETHERITE_BLOCK);
		MagnetHopperrecipe.setIngredient('S', Material.NETHER_STAR);
		MagnetHopperrecipe.setIngredient('N', Material.ENDER_CHEST);
		Bukkit.addRecipe(MagnetHopperrecipe);
	}
	
	public void RandomBlock() {

		ItemMeta metaRandomBlock = RandomBlock.getItemMeta();
		metaRandomBlock.setDisplayName(format("&4&l&nRandom Block"));
		RandomBlock.setItemMeta(metaRandomBlock);
		RandomBlock.getMaxStackSize();
		
		ShapedRecipe RandomBlockrecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "CustomRandomBlock"), Recipes.RandomBlock.clone());
		RandomBlockrecipe.shape("EEE", "ENE", "EEE");
		RandomBlockrecipe.setIngredient('E', Material.LAPIS_BLOCK);
		RandomBlockrecipe.setIngredient('N', Material.CHEST);
		Bukkit.addRecipe(RandomBlockrecipe);
	}

	
	public static ItemStack customWrapper(Material mat) {
		return new ItemStack(mat) {
			@Override
			public int getMaxStackSize() {
				return 1;
			}
		};
	}
}
