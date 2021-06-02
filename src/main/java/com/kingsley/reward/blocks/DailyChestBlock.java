package com.kingsley.reward.blocks;

import com.kingsley.reward.blocks.blockentities.DailyChestBlockEntity;
import com.kingsley.reward.registry.ModBlockEntityType;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.BlockView;

public class DailyChestBlock extends GenericIronChestBlock {

    public DailyChestBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                        .hardness(3.0F)
                        .resistance(3.0F)
                        .sounds(BlockSoundGroup.STONE)
                        .breakByTool(FabricToolTags.AXES, 0)
                        .requiresTool(),
                ExtraChestTypes.DAILY,
                () -> ModBlockEntityType.DAILY_CHEST);
    }


    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new DailyChestBlockEntity();
    }
}
