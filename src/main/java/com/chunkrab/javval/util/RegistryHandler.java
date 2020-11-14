package com.chunkrab.javval.util;

import com.chunkrab.javval.Javval;
import com.chunkrab.javval.items.ItemBase;
import com.chunkrab.javval.items.MagicStrawberry;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Javval.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<MagicStrawberry> MAGIC_STRAWBERRY = ITEMS.register("magic_strawberry", MagicStrawberry::new);
}
