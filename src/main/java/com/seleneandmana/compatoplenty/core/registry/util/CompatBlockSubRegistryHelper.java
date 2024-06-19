package com.seleneandmana.compatoplenty.core.registry.util;

import com.mojang.datafixers.util.Pair;
import com.teamabnormals.blueprint.client.renderer.block.ChestBlockEntityWithoutLevelRenderer;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.common.block.entity.BlueprintChestBlockEntity;
import com.teamabnormals.blueprint.common.block.entity.BlueprintTrappedChestBlockEntity;
import com.teamabnormals.blueprint.common.item.BEWLRBlockItem;
import com.teamabnormals.blueprint.common.item.BEWLRFuelBlockItem;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.RegistryObject;

public class CompatBlockSubRegistryHelper extends BlockSubRegistryHelper {
    public CompatBlockSubRegistryHelper(RegistryHelper parent) {
        super(parent);
    }

    public Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> createUnburnableChestBlocks(String name, MapColor color) {
        String modId = this.parent.getModId();
        String chestName = name + "_chest";
        String trappedChestName = name + "_trapped_chest";
        RegistryObject<BlueprintChestBlock> chest = this.deferredRegister.register(chestName, () -> new BlueprintChestBlock(modId + ":" + name, Block.Properties.of().mapColor(color).strength(2.5F).sound(SoundType.WOOD)));
        RegistryObject<BlueprintTrappedChestBlock> trappedChest = this.deferredRegister.register(trappedChestName, () -> new BlueprintTrappedChestBlock(modId + ":" + name + "_trapped", Block.Properties.of().mapColor(color).strength(2.5F).sound(SoundType.WOOD)));
        this.itemRegister.register(chestName, () -> new BEWLRBlockItem(chest.get(), new Item.Properties(), () -> () -> chestBEWLR(false)));
        this.itemRegister.register(trappedChestName, () -> new BEWLRBlockItem(trappedChest.get(), new Item.Properties(), () -> () -> chestBEWLR(true)));
        return Pair.of(chest, trappedChest);
    }

    public Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> createChestBlocks(String name, MapColor color) {
        String modId = this.parent.getModId();
        String chestName = name + "_chest";
        String trappedChestName = name + "_trapped_chest";
        RegistryObject<BlueprintChestBlock> chest = this.deferredRegister.register(chestName, () -> new BlueprintChestBlock(modId + ":" + name, Block.Properties.of().mapColor(color).strength(2.5F).sound(SoundType.WOOD)));
        RegistryObject<BlueprintTrappedChestBlock> trappedChest = this.deferredRegister.register(trappedChestName, () -> new BlueprintTrappedChestBlock(modId + ":" + name + "_trapped", Block.Properties.of().mapColor(color).strength(2.5F).sound(SoundType.WOOD)));
        this.itemRegister.register(chestName, () -> new BEWLRFuelBlockItem(chest.get(), new Item.Properties(), () -> () -> chestBEWLR(false), 300));
        this.itemRegister.register(trappedChestName, () -> new BEWLRFuelBlockItem(trappedChest.get(), new Item.Properties(), () -> () -> chestBEWLR(true), 300));
        return Pair.of(chest, trappedChest);
    }

    @OnlyIn(Dist.CLIENT)
    private static BEWLRBlockItem.LazyBEWLR chestBEWLR(boolean trapped) {
        return trapped ? new BEWLRBlockItem.LazyBEWLR((dispatcher, entityModelSet) -> {
            return new ChestBlockEntityWithoutLevelRenderer<>(dispatcher, entityModelSet, new BlueprintTrappedChestBlockEntity(BlockPos.ZERO, Blocks.TRAPPED_CHEST.defaultBlockState()));
        }) : new BEWLRBlockItem.LazyBEWLR((dispatcher, entityModelSet) -> {
            return new ChestBlockEntityWithoutLevelRenderer<>(dispatcher, entityModelSet, new BlueprintChestBlockEntity(BlockPos.ZERO, Blocks.CHEST.defaultBlockState()));
        });
    }
}
