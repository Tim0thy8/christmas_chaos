package com.novum.christmaschaos.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GUMDROP = new FoodComponent.Builder().hunger(8).saturationModifier(0.4f).build();
    public static final FoodComponent EGGNOG = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1f).build();
    public static final FoodComponent HOT_CHOCOLATE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 1), 1f).build();
}
