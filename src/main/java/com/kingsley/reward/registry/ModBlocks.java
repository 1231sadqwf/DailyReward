package com.kingsley.reward.registry;

import com.kingsley.reward.Reward;
import com.kingsley.reward.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block HOLIDAY_CHEST = new HolidayChestBlock();
    public static final Block DAILY_CHEST = new DailyChestBlock();
    public static final Block DIAMOND_CHEST = new DiamondChestBlock();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Reward.MOD_ID, "holiday_chest"), HOLIDAY_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(Reward.MOD_ID, "daily_chest"), DAILY_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(Reward.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
    }

}
