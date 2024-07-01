package com.seleneandmana.compatoplenty.client;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {

    //TODO: Replace with full blockstate/model datagen!
    @SubscribeEvent
    public static void registerClient(FMLClientSetupEvent event) {
        event.enqueueWork(ClientRegister::setupRenderLayer);
    }

    private static void setupRenderLayers(CompatBlocks.LeafSet set) {
        ItemBlockRenderTypes.setRenderLayer(set.hedge().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.leafCarpet().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.leafPile().get(), RenderType.cutout());
    }

    private static void setupRenderLayers(CompatBlocks.WoodSet set) {
        ItemBlockRenderTypes.setRenderLayer(set.ladder().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.post().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.strippedPost().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.table().get(), RenderType.cutout());
        setupRenderLayers(set.leaveSet());
    }

    public static void setupRenderLayer() {
        // ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WHITE_CHERRY_HEDGE.get(), RenderType.cutout());
        // ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WHITE_CHERRY_LEAF_CARPET.get(), RenderType.cutout());
        // ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WHITE_CHERRY_LEAF_PILE.get(), RenderType.cutout());

        setupRenderLayers(CompatBlocks.JACARANDA);
        setupRenderLayers(CompatBlocks.FIR);
        setupRenderLayers(CompatBlocks.REDWOOD);
        setupRenderLayers(CompatBlocks.MAHOGANY);
        setupRenderLayers(CompatBlocks.WILLOW);
        setupRenderLayers(CompatBlocks.MAGIC);
        setupRenderLayers(CompatBlocks.DEAD);
        setupRenderLayers(CompatBlocks.UMBRAN);
        setupRenderLayers(CompatBlocks.PALM);
        setupRenderLayers(CompatBlocks.HELLBARK);
        setupRenderLayers(CompatBlocks.FLOWERING_OAK);
        setupRenderLayers(CompatBlocks.RAINBOW_BIRCH);
        setupRenderLayers(CompatBlocks.ORIGIN);
        setupRenderLayers(CompatBlocks.MAPLE);
        setupRenderLayers(CompatBlocks.ORANGE_AUTUMN);
        setupRenderLayers(CompatBlocks.YELLOW_AUTUMN);
    }
}
