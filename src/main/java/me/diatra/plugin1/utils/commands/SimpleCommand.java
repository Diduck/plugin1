package me.diatra.plugin1.utils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class SimpleCommand extends Command {

    private final CommandExecutor executor;

    public SimpleCommand(
            String name,
            String description,
            CommandExecutor executor,
            String... aliases
    ) {
        super(name, description, "", Arrays.asList(aliases));

        this.executor = executor;
    }
    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {

        return executor.onCommand(commandSender, this, s, strings);
    }
}
