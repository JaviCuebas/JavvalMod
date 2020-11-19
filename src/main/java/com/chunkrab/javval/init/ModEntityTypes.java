package com.chunkrab.javval.init;

import com.chunkrab.javval.Javval;
import com.chunkrab.javval.entities.StrawberryEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Javval.MOD_ID);

    //Entity Types
    public static final RegistryObject<EntityType<StrawberryEntity>> STRAWBERRY_COW = ENTITY_TYPES.register("strawberry_cow",
            ()-> EntityType.Builder.create(StrawberryEntity::new, EntityClassification.CREATURE)
                    .size(2.0F,2.0F).build(new ResourceLocation(Javval.MOD_ID, "strawberry_cow").toString())
                    );
}
