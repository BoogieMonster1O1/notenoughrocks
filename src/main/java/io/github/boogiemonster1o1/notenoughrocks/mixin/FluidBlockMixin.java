package io.github.boogiemonster1o1.notenoughrocks.mixin;

import io.github.boogiemonster1o1.notenoughrocks.Elements;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;

@Mixin(FluidBlock.class)
public class FluidBlockMixin  {
    @Shadow
    private void playExtinguishSound(IWorld world, BlockPos pos){}

    @Inject(at=@At(value = "INVOKE",ordinal = 1,target = "Lnet/minecraft/block/FluidBlock;playExtinguishSound(Lnet/minecraft/world/IWorld;Lnet/minecraft/util/math/BlockPos;)V"),method="receiveNeighborFluids",cancellable = true)
    public void shouldHaveBeenCalledBlendinAndNotMixin(World world, BlockPos pos, BlockState state, CallbackInfoReturnable<Boolean> cir){
        int randomNumberGeneratedFromJavaDotUtilDotRandom = new Random().nextInt(10);
        if(randomNumberGeneratedFromJavaDotUtilDotRandom<1){
            world.setBlockState(pos, LIMESTONE_BLOCK.getDefaultState());
        }
    }
}
