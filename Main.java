package com.dalton.container;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/////////////////////////////////////
// By installing this plugin you   //
// accept that                     //
// 1. You may not claim this       //
// plugin as your own              //
//                                 //
// 2. You may not decompile this   //
// plugin AT ALL                   //
/////////////////////////////////////

public class Main extends JavaPlugin {



    //main plugin initiator
     @Override
    public void onEnable() {
         //startup message
         Bukkit.getLogger().info("Split Second Rankup has been started!");
     }
     //main plugin de-initiation
     @Override
    public void onDisable() {

     }
}
