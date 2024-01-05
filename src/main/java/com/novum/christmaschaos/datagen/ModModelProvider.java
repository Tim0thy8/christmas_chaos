package com.novum.christmaschaos.datagen;

import com.novum.christmaschaos.block.ModBlocks;
import com.novum.christmaschaos.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SNOW_MINE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FUDGE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SNOWMOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORNAMENT_GRENADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMAGE_SNOWBALL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SNOW_TRENCH_DRILL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DEFUSER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ANTLER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDLE_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDY_CANE_CRUSHER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GIFT_WRAP_STAFF, Models.HANDHELD);

        itemModelGenerator.register(ModItems.EGGNOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUMDROP, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SANTA_HAT));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SANTAS_COAT));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SANTAS_TROUSERS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SANTAS_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELF_EARS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.UGLY_CHRISTMAS_SWEATER));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PYJAMA_PANTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STOCKINGS));
    }
}
