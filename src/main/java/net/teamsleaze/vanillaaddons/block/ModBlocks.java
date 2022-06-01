package net.teamsleaze.vanillaaddons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teamsleaze.vanillaaddons.VanillaAddons;

public class ModBlocks {
    public static Block GUNPOWDER_BARREL = new GunpowderBarrel(AbstractBlock.Settings
            .of(Material.WOOD)
            .strength(2.5f)
            .sounds(BlockSoundGroup.WOOD)
            .mapColor(MapColor.STONE_GRAY)
    );

    public static ModPathBlock GRAVEL_PATH = new ModPathBlock(AbstractBlock.Settings
            .of(Material.SOIL)
            .strength(0.65F)
            .sounds(BlockSoundGroup.GRAVEL),
            Blocks.GRAVEL.getDefaultState()
    );

    public static ModPathBlock SAND_PATH = new ModPathBlock(AbstractBlock.Settings
            .of(Material.SOIL)
            .strength(0.65F)
            .sounds(BlockSoundGroup.SAND),
            Blocks.SAND.getDefaultState()
    );

    public static ModPathBlock RED_SAND_PATH = new ModPathBlock(AbstractBlock.Settings
            .of(Material.SOIL)
            .strength(0.65F)
            .sounds(BlockSoundGroup.SAND),
            Blocks.RED_SAND.getDefaultState()
    );


    public static void registerModBlocks() {
        VanillaAddons.LOGGER.info(VanillaAddons.MOD_ID[1] + " Registering Mod Blocks");
        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "gunpowder_barrel"), GUNPOWDER_BARREL);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "gunpowder_barrel"), new BlockItem(GUNPOWDER_BARREL, new FabricItemSettings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "gravel_path"), GRAVEL_PATH);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "gravel_path"), new BlockItem(GRAVEL_PATH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "sand_path"), SAND_PATH);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "sand_path"), new BlockItem(SAND_PATH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "red_sand_path"), RED_SAND_PATH);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "red_sand_path"), new BlockItem(RED_SAND_PATH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }

}
