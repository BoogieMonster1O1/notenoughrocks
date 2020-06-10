package io.github.boogiemonster1o1.notenoughrocks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.fabric.api.network.PacketContext;
import net.minecraft.util.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.boogiemonster1o1.notenoughrocks.NERInitialize.log;
import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.PLAY_DUST_PARTICLE;
import static net.minecraft.client.MinecraftClient.getInstance;
import static net.minecraft.particle.ParticleTypes.EXPLOSION;

@Environment(EnvType.CLIENT)
public class NERClient implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger(NERClient.class);

    @Override
    public void onInitializeClient() {
        log(Level.INFO, "Detected Client");
        ClientSidePacketRegistry.INSTANCE.register(PLAY_DUST_PARTICLE, this::playDustParticle);
    }

    public void playDustParticle(PacketContext context, PacketByteBuf bBuf) {
        BlockPos packetBlock = bBuf.readBlockPos();
        double x = packetBlock.getX();
        double y = packetBlock.getY();
        double z = packetBlock.getZ();
        getInstance().particleManager.addParticle(EXPLOSION, x, y, z, 0.0D, 0.1D, 0.0D);
        LOGGER.info("Recieved Particle Packet");
    }
}
