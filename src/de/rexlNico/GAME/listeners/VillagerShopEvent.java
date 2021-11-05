package de.rexlNico.GAME.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.rexlNico.GAME.Methodes.VillagerShop;

public class VillagerShopEvent implements Listener{
	
	@EventHandler
	public void on(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals("§6Shop")){
			
			if(e.getCurrentItem().equals(Material.STAINED_CLAY) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlöcke")){
				p.openInventory(VillagerShop.Blöcke());
			}else if(e.getCurrentItem().equals(Material.DIAMOND_SWORD) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eSchwerter")){
				p.openInventory(VillagerShop.Schwerter());
			}else if(e.getCurrentItem().equals(Material.BOW) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBögen")){
				p.openInventory(VillagerShop.Bögen());
			}else if(e.getCurrentItem().equals(Material.IRON_CHESTPLATE) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eRüstung")){
				p.openInventory(VillagerShop.Rüstung());
			}else if(e.getCurrentItem().equals(Material.WOOD_PICKAXE) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eSpitzhacken")){
				p.openInventory(VillagerShop.Spitzhacken());
			}else if(e.getCurrentItem().equals(Material.COOKED_BEEF) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eEssen")){
				p.openInventory(VillagerShop.Essen());
			}else if(e.getCurrentItem().equals(Material.EYE_OF_ENDER) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Extras")){
				p.openInventory(VillagerShop.Extras());
				
			}else if(e.getCurrentItem().getType().equals(Material.STAINED_CLAY) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlock1")){
				
				if(p.isSneaking()){
					
					int z = 0;
					
					for(int i = 0; i < p.getInventory().getSize(); i++){
						
						
						for(int i2 = 0; i2 <= p.getInventory().getItem(i).getAmount(); i2++){
							
							if(z == 64){
								z = 0;
								return;
							}
							
							if(p.getInventory().getItem(i).getType().equals(Material.CLAY_BRICK)){
								if(p.getInventory().getItem(i).getAmount() >= 1){
									p.getInventory().addItem(new ItemStack(Material.STAINED_CLAY));
									z++;
								}
							}
							
						}
					}
					
				}else{
					
				}
				
			}
			
		    else if(e.getCurrentItem().getType().equals(Material.ENDER_STONE) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlock2")){
				
				if(p.isSneaking()){
					
					
				}else{
					
				}
				
			}
		
	       else if(e.getCurrentItem().getType().equals(Material.IRON_BLOCK) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlock3")){
		
		     if(p.isSneaking()){
			
		    }else{
			
		}
		
	}
			
		else if(e.getCurrentItem().getType().equals(Material.GLASS) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlock4")){
			
			if(p.isSneaking()){
				
			}else{
				
			}
			
		}
		else if(e.getCurrentItem().getType().equals(Material.NETHER_BRICK_STAIRS) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlock5")){
			
			if(p.isSneaking()){
				
			}else{
				
			}
			
		}
		else if(e.getCurrentItem().getType().equals(Material.CHEST) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlock6")){
			
			if(p.isSneaking()){
				
			}else{
				
			}
			
		}
		else if(e.getCurrentItem().getType().equals(Material.ENDER_CHEST) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§eBlock7")){
			
			if(p.isSneaking()){
				
			}else{
				
			}
			
		}
			
		}
	}
	
}
