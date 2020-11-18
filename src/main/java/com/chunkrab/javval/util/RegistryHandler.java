package com.chunkrab.javval.util;

import com.chunkrab.javval.Javval;
import com.chunkrab.javval.armor.ModArmorMaterial;
import com.chunkrab.javval.items.ItemBase;
import com.chunkrab.javval.items.MagicStrawberry;
import com.chunkrab.javval.items.NightBlood;
import com.chunkrab.javval.items.WhiteYarn;
import com.chunkrab.javval.tools.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
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
    public static final RegistryObject<NightBlood> NIGHT_BLOOD = ITEMS.register("night_blood", NightBlood::new);
    public static final RegistryObject<WhiteYarn> WHITE_YARN = ITEMS.register("white_yarn", WhiteYarn::new);
    //Tools (ATK SPD IS 4, WHAT GOES INSIDE SWD ITEM() IS A SUBSTRACTOR)
    public static final RegistryObject<SwordItem> CROCHET_HOOK = ITEMS.register("crochet_hook",()->
            new SwordItem(ModItemTier.RUBY, 2, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)));

    //Armor
    public static final RegistryObject<ArmorItem> VAL_HELMET = ITEMS.register("val_helmet", ()->
            new ArmorItem(ModArmorMaterial.WHITE_YARN, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> VAL_SOCKS = ITEMS.register("val_socks", ()->
            new ArmorItem(ModArmorMaterial.WHITE_YARN, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> VAL_CHESTPLATE = ITEMS.register("val_chestplate", ()->
            new ArmorItem(ModArmorMaterial.WHITE_YARN, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));


}
