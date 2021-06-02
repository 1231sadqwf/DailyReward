package com.kingsley.reward.registry;

import com.kingsley.reward.Reward;
import com.kingsley.reward.blocks.blockentities.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntityType {

    public static final BlockEntityType<HolidayChestBlockEntity> HOLIDAY_CHEST = BlockEntityType.Builder.create(HolidayChestBlockEntity::new, ModBlocks.HOLIDAY_CHEST).build(null);
    public static final BlockEntityType<DailyChestBlockEntity> DAILY_CHEST = BlockEntityType.Builder.create(DailyChestBlockEntity::new, ModBlocks.DAILY_CHEST).build(null);
    public static final BlockEntityType<DiamondChestBlockEntity> DIAMOND_CHEST = BlockEntityType.Builder.create(DiamondChestBlockEntity::new, ModBlocks.DIAMOND_CHEST).build(null);

    public static void registerBlockEntities() {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Reward.MOD_ID, "holiday_chest"), HOLIDAY_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Reward.MOD_ID, "daily_chest"), DAILY_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Reward.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
    }
}
