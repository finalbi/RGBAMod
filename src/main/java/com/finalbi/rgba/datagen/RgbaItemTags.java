package com.finalbi.rgba.datagen;

import com.finalbi.rgba.Main;
import com.finalbi.rgba.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class RgbaItemTags extends ItemTagsProvider {
    public RgbaItemTags(DataGenerator p_126530_, BlockTagsProvider p_126531_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126530_, p_126531_, Main.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.BURMUDIUM_ORE_ITEM.get())
                .add(Registration.FINALBIUM_ORE_ITEM.get())
                .add(Registration.LAVORIUM_ORE_ITEM.get());
    }

    @Override
    public String getName() {
        return "Rgba Tags";
    }
}
