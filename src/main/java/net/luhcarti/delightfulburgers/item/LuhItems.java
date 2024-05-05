package net.luhcarti.delightfulburgers.item;

import com.mojang.blaze3d.shaders.Effect;
import net.luhcarti.delightfulburgers.DelightfulBurgers;
import net.luhcarti.delightfulburgers.food.LuhFoods;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LuhItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DelightfulBurgers.MOD_ID);
    public static final RegistryObject<Item> BACON_BURGER = ITEMS.register("bacon_burger",
            () -> new Item(new Item.Properties().food(LuhFoods.BACON_BURGER)));
    public static final RegistryObject<Item> CHICKEN_BURGER = ITEMS.register("chicken_burger",
            () -> new Item(new Item.Properties().food(LuhFoods.BACON_BURGER)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
