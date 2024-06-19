package com.seleneandmana.compatoplenty.core.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.mojang.datafixers.util.Pair;
import com.seleneandmana.compatoplenty.common.blocks.RoseQuartzSlabBlock;
import com.seleneandmana.compatoplenty.common.blocks.RoseQuartzStairBlock;
import com.seleneandmana.compatoplenty.common.blocks.RoseQuartzVerticalSlabBlock;
import com.seleneandmana.compatoplenty.common.blocks.RoseQuartzWallBlock;
import com.seleneandmana.compatoplenty.common.blocks.VerticalSlabBlock;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.other.CompatProperties;
import com.seleneandmana.compatoplenty.core.registry.util.CompatBlockSubRegistryHelper;
import com.seleneandmana.compatoplenty.integrations.farmersdelight.CompatCabinetSuppliers;
import com.seleneandmana.compatoplenty.integrations.farmersdelight.ReplacementCabinetBlock;
import com.seleneandmana.compatoplenty.integrations.twigs.CompatTableBlock;
import com.teamabnormals.blueprint.common.block.*;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import org.violetmoon.quark.content.building.block.HedgeBlock;
import org.violetmoon.quark.content.building.block.LeafCarpetBlock;
import org.violetmoon.quark.content.building.block.WoodPostBlock;

