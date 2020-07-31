package com.MrLubert.Custom;

import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Hopper;
import org.bukkit.entity.Item;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;


public class Magnet extends JavaPlugin implements Listener {
	
	  public Main plugin;
	  
	  public Magnet magnet;
	  
	    public Magnet(Main plugin){
	        this.plugin = plugin;
	        magnet = new Magnet(plugin);
	    }

	private String format(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);

	}
	
	public void Test() {
		String test = "Test";
		Bukkit.broadcastMessage(test);
		return;
	}
	
	public void onItem() {
        getServer().getScheduler().runTaskTimer(this, () -> {

            getServer().getWorlds().forEach((world) -> {

            	world.getEntitiesByClass(Item.class).forEach((item) -> {
    
                    Hopper hopper = getNearestHopper(item.getLocation(), 5);
                    if (hopper != null) {
                    	if (hopper.getCustomName().contains("&4&l&nMagnet Hopper")) {
                        Map<Integer, ItemStack> remainingItems = hopper.getInventory().addItem(item.getItemStack());
                        item.remove();
                        


                        remainingItems.forEach((i, stack) -> item.getWorld().dropItem(item.getLocation(), stack));


                        if (item.getItemStack().getType() != Material.AIR) {
                            hopper.getLocation().getWorld().playSound(hopper.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                            Bukkit.broadcastMessage(format("&0&l<&r&4CustomItems&0&l>&r" + " &4Item: " + item.getItemStack().getType()));
                        }
                    }
                    }
                });
            });
        }, 10 * 5, 10 * 5); 
    }

private static Hopper getNearestHopper(Location location, int maxRadius) {
    double nearestDistance = Double.MAX_VALUE;
    Hopper nearestHopper = null;

    for (int x = -(maxRadius); x <= maxRadius; x++) {
        for (int y = -(maxRadius); y <= maxRadius; y++) {
            for (int z = -(maxRadius); z <= maxRadius; z++) {
                Block block = location.getBlock().getRelative(x, y, z);
                BlockState blockState = block.getState();
                double distance = location.distanceSquared(block.getLocation());
                if (blockState instanceof Hopper && distance < nearestDistance) {
                    nearestDistance = distance;
                    nearestHopper = (Hopper) blockState;
                }
            }
        }
    }

    return nearestHopper;
}

}
