package com.novum.christmaschaos.item;

import com.novum.christmaschaos.ChristmasChaos;
import com.novum.christmaschaos.entity.custom.DamageSnowBallEntity;
import com.novum.christmaschaos.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import javax.swing.*;

public class ModItems {

    //WEAPONS
    public static final Item SNOWMOD = registerItem("snow_mod", new Item(new FabricItemSettings()));
    public static final Item GIFT_WRAP_STAFF = registerItem("gift_wrap_staff", new SwordItem(ModToolMaterial.CHRISTMAS, 2, -2f, new FabricItemSettings().maxCount(1).maxDamage(420000)));
    public static final Item ANTLER = registerItem("antler", new SwordItem(ModToolMaterial.CHRISTMAS, 4, -3f, new FabricItemSettings().maxCount(1).maxDamage(69000000)));
    public static final Item CANDLE_STICK = registerItem("candle_stick", new CandleStickItem(ModToolMaterial.CHRISTMAS, 1, -2.256234f, new FabricItemSettings().maxCount(1).maxDamage(2000000)));
    public static final Item CANDY_CANE_CRUSHER = registerItem("candy_cane_crusher", new CandyCaneItem(ModToolMaterial.CHRISTMAS, 1, -2, new FabricItemSettings().maxCount(1)));
    public static final Item ORNAMENT_GRENADE = registerItem("ornament_grenade", new SnowGrenadeItem(new FabricItemSettings().maxCount(16)));
    public static final Item DAMAGE_SNOWBALL = registerItem("damage_snowball", new DamageSnowBallItem(new FabricItemSettings().maxCount(16)));

    //TOOLS
    public static final Item SNOW_TRENCH_DRILL = registerItem("snow_trench_drill", new SnowTrenchDrillItem
            (ModToolMaterial.SNOWTRENCHDRILL, 0, -2.5f, new FabricItemSettings().maxCount(1)));
    public static final Item DEFUSER = registerItem("defuser", new Item(new FabricItemSettings().maxCount(1)));


    //FOOD
    public static final Item EGGNOG = registerItem("eggnog", new Item(new FabricItemSettings().food(ModFoodComponents.EGGNOG).maxCount(16)));
    public static final Item HOT_CHOCOLATE = registerItem("hot_chocolate", new Item(new FabricItemSettings().food(ModFoodComponents.HOT_CHOCOLATE).maxCount(16)));
    public static final Item GUMDROP = registerItem("gumdrop", new Item(new FabricItemSettings().food(ModFoodComponents.GUMDROP).maxCount(16)));


    //ARMOR
    public static final Item ELF_EARS = registerItem("elf_ears", new ArmorItem(ModArmorMaterials.SET1, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1).maxDamage(1000000)));
    public static final Item UGLY_CHRISTMAS_SWEATER = registerItem("ugly_christmas_sweater", new ArmorItem(ModArmorMaterials.SET1, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1).maxDamage(1000000)));
    public static final Item PYJAMA_PANTS = registerItem("pyjama_pants", new ArmorItem(ModArmorMaterials.SET1, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1).maxDamage(1000000)));
    public static final Item STOCKINGS = registerItem("stockings", new ArmorItem(ModArmorMaterials.SET1, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1).maxDamage(1000000)));
    public static final Item SANTA_HAT = registerItem("santa_hat", new ArmorItem(ModArmorMaterials.SANTA, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1).maxDamage(1000000)));
    public static final Item SANTAS_COAT = registerItem("santas_coat", new ArmorItem(ModArmorMaterials.SANTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1).maxDamage(1000000)));
    public static final Item SANTAS_TROUSERS = registerItem("santas_trousers", new ArmorItem(ModArmorMaterials.SANTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1).maxDamage(1000000)));
    public static final Item SANTAS_BOOTS = registerItem("santas_boots", new ArmorItem(ModArmorMaterials.SANTA, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1).maxDamage(1000000)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChristmasChaos.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ChristmasChaos.LOGGER.info("Registering mod items for" + ChristmasChaos.MOD_ID);
    }
}
