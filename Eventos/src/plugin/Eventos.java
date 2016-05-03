package plugin;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Eventos extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {
		if(command.getName().equalsIgnoreCase("comando")) {

			return true;
		}
		return false;
	}

	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e){
		Player p = e.getPlayer();
		int x = p.getLocation().getBlockX();
		int y = p.getLocation().getBlockY();
		int z = p.getLocation().getBlockZ();
		//p.sendMessage(p.getName() + " se ha movido" );
	}

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e){
		Player p = e.getPlayer();
		Block b = e.getBlockPlaced();
		Material m = b.getType(); 
		p.sendMessage(p.getName() + " ha puesto un bloke");
		if (b.getType() == Material.TNT){
			//esto hace que se cancele un evento
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e){
		Player p = e.getPlayer();
		Block b = e.getBlock();
		//que solo te ponga el mensaje si el blocke es roka
		if (b.getType() == Material.STONE){
			p.sendMessage(p.getName() + " ha roto un bloke de piedra");	
		}
		if (b.getType() == Material.DIRT){
			//esto hace que se cancele un evento
			e.setCancelled(true);
		}

	}

	@EventHandler
	public void onPlayerChat(PlayerChatEvent e){
		Player p = e.getPlayer();
		String message = e.getMessage();
		p.sendMessage(p.getName() + " ha usado el chat");
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e){
		Inventory i = e.getInventory();
		Player p = (Player)e.getWhoClicked();
		p.sendMessage(p.getName() + " ha interactuado con su inventario");
	}


	@EventHandler
	public void onPlayerInteractEntity(PlayerInteractEntityEvent e){
		Player p = e.getPlayer();
		Entity entidad = e.getRightClicked();
		p.sendMessage(p.getName() + " ha interactuado con una entidad");
	}

}
