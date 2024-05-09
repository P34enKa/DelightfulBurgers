package net.luhcarti.delightfulburgers.food;

import net.minecraft.world.food.FoodProperties;

public class LuhFoods {
    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.6F);
    }
    public static final FoodProperties BACON_BURGER = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f).build();
    public static final FoodProperties CHICKEN_BURGER = (new FoodProperties.Builder())
            .nutrition(11).saturationMod(0.8f).build();
    public static final FoodProperties DOUBLE_PATTY_BURGER = (new FoodProperties.Builder())
            .nutrition(13).saturationMod(0.8f).build();
    public static final FoodProperties BASIC_BURGER = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8f).build();
}
