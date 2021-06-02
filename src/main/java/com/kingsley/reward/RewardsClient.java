package com.kingsley.reward;

import com.kingsley.reward.client.IronChestsBlockEntityRenderer;
import com.kingsley.reward.registry.ModBlockEntityType;
import com.kingsley.reward.registry.ModScreenHandlerType;
import com.kingsley.reward.screenhandlers.ExtraChestScreenHandler;
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.util.Identifier;

public class RewardsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ScreenRegistry.<ExtraChestScreenHandler, CottonInventoryScreen<ExtraChestScreenHandler>>register(ModScreenHandlerType.HOLIDAY_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ExtraChestScreenHandler, CottonInventoryScreen<ExtraChestScreenHandler>>register(ModScreenHandlerType.DAILY_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ExtraChestScreenHandler, CottonInventoryScreen<ExtraChestScreenHandler>>register(ModScreenHandlerType.DIAMOND_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));

        BlockEntityRendererRegistry.INSTANCE.register(ModBlockEntityType.HOLIDAY_CHEST, IronChestsBlockEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(ModBlockEntityType.DAILY_CHEST, IronChestsBlockEntityRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(ModBlockEntityType.DIAMOND_CHEST, IronChestsBlockEntityRenderer::new);


        //Register Textures to Chest Atlas
        ClientSpriteRegistryCallback.event(TexturedRenderLayers.CHEST_ATLAS_TEXTURE).register((texture, registry) -> {
            registry.register(new Identifier(Reward.MOD_ID, "entity/chest/daily_chest"));
            registry.register(new Identifier(Reward.MOD_ID, "entity/chest/diamond_chest"));
        });
    }
}
