package io.github.boogiemonster1o1.notenoughrocks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.fabric.api.network.PacketContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.PacketByteBuf;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.boogiemonster1o1.notenoughrocks.NERInitialize.log;
import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.PLAY_DUST_PARTICLE;
import static net.minecraft.client.MinecraftClient.getInstance;

@Environment(EnvType.CLIENT)
public class NERClient implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger(NERClient.class);

    @Override
    public void onInitializeClient() {
        log(Level.INFO, "Detected Client");
        ClientSidePacketRegistry.INSTANCE.register(PLAY_DUST_PARTICLE, this::playDustParticle);
    }

    public void playDustParticle(PacketContext context, PacketByteBuf bBuf) {
        Vec3d playerPos = context.getPlayer().getPos();
        double x = playerPos.getX();
        double y = playerPos.getY();
        double z = playerPos.getZ();
        getInstance().particleManager.addParticle(ParticleTypes.EXPLOSION, x, y, z, 0.0D, 0.1D, 0.0D);
    }
}
