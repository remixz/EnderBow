package me.zachbruggeman.enderbow;

import org.bukkit.plugin.java.JavaPlugin;

public class EnderBowPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        EnderBowRecipes recipes = new EnderBowRecipes();
        this.getServer().addRecipe(recipes.EnderBow());
        this.getServer().addRecipe(recipes.InfiniteEnderBow());
        this.getServer().getPluginManager().registerEvents(new EnderBowListener(this), this);
    }

    @Override
    public void onDisable() {

    }


}
