package com.finalbi.rgba.datagen;

import com.finalbi.rgba.Main;
import com.finalbi.rgba.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class RgbaLanguageProvider extends LanguageProvider {
    public RgbaLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Main.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.rgbatab", "RGBA");
        add(Registration.FINALBIUM_ORE.get(), "Finalbium ore");
        add(Registration.LAVORIUM_ORE.get(), "Lavorium ore");
        add(Registration.BERMUDIUM_ORE.get(), "Bermudium ore");
    }
}
