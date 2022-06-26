package com.github.jraams.spigot_plugin_template_vsc;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin
{
    @Override
    public void onEnable() {
        getLogger().info("TemplatePlugin starting");
    }

    @Override
    public void onDisable() {
        getLogger().info("TemplatePlugin shutting down");
    }
}
