package io.github.boogiemonster1o1.notenoughrocks.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.world.World;

@Environment(EnvType.CLIENT)
public class RockDustParticle extends SpriteBillboardParticle {
    protected RockDustParticle(World world, double d, double e, double f) {
        super(world, d, e, f);
    }

    protected RockDustParticle(World world, double d, double e, double f, double g, double h, double i) {
        super(world, d, e, f, g, h, i);
    }

    @Override
    public ParticleTextureSheet getType() {
        return null;
    }
}
