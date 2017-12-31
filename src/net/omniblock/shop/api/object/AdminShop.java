package net.omniblock.shop.api.object;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Sound;
import org.bukkit.block.Chest;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import com.gmail.filoghost.holographicdisplays.api.line.ItemLine;

import net.omniblock.network.handlers.base.sql.util.Resolver;
import net.omniblock.network.library.utils.TextUtil;
import net.omniblock.packets.util.Lists;
import net.omniblock.shop.ShopPlugin;
import net.omniblock.shop.api.config.ConfigType;
import net.omniblock.shop.api.config.variables.ItemsProtocol;
import net.omniblock.shop.api.config.variables.LineRegex;
import net.omniblock.shop.api.exception.SignLoadException;
import net.omniblock.shop.api.exception.SignRegexException;
import net.omniblock.shop.api.type.AdminShopItem;
import net.omniblock.shop.api.type.ShopActionType;
import net.omniblock.shop.api.type.ShopType;
import net.omniblock.shop.utils.ItemNameUtils;
import net.omniblock.survival.base.SurvivalBankBase;

public class AdminShop extends AbstractShop {

	protected ItemStack shopItem;
	
	protected Hologram hologram;
	protected ItemLine itemLine;
	protected Player cachePlayer;
	
	protected boolean destroyed = false;
	protected boolean savedShop = false;
	
	protected AdminShopStatus status = AdminShopStatus.WAITING_ITEM;
	
	public static List<Player> waitlistPlayers = Lists.newArrayList();
	
	public AdminShop(Sign sign, Chest chest, ShopActionType actionType, String uniqueID) {
		
		super(sign, chest, ShopType.ADMIN_SHOP, actionType, 0, "ADMIN", uniqueID);
		
		this.sign = sign;
		return;
		
	}

	@Override
	public void saveSign() {
		
		if(!this.sign.getLine(0).equalsIgnoreCase(LineRegex.CREATE_ADMIN_SHOP_UP))
			throw new SignRegexException(
					"El cartel ubicado en " +
					sign.getWorld().getName() + "," + sign.getX() + "," + sign.getY() + "," + sign.getZ() + " no " +
					"tiene el prefix de la tienda tipo administrador!");
		
		this.savedShop = true;
		
		return;
		
	}

	@Override
	public void destroySign() {
		
	}
	
