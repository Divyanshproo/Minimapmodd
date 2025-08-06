package com.example.minimapmod;

import net.fabricmc.api.ModInitializer;

public class MinimapMod implements ModInitializer {
    public static final String MOD_ID = "minimapmod";

    @Override
    public void onInitialize() {
        System.out.println("MinimapMod initialized!");
        // In future: load config, initialize minimap logic
    }
}