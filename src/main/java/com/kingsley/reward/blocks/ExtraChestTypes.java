package com.kingsley.reward.blocks;

import com.kingsley.reward.Reward;
import com.kingsley.reward.blocks.blockentities.GenericIronChestBlockEntity;
import com.kingsley.reward.blocks.blockentities.HolidayChestBlockEntity;
import com.kingsley.reward.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public enum ExtraChestTypes {

    IRON(54, 9, 184, 222, new Identifier(Reward.MOD_ID, "entity/chest/iron_chest"), 256, 256),
    DAILY(54, 9, 184, 222, new Identifier(Reward.MOD_ID, "entity/chest/daily_chest"), 256, 256),
    DIAMOND(108, 12, 238, 276, new Identifier(Reward.MOD_ID, "entity/chest/diamond_chest"), 256, 276),
    HOLIDAY(27, 9, 0, 0, new Identifier("entity/chest/christmas"), 0, 0);

    public final int size;
    public final int rowLength;
    public final int xSize;
    public final int ySize;
    public final Identifier texture;
    public final int textureXSize;
    public final int textureYSize;

    ExtraChestTypes(int size, int rowLength, int xSize, int ySize, Identifier texture, int textureXSize, int textureYSize) {
        this.size = size;
        this.rowLength = rowLength;
        this.xSize = xSize;
        this.ySize = ySize;
        this.texture = texture;
        this.textureXSize = textureXSize;
        this.textureYSize = textureYSize;
    }

    public int getRowCount() {
        return this.size / this.rowLength;
    }
}
