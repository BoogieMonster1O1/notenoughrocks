package io.github.boogiemonster1o1.notenoughrocks.client;

import io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks;
import io.github.prospector.modmenu.api.ModMenuApi;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

public class ModMenuImpl implements ModMenuApi {
    @Override
    @Deprecated
    @SuppressWarnings("deprecation")
    public String getModId() {
        return NotEnoughRocks.MOD_ID;
    }
}
