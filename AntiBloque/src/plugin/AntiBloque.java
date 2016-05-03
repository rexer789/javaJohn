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

public class AntiBloque extends JavaPlugin implements Listener{
	
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
		
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e){
		Player p = e.getPlayer();
		Block b = e.getBlockPlaced();
		Material m = b.getType(); 
		if (b.getType() == Material.TNT){
			e.setCancelled(true);
			p.sendMessage("Perdona " + p.getName() + " esta prohibido poner tnt");
		}
		if (b.getType() == Material.CACTUS){
			e.setCancelled(true);
			p.sendMessage("Perdona " + p.getName() + " esta prohibido poner cactus");
		}
		if (b.getType() == Material.LEVER){
			e.setCancelled(true);
			p.sendMessage("Perdona " + p.getName() + " esta prohibido poner palancas");
		}
		if (b.getType() == Material.PUMPKIN){
			e.setCancelled(true);
			p.sendMessage("Perdona " + p.getName() + " esta prohibido poner calabazas");
			}
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e){
		Player p = e.getPlayer();
		Block b = e.getBlock();
		if (b.getType() == Material.TNT){
			e.setCancelled(true);
			p.sendMessage("Perdona "  + p.getName() + " esta prohibido romper tnt");
		} 
		if (b.getType() == Material.CACTUS){
			e.setCancelled(true);
			p.sendMessage("Perdona "  + p.getName() + " esta prohibido romper cactus");
		}
		if (b.getType() == Material.LEVER){
			e.setCancelled(true);
			p.sendMessage("Perdona "  + p.getName() + " esta prohibido romper palancas");
		}
		if (b.getType() == Material.PUMPKIN){
			e.setCancelled(true);
			p.sendMessage("Perdona "  + p.getName() + " esta prohibido romper calabazas");
			}
	}
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent e){
		Player p = e.getPlayer();
		String message = e.getMessage();
		
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e){
		Inventory i = e.getInventory();
		Player p = (Player)e.getWhoClicked();
		
	}
	
	
	@EventHandler
	public void onPlayerInteractEntity(PlayerInteractEntityEvent e){
		Player p = e.getPlayer();
		Entity entidad = e.getRightClicked();
		
	}
	
}
