package com.chunkrab.javval.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MagicStrawberry extends Item {

    public MagicStrawberry() {
        super(new Item.Properties()
                        .group(ItemGroup.FOOD)
                        .food(new Food.Builder()
                                //every sec in minecraft is 20 tics.
                                .hunger(10)
                                .saturation(1.2f)
//                    .effect(new EffectInstance(Effects.SPEED,6000,3),1)
                                .effect(()-> new EffectInstance(Effects.SPEED,6000,3),1)
                                .effect(()-> new EffectInstance(Effects.HEALTH_BOOST,6000,3),1)
                                .effect(()-> new EffectInstance(Effects.LEVITATION,6000,3),1)
                                .effect(()-> new EffectInstance(Effects.REGENERATION,6000,3),1)
                                .effect(()-> new EffectInstance(Effects.STRENGTH,6000,3),1)
                                .fastToEat()
                                .setAlwaysEdible()
                                .build())

        );
    }
}

