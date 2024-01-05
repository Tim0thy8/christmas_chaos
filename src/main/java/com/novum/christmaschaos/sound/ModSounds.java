package com.novum.christmaschaos.sound;

import com.novum.christmaschaos.ChristmasChaos;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent SNOW_MINE_DETONATED = registerSoundEvent("snow_mine_detonated");
    public static final SoundEvent CANDY_CANE_LICKED = registerSoundEvent("candy_cane_licked");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ChristmasChaos.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        ChristmasChaos.LOGGER.info("Registering Sounds for " + ChristmasChaos.MOD_ID);
    }
}
