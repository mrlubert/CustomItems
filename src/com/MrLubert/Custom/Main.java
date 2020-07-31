package com.MrLubert.Custom;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.projectiles.ProjectileSource;



public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		
		getLogger().info("&2Plugin Enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		super.onEnable();

		Recipes Items = new Recipes();
		Items.createRecipe();
	}

	@Override
	public void onDisable() {

		getLogger().info("Plugin Disabled!");
		
	}
	
	//public Main plugin;
	//public Main(Main plugin) {
	//	this.plugin = plugin;
	//}

	private String format(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);

	}

	public static Main getPlugin() {
		return JavaPlugin.getPlugin(Main.class);
	}

	// player.getInventory().getItemInMainHand()

	@EventHandler
	public void onPlayerClicks(PlayerInteractEvent event) {
		if((event.getAction().equals(Action.LEFT_CLICK_AIR))){
				fly(event);
	}
	}

	
	public void fly(PlayerInteractEvent event) {
		 Player player = event.getPlayer();
		 if (player.getInventory().getItemInMainHand().getType() ==  Material.TOTEM_OF_UNDYING) {
			 if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.LOYALTY)) {
				 if (player.getAllowFlight() == false) {
						player.setAllowFlight(true);
						player.sendMessage(format("&0&l<&r&4CustomItems&0&l>&r" + " &4Flight Enabled!"));
						return;
					}
						player.setAllowFlight(false);
						player.sendMessage(format("&0&l<&r&4CustomItems&0&l>&r" + " &4Flight Disabled!"));
						return;
			    }
		  }
	}
	
	@EventHandler
	public void onItemRename(InventoryClickEvent e) {
		if (e.getInventory() instanceof AnvilInventory)
			if (e.getInventory().contains(Material.TOTEM_OF_UNDYING) || e.getInventory().contains(Material.HOPPER)) {
				if (e.getCurrentItem().getItemMeta().getDisplayName().contains("&4&l&nTotem Of Flight") || e.getCurrentItem().getItemMeta().getDisplayName().contains("&4&l&nMagnet Hopper")) {	
				if (e.getClickedInventory() == e.getInventory() && e.getSlot() == 2)
					e.setCancelled(true);
			}
			}
	}

	@EventHandler
	public void onRename(InventoryClickEvent e) {
		if (e.getInventory() instanceof AnvilInventory)
			if (e.getInventory().contains(Material.TOTEM_OF_UNDYING) || e.getInventory().contains(Material.HOPPER)) {
				if (e.getCurrentItem().getItemMeta().getDisplayName().contains("&4&l&nTotem Of Flight") || e.getCurrentItem().getItemMeta().getDisplayName().contains("&4&l&nMagnet Hopper")) {	
				if (e.getClickedInventory() == e.getInventory() && e.getSlot() == 1)
					e.setCancelled(true);
			}
			}
	}
	
	@SuppressWarnings({ "deprecation", "static-access" })
	@EventHandler
	public void onArrowPickUp(PlayerPickupArrowEvent e) {
		if (e.getPlayer().getGameMode() == e.getPlayer().getGameMode().SURVIVAL) {
			if (e.getArrow().getName().contains("INFINITE")) {
				e.setCancelled(true);
			}
			
			else if (e.getArrow().getName() != "INFINITE") {
				e.setCancelled(false);
			}
		}
		if (e.getPlayer().getGameMode() == e.getPlayer().getGameMode().CREATIVE) {
			if (e.getArrow().getName().contains("INFINITE")) {
				e.getArrow().remove();
				e.setCancelled(false);
			}
			
			else if (e.getArrow().getName() != "INFINITE") {
				e.setCancelled(false);
			}
		}
			
	}
	
		@EventHandler
	    public void onEntityMultiShoot(EntityShootBowEvent e) {
			if (e.getBow().getType() == Material.CROSSBOW) {
				Entity proj = e.getProjectile();
		        if (proj instanceof Arrow) {
		            Arrow arrow = (Arrow) proj;
		            ProjectileSource shooter = arrow.getShooter();
		            if (shooter != null) {
		                if (shooter instanceof Player) {
				if (e.getBow().getItemMeta().hasEnchant(Enchantment.MULTISHOT) && e.getBow().getItemMeta().hasEnchant(Enchantment.ARROW_INFINITE)) {
                    if (shooter instanceof Player) {
             	   Player player = (Player) shooter;
             	   arrow.remove();
             	   arrow.remove();
             	   arrow.remove();
             	   player.getInventory().getItemInMainHand().removeEnchantment(Enchantment.MULTISHOT);
             	   player.sendMessage(format("&0&l<&r&4CustomItems&0&l>&r" + " &4Removed Multi Shot, Not Compatible."));
             	  return;
                    }
	                    return;
	                    }
	                  }
	                }
	              }
	            }
		}
		
		@EventHandler
	    public void onEntityShoot(EntityShootBowEvent e) {

			if (e.getBow().getType() == Material.CROSSBOW) {
				Entity proj = e.getProjectile();
		        if (proj instanceof Arrow) {
		            Arrow arrow = (Arrow) proj;
		            ProjectileSource shooter = arrow.getShooter();
		            if (shooter != null) {
		            	if (shooter instanceof Player) {

		                        Player player = (Player) shooter;
                  if (e.getBow().getItemMeta().hasEnchant(Enchantment.ARROW_INFINITE)) {    

                	  if (arrow.getBasePotionData().getType() != null) {
                	   player.getInventory().addItem(new ItemStack(Material.ARROW, 1));
                	  }
	                    arrow.setCustomName("INFINITE");
	                    arrow.setCustomNameVisible(false);
	                    return;
	                	} 
	                    }
	                  }
	                }
	              }
	            }  

	@SuppressWarnings("deprecation")
	@EventHandler
    public void onEntityShoot1(EntityShootBowEvent e) {
		if (e.getBow().getType() == Material.CROSSBOW) {
		if (e.getBow().getItemMeta().hasEnchant(Enchantment.RIPTIDE)) {
        Entity proj = e.getProjectile();
        if (proj instanceof Arrow) {
            Arrow arrow = (Arrow) proj;
            ProjectileSource shooter = arrow.getShooter();
            if (shooter != null) {
                if (shooter instanceof Player) {
                	for (int i = 1; i <= 3; i++) {
                    Player player = (Player) shooter;
                    arrow.remove(); 
                    EnderPearl Thing = (EnderPearl) player.getWorld().spawn(player.getLocation(), EnderPearl.class);
                    Thing.setVelocity(player.getLocation().getDirection().multiply(i));
                    Thing.setPassenger(player);
                    e.setCancelled(true); 
                }
            }
        }
        }
      }
  }
}
}
	

