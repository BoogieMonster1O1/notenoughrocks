package io.github.boogiemonster1o1.notenoughrocks;

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;
import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.*;
import static io.github.boogiemonster1o1.notenoughrocks.NERInitialize.log;
import static net.minecraft.util.registry.Registry.*;
import static net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback.event;

public enum NotEnoughRocks {
    INSTANCE;
    void initialize(){
        {
            // Blocks Go Here
            register(ITEM,new Identifier("notenoughrocks","limestone"),LIMESTONE_BLOCK_ITEM);
            register(BLOCK,new Identifier("notenoughrocks","limestone"),LIMESTONE_BLOCK);
            BIOME.forEach(LIMESTONE_BLOCK::handleBiome);
            log(Level.INFO,"Initialized Limestone...");
        }

        {
            // Items Go Here
        }

        {
            event(BIOME).register((i, identifier, biome) -> {
                LIMESTONE_BLOCK.handleBiome(biome);
            });
        }
    }

    public static class InitializationError extends Error{
        InitializationError(String message){
            super(message);
        }
    }
}
