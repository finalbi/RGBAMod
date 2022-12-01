package com.finalbi.rgba.datagen;

import com.finalbi.rgba.Main;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new RgbaRecipes(generator));
            generator.addProvider(new RgbaLootTables(generator));
            RgbaBlockTags blockTags = new RgbaBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new RgbaItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new RgbaBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new RgbaItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new RgbaLanguageProvider(generator, "en_us"));
        }
    }
}
