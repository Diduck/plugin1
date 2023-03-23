package me.diatra.plugin1;

import me.diatra.plugin1.commands.CommandBroadcast;
import me.diatra.plugin1.listerners.JoinListener;
import me.diatra.plugin1.utils.commands.SimpleCommand;
import org.bukkit.craftbukkit.v1_19_R1.CraftServer;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Ca marche !");

        //CREATION D'UNE COMMANDE :

        createCommand(new SimpleCommand(
                "broadcast",
                "Commande de broadcast",
                new CommandBroadcast(),
                "bc"
        ));

        // EVENEMENT SUPPLEMENTAIRE

        getServer().getPluginManager().registerEvents((Listener) new JoinListener(), this);



    }

    private void createCommand(SimpleCommand command){
        CraftServer server = (CraftServer) getServer();
        server.getCommandMap().register(getName(), command);
    }

}
