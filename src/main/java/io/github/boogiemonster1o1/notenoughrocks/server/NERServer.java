package io.github.boogiemonster1o1.notenoughrocks.server;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.Environment;

import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.LOGGER;
import net.fabricmc.api.EnvType;

@Environment(EnvType.SERVER)
public class NERServer implements DedicatedServerModInitializer {

    @Override
    public void onInitializeServer() {
        LOGGER.info("Detected Dedicated server");
    }
}
