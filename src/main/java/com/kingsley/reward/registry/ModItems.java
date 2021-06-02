package com.kingsley.reward.registry;

import com.kingsley.reward.Reward;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Chest Items
    public static final Item HOLIDAY_CHEST = new BlockItem(ModBlocks.HOLIDAY_CHEST, new Item.Settings().group(Reward.TAB).maxCount(1));
    public static final Item DAILY_CHEST = new BlockItem(ModBlocks.DAILY_CHEST, new Item.Settings().group(Reward.TAB).maxCount(1));
    public static final Item DIAMOND_CHEST = new BlockItem(ModBlocks.DIAMOND_CHEST, new Item.Settings().group(Reward.TAB));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Reward.MOD_ID, "holiday_chest"), HOLIDAY_CHEST);
        Registry.register(Registry.ITEM, new Identifier(Reward.MOD_ID, "daily_chest"), DAILY_CHEST);
        Registry.register(Registry.ITEM, new Identifier(Reward.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
    }
}
