package io.github.boogiemonster1o1.notenoughrocks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.fabric.api.network.PacketContext;
import net.minecraft.util.PacketByteBuf;
import net.minecraft.util.math.BlockPos;

import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.LOGGER;
import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.PLAY_DUST_PARTICLE;
import static net.minecraft.client.MinecraftClient.getInstance;
import static net.minecraft.particle.ParticleTypes.EXPLOSION;

@Environment(EnvType.CLIENT)
public class NERClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        LOGGER.info("Detected Client");
        ClientSidePacketRegistry.INSTANCE.register(PLAY_DUST_PARTICLE, this::playDustParticle);
    }

    public void playDustParticle(PacketContext context, PacketByteBuf bBuf) {
        BlockPos packetBlock = bBuf.readBlockPos();
        double x = packetBlock.getX();
        double y = packetBlock.getY();
        double z = packetBlock.getZ();
        getInstance().particleManager.addParticle(EXPLOSION, x, y, z, 0.0D, 0.1D, 0.0D);
        LOGGER.debug("Recieved Explosion Particle Packet");
    }
}
