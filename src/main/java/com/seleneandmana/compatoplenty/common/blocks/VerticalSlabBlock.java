package com.seleneandmana.compatoplenty.common.blocks;

import net.mehvahdjukaar.vsc.CutBlockType;
import net.mehvahdjukaar.vsc.temp.TempVerticalSlabBlock;
import net.minecraft.world.level.block.Block;

public class VerticalSlabBlock extends TempVerticalSlabBlock {
    public VerticalSlabBlock(Block parent) {
        super(Properties.copy(parent), new CutBlockType(null, parent, null));
    }
}
