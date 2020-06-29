package io.github.boogiemonster1o1.notenoughrocks.blocks;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.network.ServerSidePacketRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.server.PlayerStream;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import java.util.stream.Stream;

import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.PLAY_GLASS_BREAK_PARTICLE;

public class ReinforcedGlassBlock extends Block {
    public ReinforcedGlassBlock(MaterialColor color) {
        super(FabricBlockSettings.of(new Material(color,false,true,false,false,false,false, PistonBehavior.IGNORE)).breakByTool(FabricToolTags.PICKAXES).breakByHand(false).breakByTool(FabricToolTags.PICKAXES,2).requiresTool().resistance(15.0f).hardness(10.0f).nonOpaque());
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        if(!world.isClient()){
            Stream<PlayerEntity> players = PlayerStream.watching((ServerWorld)world,pos);
            PacketByteBuf clientData = new PacketByteBuf(Unpooled.buffer());
            clientData.writeBlockPos(pos);
            players.forEach(player -> ServerSidePacketRegistry.INSTANCE.sendToPlayer(player,PLAY_GLASS_BREAK_PARTICLE,clientData));
        }
    }
}
