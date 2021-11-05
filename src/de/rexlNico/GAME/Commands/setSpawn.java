package de.rexlNico.GAME.Commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.rexlNico.GAME.Methodes.BlockFactory;
import de.rexlNico.GAME.Methodes.Factory;
import de.rexlNico.GAME.Methodes.Var;

public class setSpawn implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			Player p = (Player)sender;
			if(p.hasPermission(Var.perms+"set")){
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("Lobby")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Lobby");
						p.sendMessage(Var.pr+"Du hast den Spawn f�r die �eLobby �7gesetzt.");
					}else if(args[0].equalsIgnoreCase("Spec")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Spec");
						p.sendMessage(Var.pr+"Du hast den Spawn f�r die �eSpectator �7gesetzt.");	
					}else if(args[0].equalsIgnoreCase("Rot")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Rot");
						p.sendMessage(Var.pr+"Du hast den Spawn f�r die �4Rot �7gesetzt.");	
					}else if(args[0].equalsIgnoreCase("Blau")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Blau");
						p.sendMessage(Var.pr+"Du hast den Spawn f�r die �1Blau �7gesetzt.");	
					}else if(args[0].equalsIgnoreCase("Gr�n")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Gr�n");
						p.sendMessage(Var.pr+"Du hast den Spawn f�r die �aGr�n �7gesetzt.");	
					}else if(args[0].equalsIgnoreCase("Gelb")){
						Factory.CreateConfigLocation(p.getLocation(), Var.cfg, Var.file, "Spawn.Gelb");
						p.sendMessage(Var.pr+"Du hast den Spawn f�r die �eGelb �7gesetzt.");	
					}else{
						p.sendMessage(Var.error+"set <Lobby/Spec/Rot/Blau/Gr�n/Rot>");
					}
				}else if(args.length == 2){
					if(args[0].equalsIgnoreCase("Bed")){
						if(args[1].equalsIgnoreCase("Rot")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Bed.Rot");
							p.sendMessage(Var.pr+"Du hast das Bett f�r �4Rot �7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Gelb")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Bed.Gelb");
							p.sendMessage(Var.pr+"Du hast das Bett f�r �eGelb �7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Gr�n")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Bed.Gr�n");
							p.sendMessage(Var.pr+"Du hast das Bett f�r �aGr�n �7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Blau")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Bed.Blau");
							p.sendMessage(Var.pr+"Du hast das Bett f�r �1Blau �7gesetzt.");	
						}else{
							p.sendMessage(Var.error+"set <Bed> [Rot/Blau/Gr�n/Gelb]");
						}
					}else if(args[0].equalsIgnoreCase("shop")){
						if(args[1].equalsIgnoreCase("Rot")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Shop.Rot");
							p.sendMessage(Var.pr+"Du hast den Shop f�r �4Rot �7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Gelb")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Shop.Gelb");
							p.sendMessage(Var.pr+"Du hast den Shop f�r �eGelb �7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Gr�n")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Shop.Gr�n");
							p.sendMessage(Var.pr+"Du hast den Shop f�r �aGr�n �7gesetzt.");	
						}else if(args[1].equalsIgnoreCase("Blau")){
							BlockFactory.CreateConfigLocation(p.getLocation().getBlock().getLocation(), Var.cfg, Var.file, "Shop.Blau");
							p.sendMessage(Var.pr+"Du hast den Shop f�r �1Blau �7gesetzt.");	
						}else{
							p.sendMessage(Var.error+"set <Shop> [Rot/Blau/Gr�n/Gelb]");
						}
					}else{
						p.sendMessage(Var.error+"set <Bed/Shop> [Rot/Blau/Gr�n/Gelb]");
					}
				}else{
					p.sendMessage(Var.error+"set [<Lobby/Spec/Rot/Blau/Gr�n/Rot>/<Bed/shop>] [Rot/Blau/Gr�n/Gelb]");
				}
			}else{
				p.sendMessage(Var.noperm);
			}
		}else{
			sender.sendMessage(Var.console);
		}
		return false;
	}

}
