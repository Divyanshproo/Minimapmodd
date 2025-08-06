package com.example.minimapmod;

import net.fabricmc.api.ClientModInitializer;

public class MinimapModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MinimapRenderer.init();
    }
}
