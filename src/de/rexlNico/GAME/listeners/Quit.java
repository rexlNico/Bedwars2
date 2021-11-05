package de.rexlNico.GAME.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import de.rexlNico.GAME.GameStates.GameStateHandler;
import de.rexlNico.GAME.GameStates.LobbyState;
import de.rexlNico.GAME.Methodes.Var;

public class Quit implements Listener{

	@SuppressWarnings("static-access")
	@EventHandler
	public void on(PlayerQuitEvent e){
		
		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		
		Player p = e.getPlayer();
		
		
		e.setQuitMessage(null);
		
		out.writeUTF("Connect");
		out.writeUTF("bw");
		
		if(GameStateHandler.getGamestate() instanceof LobbyState){
			LobbyState ls = (LobbyState) GameStateHandler.getGamestate();
			Var.playing.remove(p);
			if(Var.noTeam.contains(p)) Var.noTeam.remove(p);
			if(Var.Blau.contains(p)) Var.Blau.remove(p);
			if(Var.Rot.contains(p)) Var.Rot.remove(p);
			if(Var.Gr�n.contains(p)) Var.Gr�n.remove(p);
			if(Var.Gelb.contains(p)) Var.Gelb.remove(p);
			
			
			Bukkit.broadcastMessage(Var.pr+"Der Spieler �a"+p.getDisplayName()+"�7 hat das Spiel verlassen. �r �8[�c"+Var.playing.size()+"�8/�c"+LobbyState.MAX_PLAYERS+"�8]");
			
			if(Var.playing.size() < LobbyState.MIN_PLAYERS){
				if(ls.getCountdown().isRunning){
					ls.getCountdown().stopCountDown();
					ls.getCountdown().idle();
				}
			}
		}else{
			if(Var.Blau.contains(p)) Var.Blau.remove(p);
			if(Var.Rot.contains(p)) Var.Rot.remove(p);
			if(Var.Gr�n.contains(p)) Var.Gr�n.remove(p);
			if(Var.Gelb.contains(p)) Var.Gelb.remove(p);
			if(Var.playing.contains(p)) Var.playing.remove(p);
		}
	}
	
}
