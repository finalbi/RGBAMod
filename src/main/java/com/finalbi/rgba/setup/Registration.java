package com.finalbi.rgba.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.finalbi.rgba.Main.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    // Some common properties for our blocks and items
    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);


    public static final RegistryObject<Block> BURMUDIUM_ORE = BLOCKS.register("burmudium_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> BURMUDIUM_ORE_ITEM = fromBlock(BURMUDIUM_ORE);
    public static final RegistryObject<Block> FINALBIUM_ORE = BLOCKS.register("finalbium_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> FINALBIUM_ORE_ITEM = fromBlock(FINALBIUM_ORE);
    public static final RegistryObject<Block> LAVORIUM_ORE = BLOCKS.register("lavorium_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> LAVORIUM_ORE_ITEM = fromBlock(LAVORIUM_ORE);
    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
