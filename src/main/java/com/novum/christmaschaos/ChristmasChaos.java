package com.novum.christmaschaos;

import com.novum.christmaschaos.block.ModBlocks;
import com.novum.christmaschaos.entity.ModEntities;
import com.novum.christmaschaos.entity.custom.TurkeyEntity;
import com.novum.christmaschaos.item.ModItemGroups;
import com.novum.christmaschaos.item.ModItems;
import com.novum.christmaschaos.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChristmasChaos implements ModInitializer {
	public static final String MOD_ID = "christmaschaos";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModSounds.registerSounds();
		ModBlocks.registerModBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.TURKEY_BOMB, TurkeyEntity.createTurkeyBombAttributes());
	}
}