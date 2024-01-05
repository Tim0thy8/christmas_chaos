package com.novum.christmaschaos.item;

import com.novum.christmaschaos.ChristmasChaos;
import com.novum.christmaschaos.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CHRISTMAS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChristmasChaos.MOD_ID, "christmas"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.christmas"))
                    .icon(() -> new ItemStack(ModItems.ORNAMENT_GRENADE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ORNAMENT_GRENADE);
                        entries.add(ModBlocks.SNOW_MINE);

                        entries.add(ModBlocks.FUDGE_BLOCK);

                        entries.add(ModItems.ANTLER);
                        entries.add(ModItems.CANDY_CANE_CRUSHER);
                        entries.add(ModItems.GIFT_WRAP_STAFF);
                        entries.add(ModItems.CANDLE_STICK);

                        entries.add(ModItems.SNOW_TRENCH_DRILL);
                        entries.add(ModItems.DEFUSER);

                        entries.add(ModItems.SANTA_HAT);
                        entries.add(ModItems.SANTAS_COAT);
                        entries.add(ModItems.SANTAS_TROUSERS);
                        entries.add(ModItems.SANTAS_BOOTS);
                        entries.add(ModItems.ELF_EARS);
                        entries.add(ModItems.UGLY_CHRISTMAS_SWEATER);
                        entries.add(ModItems.PYJAMA_PANTS);
                        entries.add(ModItems.STOCKINGS);

                        entries.add(ModItems.HOT_CHOCOLATE);
                        entries.add(ModItems.EGGNOG);
                        entries.add(ModItems.GUMDROP);


                    }).build());
    public static void registerItemGroups() {
        ChristmasChaos.LOGGER.info("Registering Item Groups for " + ChristmasChaos.MOD_ID);
    }
}
