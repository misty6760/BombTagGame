package org.comma6760.BombTagPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class BombTagPlugin extends JavaPlugin {
    private BombGameManager manager;

    @Override
    public void onEnable() {
        manager = new BombGameManager(this);
        getCommand("bombstart").setExecutor(new BombStartCommand(manager));
        getServer().getPluginManager().registerEvents(new PlayerAttackListener(manager), this);
        getServer().getPluginManager().registerEvents(new BlockPlaceListener(), this);
    }
}