	public void waitItem(Player player){
		waitlistPlayers.add(player);
		
		sign.setLine(1, TextUtil.format("Has click con el"));
		sign.setLine(2, TextUtil.format("tipo de item que"));
		sign.setLine(3, TextUtil.format(actionType == ShopActionType.BUY ? "vender�s" : "comprar�s") + ".");
		
		player.sendMessage(TextUtil.format("&c&lAdmin&eShop &b&l� &7Ahora debes hacer click derecho con el item que usar�s en la tienda."));
		
		new BukkitRunnable() {
			
			private int seconds = 60;
			
			@Override
			public void run() {
				
				seconds--;
				
				if(status == AdminShopStatus.CREATED || destroyed == true) {
					
					this.cancel();
					return;
					
				}
				
				if(!(sign.getBlock().getState() instanceof Sign)) {
					
					this.cancel();
					destroySign();
					return;
					
				}
					
				
				if(seconds - 1 == 0 || !player.isOnline()) {
					
					this.cancel();
					
					if(player.isOnline())
						player.sendMessage(TextUtil.format("&c&lAdmin&eShop &b&l� &cTu tienda se ha eliminado porque no has colocado el item que usar�as en ella."));
					
					waitlistPlayers.remove(player);
					
					destroySign();
					sign.getBlock().breakNaturally();
					return;
					
				}
				
				sign.setLine(0, TextUtil.format("&8&lESPERANDO &c" + seconds));
				sign.update(true);
				return;
				
			}
			
		}.runTaskTimer(ShopPlugin.getInstance(), 0l, 20l);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void clickEvent(PlayerInteractEvent e) {
		if(status == AdminShopStatus.WAITING_ITEM){
			
			if(waitlistPlayers.contains(e.getPlayer()) && e.getPlayer().equals(cachePlayer)){
				
				Player player = e.getPlayer();
				
				if(player.getItemInHand() == null) {
					player.sendMessage(TextUtil.format("&c&lAdmin&eShop &b&l� &cDebes tener el item que usar�s en la tienda puesto en tu mano.")); 
					return;
				}
				
				if(ItemsProtocol.isMaterialBlocked(player.getItemInHand().getType())) {
					player.sendMessage(TextUtil.format("&c&lAdmin&eShop &b&l� &cEl item que intentas usar en la tienda est� bloqueado.")); 
					return;
				}
				
				shopItem = e.getPlayer().getItemInHand();
				status = AdminShopStatus.CREATED;
				
				hologram = HologramsAPI.createHologram(ShopPlugin.getInstance(), chest.getLocation().clone().add(.5, 1.8, .5));
				itemLine = hologram.appendItemLine(shopItem);
				
				String third ="";
				if(actionType == ShopActionType.BUY){
					price = AdminShopItem.getBuyPriceByMaterial(shopItem.getType());
					third = "&a&l$&a" + price;
				}else{
					AdminShopItem.getSellPriceByMaterial(shopItem.getType());
					third = "&6&l$&6" + price;
				}
				
				sign.setLine(0, actionType.getFormattedAction());
				sign.setLine(1, Resolver.getLastNameByNetworkID(playerNetworkID));
				sign.setLine(2, TextUtil.format("&8" + ItemNameUtils.getMaterialName(shopItem.getType())));
				sign.setLine(3, TextUtil.format(third));
				sign.update(true);
				this.saveSign();
				
				waitlistPlayers.remove(e.getPlayer());
				
				e.getPlayer().sendMessage(TextUtil.format("&c&lAdmin&eShop &b&l� &aHas creado una tienda correctamente!"));
				e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 10);
				return;
				
			}
			
			
		}else{
			
			if(cachePlayer.equals(e.getPlayer()) || Resolver.getNetworkIDByName(e.getPlayer().getName()).equals(this.getPlayerNetworkID())) {
				
				cachePlayer = e.getPlayer();
				
				e.getPlayer().sendMessage(TextUtil.format("&c&lAdmin&eShop &b&l� &7No puedes &cutilizar&7 tus propias tiendas.")); 
				return;
				
			}
			
			boolean isSneaking = e.getPlayer().isSneaking();
			int money = SurvivalBankBase.getMoney(e.getPlayer());
			
			if(actionType == ShopActionType.BUY) {
				
				int buyPrice = AdminShopItem.getBuyPriceByMaterial(shopItem.getType());
				
				if(isSneaking){
					
					buyPrice *= 64;
					
					if(money>=buyPrice){
						
						if(e.getPlayer().getInventory().firstEmpty() == -1){
							
							e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7 No tienes espacio");
							
						}
						else{
							
							money -= buyPrice;
							SurvivalBankBase.setMoney(e.getPlayer(), money);
							shopItem.setAmount(64);
							e.getPlayer().getInventory().addItem(shopItem);
							e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7Has comprado &a"+shopItem.getAmount()+" &e"
									+shopItem.getItemMeta().getDisplayName()+" &7por &a$"+buyPrice);
							
						}
						
						return;
					}
					
					e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7No posees suficiente dinero.");
					return;
					
				}else{
					
					if(money>=buyPrice){
						
						if(e.getPlayer().getInventory().firstEmpty() == -1){
							
							e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7 No tienes espacio");
							
						}
						else{

							money -= buyPrice;
							SurvivalBankBase.setMoney(e.getPlayer(), money);
							e.getPlayer().getInventory().addItem(shopItem);
							e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7Has comprado &a"+shopItem.getAmount()+" &e"
									+shopItem.getItemMeta().getDisplayName()+" &7por &a$"+buyPrice);
							
						}
						return;
					}
					
					e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7No posees suficiente dinero.");
					return;
					
				}
			}
			else if(actionType == ShopActionType.SELL){
				
				int sellPrice = AdminShopItem.getSellPriceByMaterial(shopItem.getType());
				
				if(isSneaking){
					
					ItemStack[] inventory = e.getPlayer().getInventory().getContents();
					shopItem.setAmount(64);
					sellPrice *= 64;
					
					for(ItemStack item2Sell : inventory){
						
						if(item2Sell.isSimilar(shopItem) && item2Sell.getAmount() <= shopItem.getAmount()){
							e.getPlayer().getInventory().remove(shopItem);
							SurvivalBankBase.setMoney(e.getPlayer(), sellPrice);
							e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7Has vendido &a"+shopItem.getAmount()+" &e"
									+shopItem.getItemMeta().getDisplayName()+" &7por &a$"+sellPrice);
						}
						
					}
					e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7No tienes este item para vender.");
					
				}else{
					
					ItemStack[] inventory = e.getPlayer().getInventory().getContents();
					
					for(ItemStack item2Sell : inventory){
						
						if(item2Sell.isSimilar(shopItem)){
							e.getPlayer().getInventory().remove(shopItem);
							SurvivalBankBase.setMoney(e.getPlayer(), sellPrice);
							e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7Has vendido &a"+shopItem.getAmount()+" &e"
									+shopItem.getItemMeta().getDisplayName()+" &7por &a$"+sellPrice);
						}
						
					}
					e.getPlayer().sendMessage("&c&lAdmin&eShop &b&l� &7No tienes este item para vender.");
					
				}
			}
		}
		
		e.getPlayer().sendMessage("Esto es una complicacion :v");
	}

	@SuppressWarnings("deprecation")
	@Override
	public ShopLoadStatus loadSign(Player player) {
		
		if(ConfigType.SHOPDATA.getConfig().isSet("adminshop." + uniqueID)) {
			
			if(!ConfigType.SHOPDATA.getConfig().isSet("adminshop." + uniqueID + ".shopItem"))
				throw new SignLoadException("No se ha podido cargar el cartel '" + uniqueID + "' porque hace falta el shopItem en la configuraci�n.");
			
			if(!ConfigType.SHOPDATA.getConfig().isSet("adminshop." + uniqueID + ".actionType"))
				throw new SignLoadException("No se ha podido cargar el cartel '" + uniqueID + "' porque hace falta el actionType en la configuraci�n.");
			
			if(!ConfigType.SHOPDATA.getConfig().isSet("adminshop." + uniqueID + ".status"))
				throw new SignLoadException("No se ha podido cargar el cartel '" + uniqueID + "' porque hace falta el status en la configuraci�n.");
			
			shopItem = ConfigType.SHOPDATA.getConfig().getItemStack("adminshop." + uniqueID + ".shopItem");
			actionType = ShopActionType.valueOf(ConfigType.SHOPDATA.getConfig().getString("adminshop." + uniqueID + ".actionType"));
			status = AdminShopStatus.valueOf(ConfigType.SHOPDATA.getConfig().getString("adminshop." + uniqueID + ".status"));
			hologram = HologramsAPI.createHologram(ShopPlugin.getInstance(), chest.getLocation().clone().add(.5, 1.8, .5));
			itemLine = hologram.appendItemLine(shopItem);
			savedShop = true;
			
			if(status == AdminShopStatus.WAITING_ITEM) {
				
				this.destroySign();
				return ShopLoadStatus.CANNOT_LOAD;
				
			}
			
			String third ="";
			if(actionType == ShopActionType.BUY){
				price = AdminShopItem.getBuyPriceByMaterial(shopItem.getType());
				third = "&a&l$&a" + price;
			}else{
				AdminShopItem.getSellPriceByMaterial(shopItem.getType());
				third = "&6&l$&6" + price;
			}
			
			sign.setLine(0, actionType.getFormattedAction());
			sign.setLine(1, Resolver.getLastNameByNetworkID(playerNetworkID));
			sign.setLine(2, TextUtil.format("&n" + ItemNameUtils.getMaterialName(shopItem.getType()).firstAllUpperCased()));
			sign.setLine(3, TextUtil.format(third));
			sign.update(true);
			return ShopLoadStatus.LOADED;
			
		}
		
		if(player == null)
			return ShopLoadStatus.CANNOT_LOAD;
		
		if(!player.isOnline())
			return ShopLoadStatus.CANNOT_LOAD;
		
		if(waitlistPlayers.contains(player)) {
			this.sign.getBlock().breakNaturally();
			player.sendMessage(TextUtil.format("&c&lAdmin&eShop &b&l� &cDebes terminar de crear la tienda que estabas haciendo antes de hacer otra.")); 
			return ShopLoadStatus.CANNOT_LOAD;
		}
		
		this.cachePlayer = player;
		this.shopItem = player.getItemInHand();
		this.savedShop = true;
		this.status = AdminShopStatus.WAITING_ITEM;
		
		this.waitItem(player);
		this.saveSign();
		return ShopLoadStatus.LOADED;
	}

	@SuppressWarnings("serial")
	@Override
	public Map<String, Object> getConfigData() {
		return new HashMap<String, Object>(){{
			
			put("usershop." + uniqueID + ".location", sign.getWorld().getName() + "," + sign.getX() + "," + sign.getY() + "," + sign.getZ());
			put("usershop." + uniqueID + ".shopItem", shopItem);
			put("usershop." + uniqueID + ".savedShop", savedShop);
			put("usershop." + uniqueID + ".actionType", actionType);
			
		}};
	}
	
	public static enum AdminShopStatus {
		
		WAITING_ITEM,
		CREATED,
		
		;
		
	}
}
