package io.github.boogiemonster1o1.notenoughrocks.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.LIMESTONE_BLOCK;

@Mixin(FluidBlock.class)
public class FluidBlockMixin  {
    @Inject(at=@At(value = "INVOKE",ordinal = 1,target = "Lnet/minecraft/block/FluidBlock;playExtinguishSound(Lnet/minecraft/world/IWorld;Lnet/minecraft/util/math/BlockPos;)V"),method="receiveNeighborFluids")
    public void shouldHaveBeenCalledBlendinAndNotMixin(World world, BlockPos pos, BlockState state, CallbackInfoReturnable<Boolean> cir){
        int randomNumberGeneratedFromJavaDotUtilDotRandom = new Random().nextInt(10);
        if(randomNumberGeneratedFromJavaDotUtilDotRandom<1){
            world.setBlockState(pos, LIMESTONE_BLOCK.getDefaultState());
        }
    }
}
