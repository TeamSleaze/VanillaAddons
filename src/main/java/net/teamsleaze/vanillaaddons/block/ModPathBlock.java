package net.teamsleaze.vanillaaddons.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class ModPathBlock extends DirtPathBlock {

    public BlockState transformationBlockState;

    public ModPathBlock(Settings settings, BlockState blockToTransformTo) {
        super(settings);
        this.transformationBlockState = blockToTransformTo;
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return !this.getDefaultState().canPlaceAt(ctx.getWorld(), ctx.getBlockPos()) ? Block.pushEntitiesUpBeforeBlockChange(this.getDefaultState(), transformationBlockState, ctx.getWorld(), ctx.getBlockPos()) : super.getPlacementState(ctx);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.setBlockState(pos, pushEntitiesUpBeforeBlockChange(state, transformationBlockState, world, pos));
    }

    /*
    PATH_STATES = Maps.newHashMap((new ImmutableMap.Builder())
            .put(Blocks.GRASS_BLOCK, Blocks.DIRT_PATH.getDefaultState())
            .put(Blocks.DIRT, Blocks.DIRT_PATH.getDefaultState())
            .put(Blocks.PODZOL, Blocks.DIRT_PATH.getDefaultState())
            .put(Blocks.COARSE_DIRT, Blocks.DIRT_PATH.getDefaultState())
            .put(Blocks.MYCELIUM, Blocks.DIRT_PATH.getDefaultState())
            .put(Blocks.ROOTED_DIRT, Blocks.DIRT_PATH.getDefaultState())
            .build()
    );
    */
}
