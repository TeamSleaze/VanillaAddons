package net.teamsleaze.vanillaaddons.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teamsleaze.vanillaaddons.VanillaAddons;

public class ModPotions {
    public static Potion LEVITATION_POTION = Registry.register(Registry.POTION, new Identifier(VanillaAddons.MOD_ID[0], "levitation_potion"),
            new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 1200, 0)));

    public static Potion GLOWING_POTION = Registry.register(Registry.POTION, new Identifier(VanillaAddons.MOD_ID[0], "glowing_potion"),
            new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0)));


    public static void registerModPotions() {
        VanillaAddons.LOGGER.info("Registering Potions for " + VanillaAddons.MOD_ID[0]);
    }
}
