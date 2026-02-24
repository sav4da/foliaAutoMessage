package io.github.sav4da.foliaautomessage;

import org.bukkit.plugin.java.JavaPlugin;

public final class AutoMessagePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("FoliaAutoMessage enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("FoliaAutoMessage disabled.");
    }
}