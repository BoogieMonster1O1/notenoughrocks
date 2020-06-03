package io.github.boogiemonster1o1.notenoughrocks.client;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.Level;

import static io.github.boogiemonster1o1.notenoughrocks.NERInitialize.log;

public class NERClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        log(Level.INFO,"Detected Client");
    }
}
