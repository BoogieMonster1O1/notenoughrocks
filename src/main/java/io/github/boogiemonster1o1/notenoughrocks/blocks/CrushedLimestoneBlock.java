package io.github.boogiemonster1o1.notenoughrocks.blocks;

import io.github.boogiemonster1o1.notenoughrocks.world.CrushedLimestoneDesertBiome;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.network.ServerSidePacketRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.server.PlayerStream;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;
import java.util.stream.Stream;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.FINE_DUST;
import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.PLAY_DUST_APPEARS_PARTICLE;

public class CrushedLimestoneBlock extends FallingBlock {
    public CrushedLimestoneBlock() {
        super(FabricBlockSettings.of(Material.AGGREGATE).resistance(2f).hardness(0.2f).breakByTool(FabricToolTags.SHOVELS));
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, Entity entity) {
        if(entity instanceof PlayerEntity){
            Random rand = new Random();
            int lucky = rand.nextInt(16);
            if(lucky == 1){
                if(!world.isClient()){
                    if(world.getBiome(pos) instanceof CrushedLimestoneDesertBiome){
                        if(entity.isSprinting()){
                            world.spawnEntity(new ItemEntity(world, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(FINE_DUST)));
                            Stream<PlayerEntity> players = PlayerStream.watching(world, pos);
                            PacketByteBuf clientData = new PacketByteBuf(Unpooled.buffer());
                            clientData.writeBlockPos(pos);
                            players.forEach(player -> ServerSidePacketRegistry.INSTANCE.sendToPlayer(player, PLAY_DUST_APPEARS_PARTICLE, clientData));
                        }
                    }
                }
            }
        }
    }
}
