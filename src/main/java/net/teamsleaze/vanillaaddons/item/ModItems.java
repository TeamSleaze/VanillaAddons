package net.teamsleaze.vanillaaddons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teamsleaze.vanillaaddons.VanillaAddons;

public class ModItems {

    public static Item ROSE_GOLD_INGOT = Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "rose_gold_ingot"),
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS))
    );

    public static void registerModItems() {
        VanillaAddons.LOGGER.info(VanillaAddons.MOD_ID[1] + " Registering Mod Items");
    }
}
