package io.github.boogiemonster1o1.notenoughrocks.structure;

import io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.structure.*;
import net.minecraft.structure.processor.BlockIgnoreStructureProcessor;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.AbstractTempleFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

import java.util.List;
import java.util.Random;

import static io.github.boogiemonster1o1.notenoughrocks.structure.StoneWorkshopStructure.StoneWorkshopGenerator.addParts;

public class StoneWorkshopStructure extends AbstractTempleFeature<DefaultFeatureConfig> {
    public StoneWorkshopStructure() {
        super(DefaultFeatureConfig::deserialize);
    }

    @Override
    protected int getSeedModifier() {
        return 0;
    }

    @Override
    public StructureStartFactory getStructureStartFactory() {
        return StoneWorkshopStart::new;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getRadius() {
        return 0;
    }

    public static class StoneWorkshopStart extends StructureStart {
        public StoneWorkshopStart(StructureFeature<?> feature, int chunkX, int chunkZ, BlockBox box, int references, long l) {
            super(feature, chunkX, chunkZ, box, references, l);
        }

        @Override
        public void generateStructure(IWorld world, ChunkGenerator<?> chunkGenerator, Random random, BlockBox blockBox, ChunkPos chunkPos) {
            super.generateStructure(world, chunkGenerator, random, blockBox, chunkPos);
        }

        @Override
        public void initialize(ChunkGenerator<?> chunkGenerator, StructureManager structureManager, int x, int z, Biome biome) {
            DefaultFeatureConfig defaultFeatureConfig = chunkGenerator.getStructureConfig(biome,NotEnoughRocks.STONE_WORKSHOP_FEATURE);
            int xx = x * 16;
            int zz = z * 16;
            BlockPos startingPos = new BlockPos(xx, 0, zz);
            BlockRotation rotation = BlockRotation.values()[this.random.nextInt(BlockRotation.values().length)];
            addParts(structureManager,startingPos,rotation,this.children,this.random,defaultFeatureConfig);
            this.setBoundingBoxFromChildren();
        }
    }
    public static class StoneWorkshopGenerator{
        public static final Identifier id = new Identifier("notenoughrocks","stone_workshop/stone_workshop");

        public static void addParts(StructureManager structureManager, BlockPos blockPos, BlockRotation rotation, List<StructurePiece> list_1, Random random, DefaultFeatureConfig defaultFeatureConfig) {
            list_1.add(new StoneWorkshopGenerator.Piece(structureManager, id, blockPos, rotation));
        }

        public static class Piece extends SimpleStructurePiece{

            private final BlockRotation rotation;
            private final Identifier identifier;

            public Piece(StructureManager structureManager, Identifier identifier, BlockPos pos, BlockRotation rotation){
                super(NotEnoughRocks.STONE_WORKSHOP_PIECE,16);
                this.rotation = rotation;
                this.identifier = identifier;
                this.pos = pos;
                this.setStructureData(structureManager);
            }

            public Piece(StructureManager structureManager, CompoundTag tag) {
                super(NotEnoughRocks.STONE_WORKSHOP_PIECE,tag);
                this.identifier = new Identifier(tag.getString("Template"));
                this.rotation = BlockRotation.valueOf(tag.getString("Rot"));
                this.setStructureData(structureManager);
            }

            @Override
            public void toNbt(CompoundTag tag) {

            }

            public void setStructureData(StructureManager structureManager) {
                Structure structure_1 = structureManager.getStructureOrBlank(this.identifier);
                StructurePlacementData structurePlacementData_1 = (new StructurePlacementData()).setRotation(this.rotation).setMirrored(BlockMirror.NONE).setPosition(pos).addProcessor(BlockIgnoreStructureProcessor.IGNORE_STRUCTURE_BLOCKS);
                this.setStructureData(structure_1, this.pos, structurePlacementData_1);
            }

            @Override
            public boolean generate(IWorld world, ChunkGenerator<?> generator, Random random, BlockBox box, ChunkPos pos) {
                int yHeight = world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, this.pos.getX() + 8, this.pos.getZ() + 8);
                this.pos = this.pos.add(0, yHeight - 1, 0);
                return super.generate(world, generator, random, box, pos);
            }

            @Override
            public void handleMetadata(String metadata, BlockPos pos, IWorld world, Random random, BlockBox boundingBox) {}
        }
    }
}
