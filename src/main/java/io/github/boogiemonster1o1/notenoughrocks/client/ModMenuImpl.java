package io.github.boogiemonster1o1.notenoughrocks.client;

import io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks;
import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.TranslatableText;

@Environment(EnvType.CLIENT)
public class ModMenuImpl implements ModMenuApi {
    @Override
    public String getModId() {
        return NotEnoughRocks.MOD_ID;
    }

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return (ConfigScreenFactory<Screen>) screen -> new ConfigScreen();
    }

    static class ConfigScreen extends Screen {
        ConfigScreen() {
            super(new TranslatableText("gui.notenoughrocks.config.title"));
        }
    }
}
