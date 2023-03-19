package me.diatra.plugin1;

import me.diatra.plugin1.commands.CommandBroadcast;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Ca marche !");

        getCommand("broadcast").setExecutor(new CommandBroadcast());
    }
}
