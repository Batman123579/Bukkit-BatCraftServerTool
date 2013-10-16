package batman123579.plugins.BatCraftServerTool;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin{
	
	// Start Up and turn off messages
	public void onEnable(){
		getLogger().info("Welcome!");
	}
	public void onDisable(){
		getLogger().info("It Turned Off!");
	}
	//commands
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args){
		if(sender instanceof Player){
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("about")) {
				player.sendMessage(ChatColor.GREEN + "This is the Excopia The Doom Network BatCraft Server (Such a long name)!");
				player.sendMessage(ChatColor.GREEN + "This was originally a server with my friends (now mods) to just build and have fun!");
				player.sendMessage(ChatColor.GREEN + "It has since turned into this HUGE minigames server! Enjoy! -Batman123579 (Th3BatHead)");
			}
		}
	return false;
	}
	
}
