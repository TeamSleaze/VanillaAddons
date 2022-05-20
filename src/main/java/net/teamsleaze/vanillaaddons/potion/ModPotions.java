package net.teamsleaze.vanillaaddons.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teamsleaze.vanillaaddons.VanillaAddons;

public class ModPotions {
    public static Potion LEVITATION_POTION;


    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(VanillaAddons.MOD_ID[0], name),
                new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 200, 0)));
    }

    public static void registerPotions() {
        LEVITATION_POTION = registerPotion("levitation_potion");
    }
}
