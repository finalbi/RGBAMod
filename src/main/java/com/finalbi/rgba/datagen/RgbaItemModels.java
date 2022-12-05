package com.finalbi.rgba.datagen;

import com.finalbi.rgba.Main;
import com.finalbi.rgba.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RgbaItemModels extends ItemModelProvider {
    public RgbaItemModels(DataGenerator generator,  ExistingFileHelper existingFileHelper) {
        super(generator, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.BURMUDIUM_ORE.getId().getPath(), modLoc("block/burmudium_ore"));
        withExistingParent(Registration.LAVORIUM_ORE.getId().getPath(), modLoc("block/lavorium_ore"));
        withExistingParent(Registration.FINALBIUM_ORE.getId().getPath(), modLoc("block/finalbium_ore"));
    }
}
