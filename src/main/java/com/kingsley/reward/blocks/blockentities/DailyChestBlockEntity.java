package com.kingsley.reward.blocks.blockentities;

import com.kingsley.reward.blocks.ExtraChestTypes;
import com.kingsley.reward.registry.ModBlockEntityType;
import com.kingsley.reward.registry.ModScreenHandlerType;
import com.kingsley.reward.screenhandlers.ExtraChestScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class DailyChestBlockEntity extends GenericIronChestBlockEntity {
    public DailyChestBlockEntity() {
        super(ModBlockEntityType.DAILY_CHEST, ExtraChestTypes.DAILY);
    }

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inventory, PlayerEntity player) {
        return new ExtraChestScreenHandler(ModScreenHandlerType.DAILY_CHEST, type, syncId, inventory, ScreenHandlerContext.create(world, pos));
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory inventory) {
        return new ExtraChestScreenHandler(ModScreenHandlerType.DAILY_CHEST, type, syncId, inventory, ScreenHandlerContext.create(world, pos));
    }

}
