package io.github.boogiemonster1o1.notenoughrocks.client;

import io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks;
import io.github.prospector.modmenu.api.ModMenuApi;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ModMenuImpl implements ModMenuApi {

    @Override
    @Deprecated
    public String getModId() {
        return NotEnoughRocks.MOD_ID;
    }
}
