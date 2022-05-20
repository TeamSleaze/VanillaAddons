package net.teamsleaze.vanillaaddons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teamsleaze.vanillaaddons.VanillaAddons;

public class ModBlocks {
    public static Block GUNPOWDER_BARREL = registerBlock("gunpowder_barrel",
            new GunpowderBarrel(FabricBlockSettings.of(Material.TNT).mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.WOOD).hardness(2.5f).requiresTool()),
            ItemGroup.REDSTONE
    );


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], name),
                new BlockItem(block, new FabricItemSettings().group(group))
        );
    }

    public static void registerModBlocks() {
        VanillaAddons.LOGGER.info("Registering Mod Blocks for " + VanillaAddons.MOD_ID[0]);
    }
}
