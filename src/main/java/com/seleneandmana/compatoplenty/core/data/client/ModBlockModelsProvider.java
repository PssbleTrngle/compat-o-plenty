package com.seleneandmana.compatoplenty.core.data.client;

import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.seleneandmana.compatoplenty.core.CompatOPlenty.BOP_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.QUARK_ID;

public class ModBlockModelsProvider extends BlockStateProvider {

    public ModBlockModelsProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, CompatOPlenty.MOD_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerStatesAndModels(CompatBlocks.FIR);
        registerStatesAndModels(CompatBlocks.JACARANDA);
        registerStatesAndModels(CompatBlocks.REDWOOD);
        registerStatesAndModels(CompatBlocks.MAHOGANY);
        registerStatesAndModels(CompatBlocks.WILLOW);
        registerStatesAndModels(CompatBlocks.MAGIC);
        registerStatesAndModels(CompatBlocks.DEAD);
        registerStatesAndModels(CompatBlocks.UMBRAN);
        registerStatesAndModels(CompatBlocks.PALM);
        registerStatesAndModels(CompatBlocks.RAINBOW_BIRCH);
        registerStatesAndModels(CompatBlocks.ORANGE_AUTUMN);
        registerStatesAndModels(CompatBlocks.YELLOW_AUTUMN);
        registerStatesAndModels(CompatBlocks.MAPLE);
        registerStatesAndModels(CompatBlocks.ORIGIN);
        registerStatesAndModels(CompatBlocks.FLOWERING_OAK);
    }

    private void registerStatesAndModels(CompatBlocks.LeafSet set) {

    }

    private void registerStatesAndModels(CompatBlocks.WoodSet set) {
        post(set.post().get());
        post(set.strippedPost().get());

        registerStatesAndModels(set.leaveSet());
    }

    private void post(Block block) {
        var name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        var base = name.substring(0, name.length() - 5);

        models().singleTexture(name + "_connect", new ResourceLocation(QUARK_ID, "block/post_connect"), new ResourceLocation(BOP_ID, "block/" + base + "_log"));
        models().singleTexture(name + "_connect_top", new ResourceLocation(QUARK_ID, "block/post_connect_top"), new ResourceLocation(BOP_ID, "block/" + base + "_log"));
    }

}
