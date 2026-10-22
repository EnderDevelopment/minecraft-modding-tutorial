package com.example.modding_learning;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class CodeEditorScreen extends Screen {
    public CodeEditorScreen() {
        super(Component.literal("Code Editor"));
    }

    @Override
    protected void init() {
        // Initialize code editor components
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        // Render code editor
        super.render(guiGraphics, mouseX, mouseY, partialTick);
    }
}
