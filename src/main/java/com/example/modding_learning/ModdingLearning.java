package com.example.modding_learning;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("modding_learning")
public class ModdingLearning {
    public ModdingLearning(IEventBus eventBus) {
        eventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Initialization code here
    }
}
