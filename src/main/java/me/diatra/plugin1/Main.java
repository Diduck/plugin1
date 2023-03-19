package me.diatra.plugin1;

import me.diatra.plugin1.commands.CommandBroadcast;
import me.diatra.plugin1.utils.commands.SimpleCommand;
import org.bukkit.craftbukkit.v1_19_R1.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Ca marche !");

        createCommand(new SimpleCommand(
                "broadcast",
                "Commande de broadcast",
                new CommandBroadcast(),
                "bc"
        ));

    }

    private void createCommand(SimpleCommand command){
        CraftServer server = (CraftServer) getServer();
        server.getCommandMap().register(getName(), command);
    }

}
