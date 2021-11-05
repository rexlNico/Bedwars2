package de.rexlNico.GAME.GameStates;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import de.rexlNico.GAME.Main.Main;
import de.rexlNico.GAME.Methodes.Var;

public class EndState extends GameState{

	int TaskID;
	int sec = 16;
	
	@Override
	public void init() {
		
		TaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
			
			@Override
			public void run() {
				
				sec--;
				
				switch (sec) {
				case 15: case 10: case 5: case 4: case 3: case 2:case 1:
					Bukkit.broadcastMessage(Var.pr+"Der server startet in §e"+sec+" §7Sekunden neu.");
					break;

				case 0:
					Bukkit.getScheduler().cancelTask(TaskID);
					for(Player a : Bukkit.getOnlinePlayers()){
						a.kickPlayer("§4Ende");
					}
					
					for(int i = 0; i < Var.PlacedBlocks.size(); i++){
						Var.PlacedBlocks.get(i).getWorld().getBlockAt(Var.PlacedBlocks.get(i)).setType(Material.AIR);
					}
					Bukkit.reload();
					
					break;
					
				default:
					break;
				}
				
			}
		}, 0, 20*1);
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
