package seleneandmana.compatoplenty.core.registry;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.init.ModBlocks;
import com.minecraftabnormals.abnormals_core.common.blocks.*;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsTrappedChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsStandingSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsWallSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.WoodPostBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.mojang.datafixers.util.Pair;
import seleneandmana.compatoplenty.common.blocks.CompatPantryBlock;
import seleneandmana.compatoplenty.core.CompatOPlenty;
import seleneandmana.compatoplenty.core.other.CompatProperties;
import net.minecraft.block.*;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatBlocks {
    public static final BlockSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getBlockSubHelper();

    //Cherry
    public static final RegistryObject<Block> CHERRY_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_vertical_slab",() -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_CHERRY_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_cherry_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_bookshelf", () -> new BookshelfBlock(CompatProperties.CHERRY_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_ladder", () -> new AbnormalsLadderBlock(CompatProperties.CHERRY_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_CHERRY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_cherry_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_post", () -> new WoodPostBlock(STRIPPED_CHERRY_POST,  AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_CHERRY_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "white_cherry_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> PINK_CHERRY_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "pink_cherry_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> WHITE_CHERRY_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_cherry_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> PINK_CHERRY_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "pink_cherry_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> CHERRY_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "cherry", MaterialColor.COLOR_RED);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> CHERRY_SIGNS = HELPER.createSignBlock("cherry", MaterialColor.COLOR_RED);
    public static final RegistryObject<Block> CHERRY_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "cherry_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> CHERRY_PANTRY = HELPER.createBlock("cherry_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Jacaranda
    public static final RegistryObject<Block> JACARANDA_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_vertical_slab",() -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_JACARANDA_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_jacaranda_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_bookshelf", () -> new BookshelfBlock(CompatProperties.JACARANDA_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_ladder", () -> new AbnormalsLadderBlock(CompatProperties.JACARANDA_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_JACARANDA_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_jacaranda_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_post", () -> new WoodPostBlock(STRIPPED_JACARANDA_POST,  AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> JACARANDA_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "jacaranda_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> JACARANDA_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "jacaranda", MaterialColor.TERRACOTTA_PINK);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> JACARANDA_SIGNS = HELPER.createSignBlock("jacaranda", MaterialColor.TERRACOTTA_PINK);
    public static final RegistryObject<Block> JACARANDA_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "jacaranda_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> JACARANDA_PANTRY = HELPER.createBlock("jacaranda_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Fir
    public static final RegistryObject<Block> FIR_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_vertical_slab",() -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_FIR_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_fir_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_bookshelf", () -> new BookshelfBlock(CompatProperties.FIR_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_ladder", () -> new AbnormalsLadderBlock(CompatProperties.FIR_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_FIR_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_fir_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_post", () -> new WoodPostBlock(STRIPPED_FIR_POST,  AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> FIR_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "fir_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> FIR_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "fir", MaterialColor.TERRACOTTA_WHITE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> FIR_SIGNS = HELPER.createSignBlock("fir", MaterialColor.TERRACOTTA_WHITE);
    public static final RegistryObject<Block> FIR_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "fir_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> FIR_PANTRY = HELPER.createBlock("fir_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Redwood
    public static final RegistryObject<Block> REDWOOD_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_REDWOOD_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_redwood_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_bookshelf", () -> new BookshelfBlock(CompatProperties.REDWOOD_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_ladder", () -> new AbnormalsLadderBlock(CompatProperties.REDWOOD_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_REDWOOD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_redwood_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_post", () -> new WoodPostBlock(STRIPPED_REDWOOD_POST,  AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> REDWOOD_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "redwood_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> REDWOOD_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "redwood", MaterialColor.TERRACOTTA_ORANGE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> REDWOOD_SIGNS = HELPER.createSignBlock("redwood", MaterialColor.TERRACOTTA_ORANGE);
    public static final RegistryObject<Block> REDWOOD_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "redwood_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> REDWOOD_PANTRY = HELPER.createBlock("redwood_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Mahogany
    public static final RegistryObject<Block> MAHOGANY_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.mahogany_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_MAHOGANY_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_mahogany_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.mahogany_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAHOGANY_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_bookshelf", () -> new BookshelfBlock(CompatProperties.MAHOGANY_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAHOGANY_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_ladder", () -> new AbnormalsLadderBlock(CompatProperties.MAHOGANY_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_MAHOGANY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_mahogany_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.mahogany_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAHOGANY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_post", () -> new WoodPostBlock(STRIPPED_MAHOGANY_POST,  AbstractBlock.Properties.copy(BOPBlocks.mahogany_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAHOGANY_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.mahogany_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAHOGANY_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "mahogany_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> MAHOGANY_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "mahogany", MaterialColor.TERRACOTTA_PINK);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> MAHOGANY_SIGNS = HELPER.createSignBlock("mahogany", MaterialColor.TERRACOTTA_PINK);
    public static final RegistryObject<Block> MAHOGANY_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "mahogany_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAHOGANY_PANTRY = HELPER.createBlock("mahogany_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Willow
    public static final RegistryObject<Block> WILLOW_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.willow_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_WILLOW_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_willow_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.willow_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WILLOW_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_bookshelf", () -> new BookshelfBlock(CompatProperties.WILLOW_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WILLOW_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_ladder", () -> new AbnormalsLadderBlock(CompatProperties.WILLOW_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_WILLOW_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_willow_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.willow_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WILLOW_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_post", () -> new WoodPostBlock(STRIPPED_WILLOW_POST,  AbstractBlock.Properties.copy(BOPBlocks.willow_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WILLOW_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.willow_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> WILLOW_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "willow_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> WILLOW_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "willow", MaterialColor.TERRACOTTA_LIGHT_GREEN);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> WILLOW_SIGNS = HELPER.createSignBlock("willow", MaterialColor.TERRACOTTA_LIGHT_GREEN);
    public static final RegistryObject<Block> WILLOW_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "willow_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> WILLOW_PANTRY = HELPER.createBlock("willow_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Magic
    public static final RegistryObject<Block> MAGIC_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.magic_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_MAGIC_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_magic_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.magic_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGIC_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_bookshelf", () -> new BookshelfBlock(CompatProperties.MAGIC_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGIC_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_ladder", () -> new AbnormalsLadderBlock(CompatProperties.MAGIC_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_MAGIC_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_magic_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.magic_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGIC_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_post", () -> new WoodPostBlock(STRIPPED_MAGIC_POST,  AbstractBlock.Properties.copy(BOPBlocks.magic_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGIC_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.magic_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAGIC_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "magic_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> MAGIC_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "magic", MaterialColor.COLOR_BLUE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> MAGIC_SIGNS = HELPER.createSignBlock("magic", MaterialColor.COLOR_BLUE);
    public static final RegistryObject<Block> MAGIC_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "magic_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAGIC_PANTRY = HELPER.createBlock("magic_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Dead
    public static final RegistryObject<Block> DEAD_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.dead_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_DEAD_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_dead_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.dead_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_bookshelf", () -> new BookshelfBlock(CompatProperties.DEAD_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_ladder", () -> new AbnormalsLadderBlock(CompatProperties.DEAD_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_DEAD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_dead_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.dead_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_post", () -> new WoodPostBlock(STRIPPED_DEAD_POST,  AbstractBlock.Properties.copy(BOPBlocks.dead_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.dead_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> DEAD_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "dead_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> DEAD_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "dead", MaterialColor.STONE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> DEAD_SIGNS = HELPER.createSignBlock("dead", MaterialColor.STONE);
    public static final RegistryObject<Block> DEAD_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "dead_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> DEAD_PANTRY = HELPER.createBlock("dead_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Umbran
    public static final RegistryObject<Block> UMBRAN_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.umbran_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_UMBRAN_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_umbran_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.umbran_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> UMBRAN_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_bookshelf", () -> new BookshelfBlock(CompatProperties.UMBRAN_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> UMBRAN_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_ladder", () -> new AbnormalsLadderBlock(CompatProperties.UMBRAN_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_UMBRAN_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_umbran_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.umbran_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> UMBRAN_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_post", () -> new WoodPostBlock(STRIPPED_UMBRAN_POST,  AbstractBlock.Properties.copy(BOPBlocks.umbran_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> UMBRAN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.umbran_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> UMBRAN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "umbran_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> UMBRAN_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "umbran", MaterialColor.TERRACOTTA_BLUE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> UMBRAN_SIGNS = HELPER.createSignBlock("umbran", MaterialColor.TERRACOTTA_BLUE);
    public static final RegistryObject<Block> UMBRAN_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "umbran_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> UMBRAN_PANTRY = HELPER.createBlock("umbran_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Palm
    public static final RegistryObject<Block> PALM_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.palm_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_PALM_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_palm_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.palm_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PALM_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_bookshelf", () -> new BookshelfBlock(CompatProperties.PALM_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PALM_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_ladder", () -> new AbnormalsLadderBlock(CompatProperties.PALM_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_PALM_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_palm_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.palm_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PALM_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_post", () -> new WoodPostBlock(STRIPPED_PALM_POST,  AbstractBlock.Properties.copy(BOPBlocks.palm_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PALM_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.palm_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> PALM_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "palm_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> PALM_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "palm", MaterialColor.TERRACOTTA_YELLOW);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> PALM_SIGNS = HELPER.createSignBlock("palm", MaterialColor.TERRACOTTA_YELLOW);
    public static final RegistryObject<Block> PALM_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "palm_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> PALM_PANTRY = HELPER.createBlock("palm_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Hellbark
    public static final RegistryObject<Block> HELLBARK_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "hellbark_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.hellbark_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_HELLBARK_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_hellbark_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.hellbark_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELLBARK_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "hellbark_bookshelf", () -> new BookshelfBlock(CompatProperties.HELLBARK_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELLBARK_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "hellbark_ladder", () -> new AbnormalsLadderBlock(CompatProperties.HELLBARK_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_HELLBARK_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_hellbark_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.hellbark_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELLBARK_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "hellbark_post", () -> new WoodPostBlock(STRIPPED_HELLBARK_POST,  AbstractBlock.Properties.copy(BOPBlocks.hellbark_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELLBARK_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "hellbark_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.hellbark_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> HELLBARK_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "hellbark_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> HELLBARK_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "hellbark", MaterialColor.TERRACOTTA_GRAY);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> HELLBARK_SIGNS = HELPER.createSignBlock("hellbark", MaterialColor.TERRACOTTA_GRAY);
    public static final RegistryObject<Block> HELLBARK_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "hellbark_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> HELLBARK_PANTRY = HELPER.createBlock("hellbark_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
    
    //Sandstone Blocks
    public static final RegistryObject<Block> WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.white_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_white_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.smooth_white_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_bricks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.white_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_stairs", () -> new AbnormalsStairsBlock(WHITE_SANDSTONE_BRICKS.get().defaultBlockState(), AbstractBlock.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.orange_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.smooth_orange_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_bricks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.orange_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_stairs", () -> new AbnormalsStairsBlock(ORANGE_SANDSTONE_BRICKS.get().defaultBlockState(), AbstractBlock.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.black_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_black_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.smooth_black_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_bricks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.black_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_stairs", () -> new AbnormalsStairsBlock(BLACK_SANDSTONE_BRICKS.get().defaultBlockState(), AbstractBlock.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);


    //Misc
    public static final RegistryObject<Block> FLOWERING_OAK_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "flowering_oak_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> FLOWERING_OAK_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "flowering_oak_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> RAINBOW_BIRCH_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "rainbow_birch_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> RAINBOW_BIRCH_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "rainbow_birch_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.BIRCH_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORIGIN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "origin_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORIGIN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "origin_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAPLE_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "maple_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAPLE_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "maple_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORANGE_AUTUMN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_autumn_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORANGE_AUTUMN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "orange_autumn_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> YELLOW_AUTUMN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "yellow_autumn_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> YELLOW_AUTUMN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "yellow_autumn_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.BIRCH_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MUD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "mud_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.mud_bricks)), ItemGroup.TAB_BUILDING_BLOCKS);
}
