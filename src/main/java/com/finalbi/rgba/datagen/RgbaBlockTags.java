package com.finalbi.rgba.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import com.finalbi.rgba.Main;
import com.finalbi.rgba.setup.Registration;

public class RgbaBlockTags extends BlockTagsProvider {


    public RgbaBlockTags(DataGenerator p_126511_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126511_, Main.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.BURMUDIUM_ORE.get())
                .add(Registration.FINALBIUM_ORE.get())
                .add(Registration.LAVORIUM_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(Registration.BURMUDIUM_ORE.get())
                .add(Registration.FINALBIUM_ORE.get())
                .add(Registration.LAVORIUM_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.BURMUDIUM_ORE.get())
                .add(Registration.FINALBIUM_ORE.get())
                .add(Registration.LAVORIUM_ORE.get());
    }

    @Override
    public String getName() {
        return "Rgba Tags";
    }
}
