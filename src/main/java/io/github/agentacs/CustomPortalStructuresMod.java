package io.github.agentacs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("portalstructures") // Updated modID
public class CustomPortalStructuresMod {

    public CustomPortalStructuresMod() {
        // Register the setup method for mod initialization
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the clientSetup method for client-specific setup
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Common setup tasks here
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Client-specific setup tasks here
    }

    // Add any additional methods or logic for your mod here
}