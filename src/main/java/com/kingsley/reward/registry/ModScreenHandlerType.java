package com.kingsley.reward.registry;

import com.kingsley.reward.Reward;
import com.kingsley.reward.blocks.ExtraChestTypes;
import com.kingsley.reward.screenhandlers.ExtraChestScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlerType {

    public static ScreenHandlerType<ExtraChestScreenHandler> HOLIDAY_CHEST;
    public static ScreenHandlerType<ExtraChestScreenHandler> DAILY_CHEST;
    public static ScreenHandlerType<ExtraChestScreenHandler> DIAMOND_CHEST;

    public static void registerScreenHandlers() {
        HOLIDAY_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Reward.MOD_ID, "holiday_chest"), (syncId, inventory) -> new ExtraChestScreenHandler(HOLIDAY_CHEST, ExtraChestTypes.HOLIDAY, syncId, inventory, ScreenHandlerContext.EMPTY));
        DAILY_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Reward.MOD_ID, "daily_chest"), (syncId, inventory) -> new ExtraChestScreenHandler(DAILY_CHEST, ExtraChestTypes.DAILY, syncId, inventory, ScreenHandlerContext.EMPTY));
        DIAMOND_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Reward.MOD_ID, "diamond_chest"), (syncId, inventory) -> new ExtraChestScreenHandler(DIAMOND_CHEST, ExtraChestTypes.DIAMOND, syncId, inventory, ScreenHandlerContext.EMPTY));
    }
}
