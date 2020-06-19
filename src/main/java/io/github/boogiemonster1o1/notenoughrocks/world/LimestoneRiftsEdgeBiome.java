package io.github.boogiemonster1o1.notenoughrocks.world;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.CRUSHED_LIMESTONE;
import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.LIMESTONE_BLOCK;
import static net.minecraft.block.Blocks.GRAVEL;

public class LimestoneRiftsEdgeBiome extends Biome {
    public LimestoneRiftsEdgeBiome() {
        super(new Settings().configureSurfaceBuilder(SurfaceBuilder.DEFAULT, new TernarySurfaceConfig(CRUSHED_LIMESTONE.getDefaultState(),LIMESTONE_BLOCK.getDefaultState(), GRAVEL.getDefaultState())).precipitation(Biome.Precipitation.RAIN).category(Category.DESERT).depth(0.24F).scale(0.5F).temperature(2F).downfall(0).parent(null).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).moodSound(BiomeMoodSound.CAVE).build()));

        this.addStructureFeature(StructureFeature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL)));
        this.addStructureFeature(StructureFeature.STRONGHOLD.configure(FeatureConfig.DEFAULT));
        DefaultBiomeFeatures.addLandCarvers(this);
        DefaultBiomeFeatures.addDefaultLakes(this);
        DefaultBiomeFeatures.addDungeons(this);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addMineables(this);
        DefaultBiomeFeatures.addDefaultOres(this);
        DefaultBiomeFeatures.addDefaultDisks(this);

        this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new Biome.SpawnEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(SpawnGroup.AMBIENT, new Biome.SpawnEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(EntityType.SLIME, 100, 4, 4));
    }
}
