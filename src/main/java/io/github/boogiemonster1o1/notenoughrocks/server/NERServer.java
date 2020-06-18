package io.github.boogiemonster1o1.notenoughrocks.server;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.Environment;

import static io.github.boogiemonster1o1.notenoughrocks.NERInitialize.LOGGER;
import static net.fabricmc.api.EnvType.SERVER;

@Environment(SERVER)
public class NERServer implements DedicatedServerModInitializer {

    @Override
    public void onInitializeServer() {
        LOGGER.info("Detected server");
    }
}
