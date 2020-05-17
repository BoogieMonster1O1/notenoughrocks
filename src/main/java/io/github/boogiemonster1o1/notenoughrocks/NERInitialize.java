package io.github.boogiemonster1o1.notenoughrocks;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.LogManager.getLogger;
import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.InitializationError;

public class NERInitialize implements ModInitializer {

    public static Logger LOGGER = getLogger();

    public static final String MOD_ID = "notenoughrocks";
    public static final String MOD_NAME = "NotEnoughRocks";

    @Override
    public void onInitialize() {
        boolean isInitialized = false;
        log(Level.INFO, "Initializing...");
        if(isInitialized) throw new InitializationError("NER Initializer Ran Twice! Shutting down...");
        NotEnoughRocks.INSTANCE.initialize();
        isInitialized = true;
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}