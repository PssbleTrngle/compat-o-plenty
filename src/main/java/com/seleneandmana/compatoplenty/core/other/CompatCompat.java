package com.seleneandmana.compatoplenty.core.other;

import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.teamabnormals.blueprint.core.util.DataUtil;

public class CompatCompat {
    public static void compatList() {
        flammability();
        compostablility();
    }

    private static void registerCompostables(CompatBlocks.LeafSet set) {
        DataUtil.registerCompostable(set.leafCarpet().get(), 0.3f);
        DataUtil.registerCompostable(set.leafPile().get(), 0.3f);
    }

    private static void registerFlammables(CompatBlocks.LeafSet set) {
        DataUtil.registerFlammable(set.leafCarpet().get(), 30, 60);
        DataUtil.registerFlammable(set.leafPile().get(), 30, 60);
        DataUtil.registerFlammable(set.hedge().get(), 5, 20);
    }

    private static void registerFlammables(CompatBlocks.WoodSet set) {
        DataUtil.registerFlammable(set.post().get(), 5, 20);
        DataUtil.registerFlammable(set.strippedPost().get(), 5, 20);
        DataUtil.registerFlammable(set.verticalSlab().get(), 5, 20);
        DataUtil.registerFlammable(set.verticalPlanks().get(), 5, 20);
        DataUtil.registerFlammable(set.beehive().get(), 5, 20);
        DataUtil.registerFlammable(set.bookshelf().get(), 5, 20);
        DataUtil.registerFlammable(set.table().get(), 5, 20);
        DataUtil.registerFlammable(set.boards().get(), 5, 20);
    }

    public static void flammability() {
        registerFlammables(CompatBlocks.FIR);
        registerFlammables(CompatBlocks.JACARANDA);
        registerFlammables(CompatBlocks.REDWOOD);
        registerFlammables(CompatBlocks.MAHOGANY);
        registerFlammables(CompatBlocks.WILLOW);
        registerFlammables(CompatBlocks.MAGIC);
        registerFlammables(CompatBlocks.DEAD);
        registerFlammables(CompatBlocks.UMBRAN);
        registerFlammables(CompatBlocks.PALM);
        registerFlammables(CompatBlocks.RAINBOW_BIRCH);
        registerFlammables(CompatBlocks.ORANGE_AUTUMN);
        registerFlammables(CompatBlocks.YELLOW_AUTUMN);
        registerFlammables(CompatBlocks.MAPLE);
        registerFlammables(CompatBlocks.ORIGIN);
        registerFlammables(CompatBlocks.FLOWERING_OAK);
    }

    public static void compostablility() {
        registerCompostables(CompatBlocks.FIR.leaveSet());
        registerCompostables(CompatBlocks.JACARANDA.leaveSet());
        registerCompostables(CompatBlocks.REDWOOD.leaveSet());
        registerCompostables(CompatBlocks.MAHOGANY.leaveSet());
        registerCompostables(CompatBlocks.WILLOW.leaveSet());
        registerCompostables(CompatBlocks.MAGIC.leaveSet());
        registerCompostables(CompatBlocks.DEAD.leaveSet());
        registerCompostables(CompatBlocks.UMBRAN.leaveSet());
        registerCompostables(CompatBlocks.PALM.leaveSet());
        registerCompostables(CompatBlocks.RAINBOW_BIRCH);
        registerCompostables(CompatBlocks.ORANGE_AUTUMN);
        registerCompostables(CompatBlocks.YELLOW_AUTUMN);
        registerCompostables(CompatBlocks.MAPLE);
        registerCompostables(CompatBlocks.ORIGIN);
        registerCompostables(CompatBlocks.FLOWERING_OAK);
    }
}
