package com.seleneandmana.compatoplenty.core.data.client;

import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, CompatOPlenty.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Vertical Slabs
        add(CompatBlocks.JACARANDA.verticalSlab().get(), "Jacaranda Vertical Slab");
        add(CompatBlocks.FIR.verticalSlab().get(), "Fir Vertical Slab");
        add(CompatBlocks.REDWOOD.verticalSlab().get(), "Redwood Vertical Slab");
        add(CompatBlocks.MAHOGANY.verticalSlab().get(), "Mahogany Vertical Slab");
        add(CompatBlocks.WILLOW.verticalSlab().get(), "Willow Vertical Slab");
        add(CompatBlocks.MAGIC.verticalSlab().get(), "Magic Vertical Slab");
        add(CompatBlocks.DEAD.verticalSlab().get(), "Dead Vertical Slab");
        add(CompatBlocks.UMBRAN.verticalSlab().get(), "Umbran Vertical Slab");
        add(CompatBlocks.PALM.verticalSlab().get(), "Palm Vertical Slab");
        add(CompatBlocks.HELLBARK.verticalSlab().get(), "Hellbark Vertical Slab");
        add(CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), "White Sandstone Vertical Slab");
        add(CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), "Cut White Sandstone Vertical Slab");
        add(CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), "Smooth White Sandstone Vertical Slab");
        add(CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), "White Sandstone Brick Vertical Slab");
        add(CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), "Orange Sandstone Vertical Slab");
        add(CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), "Cut Orange Sandstone Vertical Slab");
        add(CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), "Smooth Orange Sandstone Vertical Slab");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), "Orange Sandstone Brick Vertical Slab");
        add(CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), "Black Sandstone Vertical Slab");
        add(CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), "Cut Black Sandstone Vertical Slab");
        add(CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), "Smooth Black Sandstone Vertical Slab");
        add(CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(), "Black Sandstone Brick Vertical Slab");
        add(CompatBlocks.GALANOS_VERTICAL_SLAB.get(), "Galanos Vertical Slab");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), "Polished Rose Quartz Vertical Slab");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), "Polished Rose Quartz Brick Vertical Slab");

        //Bookshelves
        add(CompatBlocks.JACARANDA.bookshelf().get(), "Jacaranda Bookshelf");
        add(CompatBlocks.FIR.bookshelf().get(), "Fir Bookshelf");
        add(CompatBlocks.REDWOOD.bookshelf().get(), "Redwood Bookshelf");
        add(CompatBlocks.MAHOGANY.bookshelf().get(), "Mahogany Bookshelf");
        add(CompatBlocks.WILLOW.bookshelf().get(), "Willow Bookshelf");
        add(CompatBlocks.MAGIC.bookshelf().get(), "Magic Bookshelf");
        add(CompatBlocks.DEAD.bookshelf().get(), "Dead Bookshelf");
        add(CompatBlocks.UMBRAN.bookshelf().get(), "Umbran Bookshelf");
        add(CompatBlocks.PALM.bookshelf().get(), "Palm Bookshelf");
        add(CompatBlocks.HELLBARK.bookshelf().get(), "Hellbark Bookshelf");

        //Ladders
        add(CompatBlocks.JACARANDA.ladder().get(), "Jacaranda Ladder");
        add(CompatBlocks.FIR.ladder().get(), "Fir Ladder");
        add(CompatBlocks.REDWOOD.ladder().get(), "Redwood Ladder");
        add(CompatBlocks.MAHOGANY.ladder().get(), "Mahogany Ladder");
        add(CompatBlocks.WILLOW.ladder().get(), "Willow Ladder");
        add(CompatBlocks.MAGIC.ladder().get(), "Magic Ladder");
        add(CompatBlocks.DEAD.ladder().get(), "Dead Ladder");
        add(CompatBlocks.UMBRAN.ladder().get(), "Umbran Ladder");
        add(CompatBlocks.PALM.ladder().get(), "Palm Ladder");
        add(CompatBlocks.HELLBARK.ladder().get(), "Hellbark Ladder");

        //Posts
        add(CompatBlocks.JACARANDA.post().get(), "Jacaranda Post");
        add(CompatBlocks.FIR.post().get(), "Fir Post");
        add(CompatBlocks.REDWOOD.post().get(), "Redwood Post");
        add(CompatBlocks.MAHOGANY.post().get(), "Mahogany Post");
        add(CompatBlocks.WILLOW.post().get(), "Willow Post");
        add(CompatBlocks.MAGIC.post().get(), "Magic Post");
        add(CompatBlocks.DEAD.post().get(), "Dead Post");
        add(CompatBlocks.UMBRAN.post().get(), "Umbran Post");
        add(CompatBlocks.PALM.post().get(), "Palm Post");
        add(CompatBlocks.HELLBARK.post().get(), "Hellbark Post");

        //Stripped Posts
        add(CompatBlocks.JACARANDA.strippedPost().get(), "Stripped Jacaranda Post");
        add(CompatBlocks.FIR.strippedPost().get(), "Stripped Fir Post");
        add(CompatBlocks.REDWOOD.strippedPost().get(), "Stripped Redwood Post");
        add(CompatBlocks.MAHOGANY.strippedPost().get(), "Stripped Mahogany Post");
        add(CompatBlocks.WILLOW.strippedPost().get(), "Stripped Willow Post");
        add(CompatBlocks.MAGIC.strippedPost().get(), "Stripped Magic Post");
        add(CompatBlocks.DEAD.strippedPost().get(), "Stripped Dead Post");
        add(CompatBlocks.UMBRAN.strippedPost().get(), "Stripped Umbran Post");
        add(CompatBlocks.PALM.strippedPost().get(), "Stripped Palm Post");
        add(CompatBlocks.HELLBARK.strippedPost().get(), "Stripped Hellbark Post");

        //Leaf Hedges
        add(CompatBlocks.JACARANDA.leaveSet().hedge().get(), "Jacaranda Leaf Hedge");
        add(CompatBlocks.FIR.leaveSet().hedge().get(), "Fir Leaf Hedge");
        add(CompatBlocks.REDWOOD.leaveSet().hedge().get(), "Redwood Leaf Hedge");
        add(CompatBlocks.MAHOGANY.leaveSet().hedge().get(), "Mahogany Leaf Hedge");
        add(CompatBlocks.WILLOW.leaveSet().hedge().get(), "Willow Leaf Hedge");
        add(CompatBlocks.MAGIC.leaveSet().hedge().get(), "Magic Leaf Hedge");
        add(CompatBlocks.DEAD.leaveSet().hedge().get(), "Dead Leaf Hedge");
        add(CompatBlocks.UMBRAN.leaveSet().hedge().get(), "Umbran Leaf Hedge");
        add(CompatBlocks.PALM.leaveSet().hedge().get(), "Palm Leaf Hedge");
        add(CompatBlocks.HELLBARK.leaveSet().hedge().get(), "Hellbark Leaf Hedge");
        add(CompatBlocks.FLOWERING_OAK.hedge().get(), "Flowering Oak Leaf Hedge");
        add(CompatBlocks.RAINBOW_BIRCH.hedge().get(), "Rainbow Birch Leaf Hedge");
        add(CompatBlocks.ORIGIN.hedge().get(), "Origin Leaf Hedge");
        add(CompatBlocks.MAPLE.hedge().get(), "Maple Leaf Hedge");
        add(CompatBlocks.ORANGE_AUTUMN.hedge().get(), "Orange Autumn Leaf Hedge");
        add(CompatBlocks.YELLOW_AUTUMN.hedge().get(), "Yellow Autumn Leaf Hedge");

        //Leaf Carpets
        add(CompatBlocks.JACARANDA.leaveSet().leafCarpet().get(), "Jacaranda Leaf Carpet");
        add(CompatBlocks.FIR.leaveSet().leafCarpet().get(), "Fir Leaf Carpet");
        add(CompatBlocks.REDWOOD.leaveSet().leafCarpet().get(), "Redwood Leaf Carpet");
        add(CompatBlocks.MAHOGANY.leaveSet().leafCarpet().get(), "Mahogany Leaf Carpet");
        add(CompatBlocks.WILLOW.leaveSet().leafCarpet().get(), "Willow Leaf Carpet");
        add(CompatBlocks.MAGIC.leaveSet().leafCarpet().get(), "Magic Leaf Carpet");
        add(CompatBlocks.DEAD.leaveSet().leafCarpet().get(), "Dead Leaf Carpet");
        add(CompatBlocks.UMBRAN.leaveSet().leafCarpet().get(), "Umbran Leaf Carpet");
        add(CompatBlocks.PALM.leaveSet().leafCarpet().get(), "Palm Leaf Carpet");
        add(CompatBlocks.HELLBARK.leaveSet().leafCarpet().get(), "Hellbark Leaf Carpet");
        add(CompatBlocks.FLOWERING_OAK.leafCarpet().get(), "Flowering Oak Leaf Carpet");
        add(CompatBlocks.RAINBOW_BIRCH.leafCarpet().get(), "Rainbow Birch Leaf Carpet");
        add(CompatBlocks.ORIGIN.leafCarpet().get(), "Origin Leaf Carpet");
        add(CompatBlocks.MAPLE.leafCarpet().get(), "Maple Leaf Carpet");
        add(CompatBlocks.ORANGE_AUTUMN.leafCarpet().get(), "Orange Autumn Leaf Carpet");
        add(CompatBlocks.YELLOW_AUTUMN.leafCarpet().get(), "Yellow Autumn Leaf Carpet");

        //Leaf Piles
        add(CompatBlocks.JACARANDA.leaveSet().leafPile().get(), "Pile of Jacaranda Leaves");
        add(CompatBlocks.FIR.leaveSet().leafPile().get(), "Pile of Fir Leaves");
        add(CompatBlocks.REDWOOD.leaveSet().leafPile().get(), "Pile of Redwood Leaves");
        add(CompatBlocks.MAHOGANY.leaveSet().leafPile().get(), "Pile of Mahogany Leaves");
        add(CompatBlocks.WILLOW.leaveSet().leafPile().get(), "Pile of Willow Leaves");
        add(CompatBlocks.MAGIC.leaveSet().leafPile().get(), "Pile of Magic Leaves");
        add(CompatBlocks.DEAD.leaveSet().leafPile().get(), "Pile of Dead Leaves");
        add(CompatBlocks.UMBRAN.leaveSet().leafPile().get(), "Pile of Umbran Leaves");
        add(CompatBlocks.PALM.leaveSet().leafPile().get(), "Pile of Palm Leaves");
        add(CompatBlocks.HELLBARK.leaveSet().leafPile().get(), "Pile of Hellbark Leaves");
        add(CompatBlocks.FLOWERING_OAK.leafPile().get(), "Pile of Flowering Oak Leaves");
        add(CompatBlocks.RAINBOW_BIRCH.leafPile().get(), "Pile of Rainbow Birch Leaves");
        add(CompatBlocks.ORIGIN.leafPile().get(), "Pile of Origin Leaves");
        add(CompatBlocks.MAPLE.leafPile().get(), "Pile of Maple Leaves");
        add(CompatBlocks.ORANGE_AUTUMN.leafPile().get(), "Pile of Orange Autumn Leaves");
        add(CompatBlocks.YELLOW_AUTUMN.leafPile().get(), "Pile of Yellow Autumn Leaves");

        //Chests
        add(CompatBlocks.JACARANDA.chest().get(), "Jacaranda Chest");
        add(CompatBlocks.FIR.chest().get(), "Fir Chest");
        add(CompatBlocks.REDWOOD.chest().get(), "Redwood Chest");
        add(CompatBlocks.MAHOGANY.chest().get(), "Mahogany Chest");
        add(CompatBlocks.WILLOW.chest().get(), "Willow Chest");
        add(CompatBlocks.MAGIC.chest().get(), "Magic Chest");
        add(CompatBlocks.DEAD.chest().get(), "Dead Chest");
        add(CompatBlocks.UMBRAN.chest().get(), "Umbran Chest");
        add(CompatBlocks.PALM.chest().get(), "Palm Chest");
        add(CompatBlocks.HELLBARK.chest().get(), "Hellbark Chest");

        //Trapped Chests
        add(CompatBlocks.JACARANDA.trappedChest().get(), "Jacaranda Trapped Chest");
        add(CompatBlocks.FIR.trappedChest().get(), "Fir Trapped Chest");
        add(CompatBlocks.REDWOOD.trappedChest().get(), "Redwood Trapped Chest");
        add(CompatBlocks.MAHOGANY.trappedChest().get(), "Mahogany Trapped Chest");
        add(CompatBlocks.WILLOW.trappedChest().get(), "Willow Trapped Chest");
        add(CompatBlocks.MAGIC.trappedChest().get(), "Magic Trapped Chest");
        add(CompatBlocks.DEAD.trappedChest().get(), "Dead Trapped Chest");
        add(CompatBlocks.UMBRAN.trappedChest().get(), "Umbran Trapped Chest");
        add(CompatBlocks.PALM.trappedChest().get(), "Palm Trapped Chest");
        add(CompatBlocks.HELLBARK.trappedChest().get(), "Hellbark Trapped Chest");

        //Beehives
        add(CompatBlocks.JACARANDA.beehive().get(), "Jacaranda Beehive");
        add(CompatBlocks.FIR.beehive().get(), "Fir Beehive");
        add(CompatBlocks.REDWOOD.beehive().get(), "Redwood Beehive");
        add(CompatBlocks.MAHOGANY.beehive().get(), "Mahogany Beehive");
        add(CompatBlocks.WILLOW.beehive().get(), "Willow Beehive");
        add(CompatBlocks.MAGIC.beehive().get(), "Magic Beehive");
        add(CompatBlocks.DEAD.beehive().get(), "Dead Beehive");
        add(CompatBlocks.UMBRAN.beehive().get(), "Umbran Beehive");
        add(CompatBlocks.PALM.beehive().get(), "Palm Beehive");
        add(CompatBlocks.HELLBARK.beehive().get(), "Hellbark Beehive");

        //Cabinets
        add(CompatBlocks.JACARANDA.cabinet().get(), "Jacaranda Cabinet");
        add(CompatBlocks.FIR.cabinet().get(), "Fir Cabinet");
        add(CompatBlocks.REDWOOD.cabinet().get(), "Redwood Cabinet");
        add(CompatBlocks.MAHOGANY.cabinet().get(), "Mahogany Cabinet");
        add(CompatBlocks.WILLOW.cabinet().get(), "Willow Cabinet");
        add(CompatBlocks.MAGIC.cabinet().get(), "Magic Cabinet");
        add(CompatBlocks.DEAD.cabinet().get(), "Dead Cabinet");
        add(CompatBlocks.UMBRAN.cabinet().get(), "Umbran Cabinet");
        add(CompatBlocks.PALM.cabinet().get(), "Palm Cabinet");
        add(CompatBlocks.HELLBARK.cabinet().get(), "Hellbark Cabinet");

        //Tables
        add(CompatBlocks.JACARANDA.table().get(), "Jacaranda Table");
        add(CompatBlocks.FIR.table().get(), "Fir Table");
        add(CompatBlocks.REDWOOD.table().get(), "Redwood Table");
        add(CompatBlocks.MAHOGANY.table().get(), "Mahogany Table");
        add(CompatBlocks.WILLOW.table().get(), "Willow Table");
        add(CompatBlocks.MAGIC.table().get(), "Magic Table");
        add(CompatBlocks.DEAD.table().get(), "Dead Table");
        add(CompatBlocks.UMBRAN.table().get(), "Umbran Table");
        add(CompatBlocks.PALM.table().get(), "Palm Table");
        add(CompatBlocks.HELLBARK.table().get(), "Hellbark Table");

        //Vertical Planks
        add(CompatBlocks.JACARANDA.verticalPlanks().get(), "Vertical Jacaranda Planks");
        add(CompatBlocks.FIR.verticalPlanks().get(), "Vertical Fir Planks");
        add(CompatBlocks.REDWOOD.verticalPlanks().get(), "Vertical Redwood Planks");
        add(CompatBlocks.MAHOGANY.verticalPlanks().get(), "Vertical Mahogany Planks");
        add(CompatBlocks.WILLOW.verticalPlanks().get(), "Vertical Willow Planks");
        add(CompatBlocks.MAGIC.verticalPlanks().get(), "Vertical Magic Planks");
        add(CompatBlocks.DEAD.verticalPlanks().get(), "Vertical Dead Planks");
        add(CompatBlocks.UMBRAN.verticalPlanks().get(), "Vertical Umbran Planks");
        add(CompatBlocks.PALM.verticalPlanks().get(), "Vertical Palm Planks");
        add(CompatBlocks.HELLBARK.verticalPlanks().get(), "Vertical Hellbark Planks");

        //Boards
        //Tables
        add(CompatBlocks.JACARANDA.boards().get(), "Jacaranda Boards");
        add(CompatBlocks.FIR.boards().get(), "Fir Boards");
        add(CompatBlocks.REDWOOD.boards().get(), "Redwood Boards");
        add(CompatBlocks.MAHOGANY.boards().get(), "Mahogany Boards");
        add(CompatBlocks.WILLOW.boards().get(), "Willow Boards");
        add(CompatBlocks.MAGIC.boards().get(), "Magic Boards");
        add(CompatBlocks.DEAD.boards().get(), "Dead Boards");
        add(CompatBlocks.UMBRAN.boards().get(), "Umbran Boards");
        add(CompatBlocks.PALM.boards().get(), "Palm Boards");
        add(CompatBlocks.HELLBARK.boards().get(), "Hellbark Boards");

        //Sandstone Bricks
        add(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), "White Sandstone Bricks");
        add(CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), "White Sandstone Brick Slab");
        add(CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS.get(), "White Sandstone Brick Stairs");
        add(CompatBlocks.WHITE_SANDSTONE_BRICK_WALL.get(), "White Sandstone Brick Wall");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), "Orange Sandstone Bricks");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), "Orange Sandstone Brick Slab");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get(), "Orange Sandstone Brick Stairs");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get(), "Orange Sandstone Brick Wall");
        add(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), "Black Sandstone Bricks");
        add(CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), "Black Sandstone Brick Slab");
        add(CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get(), "Black Sandstone Brick Stairs");
        add(CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get(), "Black Sandstone Brick Wall");

        //Galanos
        add(CompatBlocks.GALANOS_BLOCK.get(), "Galanos Block");
        add(CompatBlocks.GALANOS_SLAB.get(), "Galanos Slab");
        add(CompatBlocks.GALANOS_STAIRS.get(), "Galanos Stairs");
        add(CompatBlocks.GALANOS_PILLAR.get(), "Galanos Pillar");

        //Polished Rose Quartz
        add(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), "Polished Rose Quartz");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), "Polished Rose Quartz Slab");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(), "Polished Rose Quartz Stairs");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), "Polished Rose Quartz Bricks");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), "Polished Rose Quartz Brick Slab");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get(), "Polished Rose Quartz Brick Stairs");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(), "Polished Rose Quartz Brick Wall");
        add(CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get(), "Cracked Polished Rose Quartz Bricks");
        add(CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get(), "Chiseled Polished Rose Quartz");

        //Furnace Boats
        add(CompatItems.JACARANDA_FURNACE_BOAT.get(), "Jacaranda Boat with Furnace");
        add(CompatItems.FIR_FURNACE_BOAT.get(), "Fir Boat with Furnace");
        add(CompatItems.REDWOOD_FURNACE_BOAT.get(), "Redwood Boat with Furnace");
        add(CompatItems.MAHOGANY_FURNACE_BOAT.get(), "Mahogany Boat with Furnace");
        add(CompatItems.WILLOW_FURNACE_BOAT.get(), "Willow Boat with Furnace");
        add(CompatItems.MAGIC_FURNACE_BOAT.get(), "Magic Boat with Furnace");
        add(CompatItems.DEAD_FURNACE_BOAT.get(), "Dead Boat with Furnace");
        add(CompatItems.UMBRAN_FURNACE_BOAT.get(), "Umbran Boat with Furnace");
        add(CompatItems.PALM_FURNACE_BOAT.get(), "Palm Boat with Furnace");
        add(CompatItems.HELLBARK_FURNACE_BOAT.get(), "Hellbark Boat with Furnace");

        //Large Boats
        add(CompatItems.LARGE_JACARANDA_BOAT.get(), "Large Jacaranda Boat");
        add(CompatItems.LARGE_FIR_BOAT.get(), "Large Fir Boat");
        add(CompatItems.LARGE_REDWOOD_BOAT.get(), "Large Redwood Boat");
        add(CompatItems.LARGE_MAHOGANY_BOAT.get(), "Large Mahogany Boat");
        add(CompatItems.LARGE_WILLOW_BOAT.get(), "Large Willow Boat");
        add(CompatItems.LARGE_MAGIC_BOAT.get(), "Large Magic Boat");
        add(CompatItems.LARGE_DEAD_BOAT.get(), "Large Dead Boat");
        add(CompatItems.LARGE_UMBRAN_BOAT.get(), "Large Umbran Boat");
        add(CompatItems.LARGE_PALM_BOAT.get(), "Large Palm Boat");
        add(CompatItems.LARGE_HELLBARK_BOAT.get(), "Large Hellbark Boat");

        //Misc
        add(CompatItems.GLOWING_MOSS_PASTE.get(), "Glowing Moss Paste");
    }
}