import static com.seleneandmana.compatoplenty.core.CompatOPlenty.FARMERS_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.QUARK_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.TWIGS_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.VSLAB_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.WOODWORKS_ID;
import static com.seleneandmana.compatoplenty.core.registry.CompatItems.anyModLoaded;
import static com.seleneandmana.compatoplenty.core.registry.CompatItems.of;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatBlocks {
    public static final CompatBlockSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getBlockSubHelper();

    //Jacaranda
    public static final RegistryObject<Block> JACARANDA_VERTICAL_SLAB = HELPER.createFuelBlock("jacaranda_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.JACARANDA_PLANKS.get()), 150);
    public static final RegistryObject<Block> JACARANDA_BOOKSHELF = HELPER.createFuelBlock("jacaranda_bookshelf", () -> new Block(CompatProperties.JACARANDA.bookshelf()), 300);
    public static final RegistryObject<Block> JACARANDA_LADDER = HELPER.createFuelBlock("jacaranda_ladder", () -> new LadderBlock(CompatProperties.JACARANDA.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_JACARANDA_POST = HELPER.createFuelBlock("stripped_jacaranda_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_JACARANDA_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> JACARANDA_POST = HELPER.createFuelBlock("jacaranda_post", () -> new WoodPostBlock(null, BOPBlocks.JACARANDA_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> JACARANDA_HEDGE = HELPER.createFuelBlock("jacaranda_hedge", () -> new HedgeBlock(null, null, BOPBlocks.JACARANDA_FENCE.get(), BOPBlocks.JACARANDA_LEAVES.get()), 300);
    public static final RegistryObject<Block> JACARANDA_LEAF_CARPET = HELPER.createBlock("jacaranda_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.JACARANDA_LEAVES.get(), null));
    public static final RegistryObject<Block> JACARANDA_LEAF_PILE = HELPER.createBlock("jacaranda_leaf_pile", () -> new LeafPileBlock(CompatProperties.JACARANDA.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> JACARANDA_CHESTS = HELPER.createChestBlocks("jacaranda", MapColor.TERRACOTTA_PINK);
    public static final RegistryObject<Block> JACARANDA_BEEHIVE = HELPER.createBlock("jacaranda_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> JACARANDA_CABINET = HELPER.createFuelBlock("jacaranda_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> JACARANDA_TABLE = HELPER.createBlock("jacaranda_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_JACARANDA_PLANKS = HELPER.createBlock("vertical_jacaranda_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS.get())));
    public static final RegistryObject<Block> JACARANDA_BOARDS = HELPER.createFuelBlock("jacaranda_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS.get())), 300);


    //Fir
    public static final RegistryObject<Block> FIR_VERTICAL_SLAB = HELPER.createFuelBlock("fir_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.FIR_PLANKS.get()), 150);
    public static final RegistryObject<Block> FIR_BOOKSHELF = HELPER.createFuelBlock("fir_bookshelf", () -> new Block(CompatProperties.FIR.bookshelf()), 300);
    public static final RegistryObject<Block> FIR_LADDER = HELPER.createFuelBlock("fir_ladder", () -> new LadderBlock(CompatProperties.FIR.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_FIR_POST = HELPER.createFuelBlock("stripped_fir_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_FIR_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> FIR_POST = HELPER.createFuelBlock("fir_post", () -> new WoodPostBlock(null, BOPBlocks.FIR_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> FIR_HEDGE = HELPER.createFuelBlock("fir_hedge", () -> new HedgeBlock(null, null, BOPBlocks.FIR_FENCE.get(), BOPBlocks.FIR_LEAVES.get()), 300);
    public static final RegistryObject<Block> FIR_LEAF_CARPET = HELPER.createBlock("fir_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.FIR_LEAVES.get(), null));
    public static final RegistryObject<Block> FIR_LEAF_PILE = HELPER.createBlock("fir_leaf_pile", () -> new LeafPileBlock(CompatProperties.FIR.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> FIR_CHESTS = HELPER.createChestBlocks("fir", MapColor.TERRACOTTA_WHITE);
    public static final RegistryObject<Block> FIR_BEEHIVE = HELPER.createBlock("fir_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> FIR_CABINET = HELPER.createFuelBlock("fir_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> FIR_TABLE = HELPER.createBlock("fir_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_FIR_PLANKS = HELPER.createBlock("vertical_fir_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS.get())));
    public static final RegistryObject<Block> FIR_BOARDS = HELPER.createFuelBlock("fir_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS.get())), 300);


    //Redwood
    public static final RegistryObject<Block> REDWOOD_VERTICAL_SLAB = HELPER.createFuelBlock("redwood_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.REDWOOD_PLANKS.get()), 150);
    public static final RegistryObject<Block> REDWOOD_BOOKSHELF = HELPER.createFuelBlock("redwood_bookshelf", () -> new Block(CompatProperties.REDWOOD.bookshelf()), 300);
    public static final RegistryObject<Block> REDWOOD_LADDER = HELPER.createFuelBlock("redwood_ladder", () -> new LadderBlock(CompatProperties.REDWOOD.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_REDWOOD_POST = HELPER.createFuelBlock("stripped_redwood_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_REDWOOD_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> REDWOOD_POST = HELPER.createFuelBlock("redwood_post", () -> new WoodPostBlock(null, BOPBlocks.REDWOOD_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> REDWOOD_HEDGE = HELPER.createFuelBlock("redwood_hedge", () -> new HedgeBlock(null, null, BOPBlocks.REDWOOD_FENCE.get(), BOPBlocks.REDWOOD_LEAVES.get()), 300);
    public static final RegistryObject<Block> REDWOOD_LEAF_CARPET = HELPER.createBlock("redwood_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.REDWOOD_LEAVES.get(), null));
    public static final RegistryObject<Block> REDWOOD_LEAF_PILE = HELPER.createBlock("redwood_leaf_pile", () -> new LeafPileBlock(CompatProperties.REDWOOD.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> REDWOOD_CHESTS = HELPER.createChestBlocks("redwood", MapColor.TERRACOTTA_ORANGE);
    public static final RegistryObject<Block> REDWOOD_BEEHIVE = HELPER.createBlock("redwood_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> REDWOOD_CABINET = HELPER.createFuelBlock("redwood_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> REDWOOD_TABLE = HELPER.createBlock("redwood_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_REDWOOD_PLANKS = HELPER.createBlock("vertical_redwood_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS.get())));
    public static final RegistryObject<Block> REDWOOD_BOARDS = HELPER.createFuelBlock("redwood_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS.get())), 300);

    //Mahogany
    public static final RegistryObject<Block> MAHOGANY_VERTICAL_SLAB = HELPER.createFuelBlock("mahogany_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.MAHOGANY_PLANKS.get()), 150);
    public static final RegistryObject<Block> MAHOGANY_BOOKSHELF = HELPER.createFuelBlock("mahogany_bookshelf", () -> new Block(CompatProperties.MAHOGANY.bookshelf()), 300);
    public static final RegistryObject<Block> MAHOGANY_LADDER = HELPER.createFuelBlock("mahogany_ladder", () -> new LadderBlock(CompatProperties.MAHOGANY.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_MAHOGANY_POST = HELPER.createFuelBlock("stripped_mahogany_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_MAHOGANY_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> MAHOGANY_POST = HELPER.createFuelBlock("mahogany_post", () -> new WoodPostBlock(null, BOPBlocks.MAHOGANY_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> MAHOGANY_HEDGE = HELPER.createFuelBlock("mahogany_hedge", () -> new HedgeBlock(null, null, BOPBlocks.MAHOGANY_FENCE.get(), BOPBlocks.MAHOGANY_LEAVES.get()), 300);
    public static final RegistryObject<Block> MAHOGANY_LEAF_CARPET = HELPER.createBlock("mahogany_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.MAHOGANY_LEAVES.get(), null));
    public static final RegistryObject<Block> MAHOGANY_LEAF_PILE = HELPER.createBlock("mahogany_leaf_pile", () -> new LeafPileBlock(CompatProperties.MAHOGANY.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> MAHOGANY_CHESTS = HELPER.createChestBlocks("mahogany", MapColor.TERRACOTTA_PINK);
    public static final RegistryObject<Block> MAHOGANY_BEEHIVE = HELPER.createBlock("mahogany_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> MAHOGANY_CABINET = HELPER.createFuelBlock("mahogany_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> MAHOGANY_TABLE = HELPER.createBlock("mahogany_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_MAHOGANY_PLANKS = HELPER.createBlock("vertical_mahogany_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS.get())));
    public static final RegistryObject<Block> MAHOGANY_BOARDS = HELPER.createFuelBlock("mahogany_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS.get())), 300);

    //Willow
    public static final RegistryObject<Block> WILLOW_VERTICAL_SLAB = HELPER.createFuelBlock("willow_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.WILLOW_PLANKS.get()), 150);
    public static final RegistryObject<Block> WILLOW_BOOKSHELF = HELPER.createFuelBlock("willow_bookshelf", () -> new Block(CompatProperties.WILLOW.bookshelf()), 300);
    public static final RegistryObject<Block> WILLOW_LADDER = HELPER.createFuelBlock("willow_ladder", () -> new LadderBlock(CompatProperties.WILLOW.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_WILLOW_POST = HELPER.createFuelBlock("stripped_willow_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_WILLOW_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> WILLOW_POST = HELPER.createFuelBlock("willow_post", () -> new WoodPostBlock(null, BOPBlocks.WILLOW_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> WILLOW_HEDGE = HELPER.createFuelBlock("willow_hedge", () -> new HedgeBlock(null, null, BOPBlocks.WILLOW_FENCE.get(), BOPBlocks.WILLOW_LEAVES.get()), 300);
    public static final RegistryObject<Block> WILLOW_LEAF_CARPET = HELPER.createBlock("willow_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.WILLOW_LEAVES.get(), null));
    public static final RegistryObject<Block> WILLOW_LEAF_PILE = HELPER.createBlock("willow_leaf_pile", () -> new LeafPileBlock(CompatProperties.WILLOW.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> WILLOW_CHESTS = HELPER.createChestBlocks("willow", MapColor.TERRACOTTA_LIGHT_GREEN);
    public static final RegistryObject<Block> WILLOW_BEEHIVE = HELPER.createBlock("willow_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> WILLOW_CABINET = HELPER.createFuelBlock("willow_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> WILLOW_TABLE = HELPER.createBlock("willow_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_WILLOW_PLANKS = HELPER.createBlock("vertical_willow_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS.get())));
    public static final RegistryObject<Block> WILLOW_BOARDS = HELPER.createFuelBlock("willow_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS.get())), 300);

    //Magic
    public static final RegistryObject<Block> MAGIC_VERTICAL_SLAB = HELPER.createFuelBlock("magic_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.MAGIC_PLANKS.get()), 150);
    public static final RegistryObject<Block> MAGIC_BOOKSHELF = HELPER.createFuelBlock("magic_bookshelf", () -> new Block(CompatProperties.MAGIC.bookshelf()), 300);
    public static final RegistryObject<Block> MAGIC_LADDER = HELPER.createFuelBlock("magic_ladder", () -> new LadderBlock(CompatProperties.MAGIC.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_MAGIC_POST = HELPER.createFuelBlock("stripped_magic_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_MAGIC_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> MAGIC_POST = HELPER.createFuelBlock("magic_post", () -> new WoodPostBlock(null, BOPBlocks.MAGIC_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> MAGIC_HEDGE = HELPER.createFuelBlock("magic_hedge", () -> new HedgeBlock(null, null, BOPBlocks.MAGIC_FENCE.get(), BOPBlocks.MAGIC_LEAVES.get()), 300);
    public static final RegistryObject<Block> MAGIC_LEAF_CARPET = HELPER.createBlock("magic_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.MAGIC_LEAVES.get(), null));
    public static final RegistryObject<Block> MAGIC_LEAF_PILE = HELPER.createBlock("magic_leaf_pile", () -> new LeafPileBlock(CompatProperties.MAGIC.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> MAGIC_CHESTS = HELPER.createChestBlocks("magic", MapColor.COLOR_BLUE);
    public static final RegistryObject<Block> MAGIC_BEEHIVE = HELPER.createBlock("magic_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> MAGIC_CABINET = HELPER.createFuelBlock("magic_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> MAGIC_TABLE = HELPER.createBlock("magic_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_MAGIC_PLANKS = HELPER.createBlock("vertical_magic_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS.get())));
    public static final RegistryObject<Block> MAGIC_BOARDS = HELPER.createFuelBlock("magic_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS.get())), 300);

    //Dead
    public static final RegistryObject<Block> DEAD_VERTICAL_SLAB = HELPER.createFuelBlock("dead_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.DEAD_PLANKS.get()), 150);
    public static final RegistryObject<Block> DEAD_BOOKSHELF = HELPER.createFuelBlock("dead_bookshelf", () -> new Block(CompatProperties.DEAD.bookshelf()), 300);
    public static final RegistryObject<Block> DEAD_LADDER = HELPER.createFuelBlock("dead_ladder", () -> new LadderBlock(CompatProperties.DEAD.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_DEAD_POST = HELPER.createFuelBlock("stripped_dead_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_DEAD_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> DEAD_POST = HELPER.createFuelBlock("dead_post", () -> new WoodPostBlock(null, BOPBlocks.DEAD_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> DEAD_HEDGE = HELPER.createFuelBlock("dead_hedge", () -> new HedgeBlock(null, null, BOPBlocks.DEAD_FENCE.get(), BOPBlocks.DEAD_LEAVES.get()), 300);
    public static final RegistryObject<Block> DEAD_LEAF_CARPET = HELPER.createBlock("dead_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.DEAD_LEAVES.get(), null));
    public static final RegistryObject<Block> DEAD_LEAF_PILE = HELPER.createBlock("dead_leaf_pile", () -> new LeafPileBlock(CompatProperties.DEAD.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> DEAD_CHESTS = HELPER.createChestBlocks("dead", MapColor.STONE);
    public static final RegistryObject<Block> DEAD_BEEHIVE = HELPER.createBlock("dead_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> DEAD_CABINET = HELPER.createFuelBlock("dead_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> DEAD_TABLE = HELPER.createBlock("dead_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_DEAD_PLANKS = HELPER.createBlock("vertical_dead_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS.get())));
    public static final RegistryObject<Block> DEAD_BOARDS = HELPER.createFuelBlock("dead_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS.get())), 300);

    //Umbran
    public static final RegistryObject<Block> UMBRAN_VERTICAL_SLAB = HELPER.createFuelBlock("umbran_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.UMBRAN_PLANKS.get()), 150);
    public static final RegistryObject<Block> UMBRAN_BOOKSHELF = HELPER.createFuelBlock("umbran_bookshelf", () -> new Block(CompatProperties.UMBRAN.bookshelf()), 300);
    public static final RegistryObject<Block> UMBRAN_LADDER = HELPER.createFuelBlock("umbran_ladder", () -> new LadderBlock(CompatProperties.UMBRAN.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_UMBRAN_POST = HELPER.createFuelBlock("stripped_umbran_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_UMBRAN_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> UMBRAN_POST = HELPER.createFuelBlock("umbran_post", () -> new WoodPostBlock(null, BOPBlocks.UMBRAN_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> UMBRAN_HEDGE = HELPER.createFuelBlock("umbran_hedge", () -> new HedgeBlock(null, null, BOPBlocks.UMBRAN_FENCE.get(), BOPBlocks.UMBRAN_LEAVES.get()), 300);
    public static final RegistryObject<Block> UMBRAN_LEAF_CARPET = HELPER.createBlock("umbran_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.UMBRAN_LEAVES.get(), null));
    public static final RegistryObject<Block> UMBRAN_LEAF_PILE = HELPER.createBlock("umbran_leaf_pile", () -> new LeafPileBlock(CompatProperties.UMBRAN.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> UMBRAN_CHESTS = HELPER.createChestBlocks("umbran", MapColor.TERRACOTTA_BLUE);
    public static final RegistryObject<Block> UMBRAN_BEEHIVE = HELPER.createBlock("umbran_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> UMBRAN_CABINET = HELPER.createFuelBlock("umbran_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> UMBRAN_TABLE = HELPER.createBlock("umbran_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_UMBRAN_PLANKS = HELPER.createBlock("vertical_umbran_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS.get())));
    public static final RegistryObject<Block> UMBRAN_BOARDS = HELPER.createFuelBlock("umbran_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS.get())), 300);

    //Palm
    public static final RegistryObject<Block> PALM_VERTICAL_SLAB = HELPER.createFuelBlock("palm_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.PALM_PLANKS.get()), 150);
    public static final RegistryObject<Block> PALM_BOOKSHELF = HELPER.createFuelBlock("palm_bookshelf", () -> new Block(CompatProperties.PALM.bookshelf()), 300);
    public static final RegistryObject<Block> PALM_LADDER = HELPER.createFuelBlock("palm_ladder", () -> new LadderBlock(CompatProperties.PALM.ladder()), 300);
    public static final RegistryObject<Block> STRIPPED_PALM_POST = HELPER.createFuelBlock("stripped_palm_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_PALM_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> PALM_POST = HELPER.createFuelBlock("palm_post", () -> new WoodPostBlock(null, BOPBlocks.PALM_LOG.get(), null, SoundType.WOOD), 300);
    public static final RegistryObject<Block> PALM_HEDGE = HELPER.createFuelBlock("palm_hedge", () -> new HedgeBlock(null, null, BOPBlocks.PALM_FENCE.get(), BOPBlocks.PALM_LEAVES.get()), 300);
    public static final RegistryObject<Block> PALM_LEAF_CARPET = HELPER.createBlock("palm_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.PALM_LEAVES.get(), null));
    public static final RegistryObject<Block> PALM_LEAF_PILE = HELPER.createBlock("palm_leaf_pile", () -> new LeafPileBlock(CompatProperties.PALM.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> PALM_CHESTS = HELPER.createChestBlocks("palm", MapColor.TERRACOTTA_YELLOW);
    public static final RegistryObject<Block> PALM_BEEHIVE = HELPER.createBlock("palm_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> PALM_CABINET = HELPER.createFuelBlock("palm_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), 300);
    public static final RegistryObject<Block> PALM_TABLE = HELPER.createBlock("palm_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_PALM_PLANKS = HELPER.createBlock("vertical_palm_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS.get())));
    public static final RegistryObject<Block> PALM_BOARDS = HELPER.createFuelBlock("palm_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS.get())), 300);

    //Hellbark
    public static final RegistryObject<Block> HELLBARK_VERTICAL_SLAB = HELPER.createBlock("hellbark_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.HELLBARK_PLANKS.get()));
    public static final RegistryObject<Block> HELLBARK_BOOKSHELF = HELPER.createBlock("hellbark_bookshelf", () -> new Block(CompatProperties.HELLBARK.bookshelf()));
    public static final RegistryObject<Block> HELLBARK_LADDER = HELPER.createBlock("hellbark_ladder", () -> new LadderBlock(CompatProperties.HELLBARK.ladder()));
    public static final RegistryObject<Block> STRIPPED_HELLBARK_POST = HELPER.createBlock("stripped_hellbark_post", () -> new WoodPostBlock(null, BOPBlocks.STRIPPED_HELLBARK_LOG.get(), null, SoundType.WOOD));
    public static final RegistryObject<Block> HELLBARK_POST = HELPER.createBlock("hellbark_post", () -> new WoodPostBlock(null, BOPBlocks.HELLBARK_LOG.get(), null, SoundType.WOOD));
    public static final RegistryObject<Block> HELLBARK_HEDGE = HELPER.createBlock("hellbark_hedge", () -> new HedgeBlock(null, null, BOPBlocks.HELLBARK_FENCE.get(), BOPBlocks.HELLBARK_LEAVES.get()));
    public static final RegistryObject<Block> HELLBARK_LEAF_CARPET = HELPER.createBlock("hellbark_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.HELLBARK_LEAVES.get(), null));
    public static final RegistryObject<Block> HELLBARK_LEAF_PILE = HELPER.createBlock("hellbark_leaf_pile", () -> new LeafPileBlock(CompatProperties.HELLBARK.leafPile()));
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> HELLBARK_CHESTS = HELPER.createUnburnableChestBlocks("hellbark", MapColor.TERRACOTTA_GRAY);
    public static final RegistryObject<Block> HELLBARK_BEEHIVE = HELPER.createBlock("hellbark_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));
    public static final RegistryObject<Block> HELLBARK_CABINET = HELPER.createBlock("hellbark_cabinet", BlockSubRegistryHelper.areModsLoaded(CompatOPlenty.FARMERS_ID) ? CompatCabinetSuppliers.CABINET : () -> new ReplacementCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> HELLBARK_TABLE = HELPER.createBlock("hellbark_table", () -> new CompatTableBlock(BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS.get()).instabreak()));
    public static final RegistryObject<Block> VERTICAL_HELLBARK_PLANKS = HELPER.createBlock("vertical_hellbark_planks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS.get())));
    public static final RegistryObject<Block> HELLBARK_BOARDS = HELPER.createBlock("hellbark_boards", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS.get())));

    //Sandstone Blocks
    public static final RegistryObject<Block> WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("white_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.WHITE_SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_white_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.CUT_WHITE_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_white_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.SMOOTH_WHITE_SANDSTONE.get()));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICKS = HELPER.createBlock("white_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_STAIRS = HELPER.createBlock("white_sandstone_brick_stairs", () -> new StairBlock(WHITE_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_SLAB = HELPER.createBlock("white_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_WALL = HELPER.createBlock("white_sandstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createBlock("white_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(WHITE_SANDSTONE_BRICKS.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.ORANGE_SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.CUT_ORANGE_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.SMOOTH_ORANGE_SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICKS = HELPER.createBlock("orange_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SANDSTONE.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_STAIRS = HELPER.createBlock("orange_sandstone_brick_stairs", () -> new StairBlock(ORANGE_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_SLAB = HELPER.createBlock("orange_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_WALL = HELPER.createBlock("orange_sandstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createBlock("orange_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(ORANGE_SANDSTONE_BRICKS.get()));
    public static final RegistryObject<Block> CUT_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_black_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.CUT_WHITE_SANDSTONE.get()));
    public static final RegistryObject<Block> BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("black_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.BLACK_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_black_sandstone_vertical_slab", () -> new VerticalSlabBlock(BOPBlocks.SMOOTH_BLACK_SANDSTONE.get()));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICKS = HELPER.createBlock("black_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SANDSTONE.get())));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_STAIRS = HELPER.createBlock("black_sandstone_brick_stairs", () -> new StairBlock(BLACK_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BLACK_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_SLAB = HELPER.createBlock("black_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLACK_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_WALL = HELPER.createBlock("black_sandstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BLACK_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createBlock("black_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(BLACK_SANDSTONE_BRICKS.get()));

    //Galanos Blocks
    public static final RegistryObject<Block> GALANOS_BLOCK = HELPER.createBlock("galanos_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).requiresCorrectToolForDrops().strength(1.5f, 6f).lightLevel(state -> 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GALANOS_PILLAR = HELPER.createBlock("galanos_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(GALANOS_BLOCK.get())));
    public static final RegistryObject<Block> GALANOS_STAIRS = HELPER.createBlock("galanos_stairs", () -> new StairBlock(() -> GALANOS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(CompatBlocks.GALANOS_BLOCK.get())));
    public static final RegistryObject<Block> GALANOS_SLAB = HELPER.createBlock("galanos_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GALANOS_BLOCK.get())));
    public static final RegistryObject<Block> GALANOS_VERTICAL_SLAB = HELPER.createBlock("galanos_vertical_slab", () -> new VerticalSlabBlock(GALANOS_BLOCK.get()));

    //Polished Rose Quartz Blocks
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ = HELPER.createBlock("polished_rose_quartz", () -> new AmethystBlock(BlockBehaviour.Properties.copy(BOPBlocks.ROSE_QUARTZ_BLOCK.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_SLAB = HELPER.createBlock("polished_rose_quartz_slab", () -> new RoseQuartzSlabBlock(BlockBehaviour.Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_STAIRS = HELPER.createBlock("polished_rose_quartz_stairs", () -> new RoseQuartzStairBlock(POLISHED_ROSE_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_VERTICAL_SLAB = HELPER.createBlock("polished_rose_quartz_vertical_slab", () -> new RoseQuartzVerticalSlabBlock(CompatBlocks.POLISHED_ROSE_QUARTZ.get()));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICKS = HELPER.createBlock("polished_rose_quartz_bricks", () -> new AmethystBlock(BlockBehaviour.Properties.copy(BOPBlocks.ROSE_QUARTZ_BLOCK.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICK_SLAB = HELPER.createBlock("polished_rose_quartz_brick_slab", () -> new RoseQuartzSlabBlock(BlockBehaviour.Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICK_STAIRS = HELPER.createBlock("polished_rose_quartz_brick_stairs", () -> new RoseQuartzStairBlock(POLISHED_ROSE_QUARTZ_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB = HELPER.createBlock("polished_rose_quartz_brick_vertical_slab", () -> new RoseQuartzVerticalSlabBlock(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get()));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICK_WALL = HELPER.createBlock("polished_rose_quartz_brick_wall", () -> new RoseQuartzWallBlock(BlockBehaviour.Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));
    public static final RegistryObject<Block> CRACKED_POLISHED_ROSE_QUARTZ_BRICKS = HELPER.createBlock("cracked_polished_rose_quartz_bricks", () -> new AmethystBlock(BlockBehaviour.Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get())));
    public static final RegistryObject<Block> CHISELED_POLISHED_ROSE_QUARTZ = HELPER.createBlock("chiseled_polished_rose_quartz", () -> new AmethystBlock(BlockBehaviour.Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));

    //Misc
    public static final RegistryObject<Block> FLOWERING_OAK_LEAF_CARPET = HELPER.createBlock("flowering_oak_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.WILLOW_LEAVES.get(), null));
    public static final RegistryObject<Block> FLOWERING_OAK_LEAF_PILE = HELPER.createBlock("flowering_oak_leaf_pile", () -> new LeafPileBlock(CompatProperties.WILLOW.leafPile()));
    public static final RegistryObject<Block> FLOWERING_OAK_HEDGE = HELPER.createFuelBlock("flowering_oak_hedge", () -> new HedgeBlock(null, null, Blocks.OAK_FENCE, BOPBlocks.FLOWERING_OAK_LEAVES.get()), 300);
    public static final RegistryObject<Block> RAINBOW_BIRCH_LEAF_CARPET = HELPER.createBlock("rainbow_birch_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.WILLOW_LEAVES.get(), null));
    public static final RegistryObject<Block> RAINBOW_BIRCH_LEAF_PILE = HELPER.createBlock("rainbow_birch_leaf_pile", () -> new LeafPileBlock(CompatProperties.WILLOW.leafPile()));
    public static final RegistryObject<Block> RAINBOW_BIRCH_HEDGE = HELPER.createFuelBlock("rainbow_birch_hedge", () -> new HedgeBlock(null, null, Blocks.BIRCH_FENCE, BOPBlocks.RAINBOW_BIRCH_LEAVES.get()), 300);
    public static final RegistryObject<Block> ORIGIN_LEAF_CARPET = HELPER.createBlock("origin_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.WILLOW_LEAVES.get(), null));
    public static final RegistryObject<Block> ORIGIN_LEAF_PILE = HELPER.createBlock("origin_leaf_pile", () -> new LeafPileBlock(CompatProperties.WILLOW.leafPile()));
    public static final RegistryObject<Block> ORIGIN_HEDGE = HELPER.createFuelBlock("origin_hedge", () -> new HedgeBlock(null, null, Blocks.OAK_FENCE, BOPBlocks.ORIGIN_LEAVES.get()), 300);
    public static final RegistryObject<Block> MAPLE_LEAF_CARPET = HELPER.createBlock("maple_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.WILLOW_LEAVES.get(), null));
    public static final RegistryObject<Block> MAPLE_LEAF_PILE = HELPER.createBlock("maple_leaf_pile", () -> new LeafPileBlock(CompatProperties.WILLOW.leafPile()));
    public static final RegistryObject<Block> MAPLE_HEDGE = HELPER.createFuelBlock("maple_hedge", () -> new HedgeBlock(null, null, Blocks.OAK_FENCE, BOPBlocks.MAPLE_LEAVES.get()), 300);
    public static final RegistryObject<Block> ORANGE_AUTUMN_LEAF_CARPET = HELPER.createBlock("orange_autumn_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.WILLOW_LEAVES.get(), null));
    public static final RegistryObject<Block> ORANGE_AUTUMN_LEAF_PILE = HELPER.createBlock("orange_autumn_leaf_pile", () -> new LeafPileBlock(CompatProperties.WILLOW.leafPile()));
    public static final RegistryObject<Block> ORANGE_AUTUMN_HEDGE = HELPER.createFuelBlock("orange_autumn_hedge", () -> new HedgeBlock(null, null, Blocks.DARK_OAK_FENCE, BOPBlocks.ORANGE_AUTUMN_LEAVES.get()), 300);
    public static final RegistryObject<Block> YELLOW_AUTUMN_LEAF_CARPET = HELPER.createBlock("yellow_autumn_leaf_carpet", () -> new LeafCarpetBlock("", BOPBlocks.WILLOW_LEAVES.get(), null));
    public static final RegistryObject<Block> YELLOW_AUTUMN_LEAF_PILE = HELPER.createBlock("yellow_autumn_leaf_pile", () -> new LeafPileBlock(CompatProperties.WILLOW.leafPile()));
    public static final RegistryObject<Block> YELLOW_AUTUMN_HEDGE = HELPER.createFuelBlock("yellow_autumn_hedge", () -> new HedgeBlock(null, null, Blocks.BIRCH_FENCE, BOPBlocks.YELLOW_AUTUMN_LEAVES.get()), 300);

    static {
        CreativeModeTabContentsPopulator.mod(CompatOPlenty.MOD_ID)
                .tab(CreativeModeTabs.BUILDING_BLOCKS).addItemsAfter(of(Items.OAK_SLAB).and(anyModLoaded(VSLAB_ID)), JACARANDA_VERTICAL_SLAB)
                .tab(CreativeModeTabs.BUILDING_BLOCKS).addItemsAfter(of(Items.BOOKSHELF).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), JACARANDA_BOOKSHELF)
                .tab(CreativeModeTabs.FUNCTIONAL_BLOCKS).addItemsAfter(of(Items.BOOKSHELF).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), JACARANDA_BOOKSHELF)
                .tab(CreativeModeTabs.FUNCTIONAL_BLOCKS).addItemsAfter(of(Items.BOOKSHELF).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), JACARANDA_LADDER)
                .tab(CreativeModeTabs.BUILDING_BLOCKS).addItemsAfter(of(Items.OAK_FENCE).and(anyModLoaded(QUARK_ID)), JACARANDA_POST)
                .tab(CreativeModeTabs.BUILDING_BLOCKS).addItemsAfter(of(JACARANDA_POST.get()).and(anyModLoaded(QUARK_ID)), STRIPPED_JACARANDA_POST)
                .tab(CreativeModeTabs.NATURAL_BLOCKS).addItemsAfter(of(Blocks.OAK_SAPLING).and(anyModLoaded(QUARK_ID)), JACARANDA_HEDGE)
                .tab(CreativeModeTabs.NATURAL_BLOCKS).addItemsAfter(of(Blocks.OAK_SAPLING).and(anyModLoaded(QUARK_ID)), JACARANDA_LEAF_CARPET)
                .tab(CreativeModeTabs.NATURAL_BLOCKS).addItemsAfter(of(Blocks.OAK_SAPLING).and(anyModLoaded("TODO")), JACARANDA_LEAF_PILE)
                .tab(CreativeModeTabs.FUNCTIONAL_BLOCKS).addItemsAfter(of(Blocks.CHEST).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), JACARANDA_CHESTS.getFirst())
                .tab(CreativeModeTabs.REDSTONE_BLOCKS).addItemsAfter(of(Blocks.TRAPPED_CHEST).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), JACARANDA_CHESTS.getSecond())
                .tab(CreativeModeTabs.FUNCTIONAL_BLOCKS).addItemsAfter(of(Blocks.BEEHIVE).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), JACARANDA_BEEHIVE)
                .tab(CreativeModeTabs.FUNCTIONAL_BLOCKS).addItemsAfter(of(Blocks.CHEST).and(anyModLoaded(FARMERS_ID)), JACARANDA_CABINET)
                .tab(CreativeModeTabs.BUILDING_BLOCKS).addItemsAfter(of(Blocks.BARREL).and(anyModLoaded(TWIGS_ID)), JACARANDA_TABLE)
                .tab(CreativeModeTabs.BUILDING_BLOCKS).addItemsAfter(of(Blocks.CHERRY_PLANKS).and(anyModLoaded(QUARK_ID)), VERTICAL_JACARANDA_PLANKS)
                .tab(CreativeModeTabs.BUILDING_BLOCKS).addItemsAfter(of(Blocks.STRIPPED_CHERRY_LOG).and(anyModLoaded(TWIGS_ID)), JACARANDA_BOARDS)
        ;
    }

}
