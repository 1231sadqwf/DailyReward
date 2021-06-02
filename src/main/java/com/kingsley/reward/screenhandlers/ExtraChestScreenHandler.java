package com.kingsley.reward.screenhandlers;

import com.kingsley.reward.blocks.ExtraChestTypes;
import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.text.LiteralText;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExtraChestScreenHandler extends SyncedGuiDescription {

    Inventory inventory;

    public ExtraChestScreenHandler(ScreenHandlerType<?> type, ExtraChestTypes chestType, int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(type, syncId, playerInventory, getBlockInventory(context, chestType.size), null);
        inventory = blockInventory;
        inventory.onOpen(playerInventory.player);
        int rows = chestType.getRowCount();
        int length = chestType.rowLength;

        WPlainPanel root = new WPlainPanel();
        setRootPanel(root);

        WItemSlot itemSlot;
        int counter = 0;

        // get chest type
//        System.out.println(chestType.name());

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < length; i++) {
                // remove item in chest //
                blockInventory.removeStack(counter);
                // set new item //
                ItemStack stack;
                if (i != 0) {
                    stack = new ItemStack(Items.GRAY_STAINED_GLASS_PANE);
                    stack.setCustomName(new LiteralText(""));
                } else {
                    stack = new ItemStack(Registry.ITEM.get(new Identifier("reward", "holiday_chest")), 1);
                }
                // insert item to chest //
                blockInventory.setStack(counter, stack);
                itemSlot = WItemSlot.of(blockInventory, counter);
                root.add(itemSlot, (18 * i), 12 + (18 * j));
                counter++;
            }
        }

        int height = 15;
        height += 18 * (chestType.size / length);

        int width = 0;
        if (chestType.rowLength > 9) {
            width = 9 * (chestType.rowLength - 9);
        }

        root.add(this.createPlayerInventoryPanel(), width, height);
        root.validate(this);
    }

    @Override
    public void close(PlayerEntity player) {
        super.close(player);
        this.inventory.onClose(player);
    }

    @Override
    public ItemStack onSlotClick(int slotNumber, int button, SlotActionType action, PlayerEntity player) {
        if (slotNumber != 0) {
            return super.onSlotClick(slotNumber, button, action, player);
        }

        return new ItemStack(Registry.ITEM.get(new Identifier("minecraft", "air")), 1);
    }

}
