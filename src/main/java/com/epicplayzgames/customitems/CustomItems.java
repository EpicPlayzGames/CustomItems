package com.epicplayzgames.customitems;

import com.epicplayzgames.customitems.lib.commands.Commandpickaxe;
import com.epicplayzgames.customitems.lib.commands.Commandshovel;
import com.epicplayzgames.customitems.lib.commands.Commandsword;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CustomItems extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("Enabled CustomItems by EpicPlayzGames!");
        Objects.requireNonNull(getCommand("sword")).setExecutor(new Commandsword());
        Objects.requireNonNull(getCommand("pickaxe")).setExecutor(new Commandpickaxe());
        Objects.requireNonNull(getCommand("shovel")).setExecutor(new Commandshovel());

    }

    @Override
    public void onDisable() {

        System.out.println("Disabled CustomItems by EpicPlayzGames!");

    }
}
