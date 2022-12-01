package com.finalbi.rgba.datagen;

import com.finalbi.rgba.Main;
import com.finalbi.rgba.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RgbaBlockStates extends BlockStateProvider {
    public RgbaBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.BERMUDIUM_ORE.get());
        simpleBlock(Registration.FINALBIUM_ORE.get());
        simpleBlock(Registration.LAVORIUM_ORE.get());
    }
}
