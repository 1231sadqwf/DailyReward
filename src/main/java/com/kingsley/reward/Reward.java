package com.kingsley.reward;

import com.kingsley.reward.registry.ModBlockEntityType;
import com.kingsley.reward.registry.ModBlocks;
import com.kingsley.reward.registry.ModItems;
import com.kingsley.reward.registry.ModScreenHandlerType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Reward implements ModInitializer {
    public static final String MOD_ID = "reward";
    @Override
    public void onInitialize() {
        ModBlockEntityType.registerBlockEntities();
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModScreenHandlerType.registerScreenHandlers();
    }

    public static final ItemGroup TAB = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "reward"))
            .icon(() -> new ItemStack(ModItems.HOLIDAY_CHEST))
            .build();
}
