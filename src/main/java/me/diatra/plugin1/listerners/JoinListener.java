package me.diatra.plugin1.listerners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();

        //CLEAR PLAYER INVENTORY
        player.getInventory().clear();

        //ADD CHEST ITEM
        ItemStack itemMenu = new ItemStack(Material.COMPASS, 1);
        createItem(itemMenu, "§eMenu",true, new String[] {"","§7Click to Open",""});


        player.getInventory().setItem(4, itemMenu);


        player.updateInventory();

    }




    public void createItem(ItemStack item, String name, boolean _enchant, String[] lore){

        ItemMeta customMeta = item.getItemMeta();

        assert customMeta != null;

        customMeta.setDisplayName(name);

        if(lore != null){
            customMeta.setLore(Arrays.asList(lore));
        }

        if(_enchant){
            customMeta.addEnchant(Enchantment.DURABILITY, 1 ,true);
            customMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }

        customMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        item.setItemMeta(customMeta);




    }


}
