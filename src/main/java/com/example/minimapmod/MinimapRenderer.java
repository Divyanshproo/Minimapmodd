package com.example.minimapmod;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;

public class MinimapRenderer {

    public static void init() {
        HudRenderCallback.EVENT.register(MinimapRenderer::onHudRender);
    }

    private static void onHudRender(MatrixStack matrices, float tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null || client.world == null) return;

        // Minimap size and position
        int size = 80;
        int x = 10;  // distance from left
        int y = 10;  // distance from top

        // Draw minimap background box (semi-transparent black)
        DrawableHelper.fill(matrices, x, y, x + size, y + size, 0x90000000);

        // Draw player dot in the center (white dot)
        int dotSize = 4;
        int centerX = x + size / 2;
        int centerY = y + size / 2;

        DrawableHelper.fill(matrices,
            centerX - dotSize / 2, centerY - dotSize / 2,
            centerX + dotSize / 2, centerY + dotSize / 2,
            0xFFFFFFFF
        );
    }
}