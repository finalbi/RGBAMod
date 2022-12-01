package com.finalbi.rgba.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("rgbatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };
    public static void init(final FMLCommonSetupEvent event) {
    }
}
