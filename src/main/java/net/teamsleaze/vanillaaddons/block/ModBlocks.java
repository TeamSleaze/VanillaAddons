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

    // GUNPOWDER BLOCK
    public static Block GUNPOWDER_BARREL = new GunpowderBarrel(AbstractBlock.Settings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD).mapColor(MapColor.STONE_GRAY));

    // PATH BLOCKS
    public static ModPathBlock GRAVEL_PATH = new ModPathBlock(
            AbstractBlock.Settings.of(Material.SOIL).strength(0.65F).sounds(BlockSoundGroup.GRAVEL),
            Blocks.GRAVEL.getDefaultState()
    );

    public static ModPathBlock SAND_PATH = new ModPathBlock(
            AbstractBlock.Settings.of(Material.SOIL).strength(0.65F).sounds(BlockSoundGroup.SAND),
            Blocks.SAND.getDefaultState()
    );

    public static ModPathBlock RED_SAND_PATH = new ModPathBlock(
            AbstractBlock.Settings.of(Material.SOIL).strength(0.65F).sounds(BlockSoundGroup.SAND),
            Blocks.RED_SAND.getDefaultState()
    );

    // TRIMMED WOOD PLANKS
    public static Block TRIMMED_OAK_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD).resistance(3.0F).hardness(2.0F).sounds(BlockSoundGroup.WOOD));
    public static Block TRIMMED_SPRUCE_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD).resistance(3.0F).hardness(2.0F).sounds(BlockSoundGroup.WOOD));
    public static Block TRIMMED_BIRCH_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD).resistance(3.0F).hardness(2.0F).sounds(BlockSoundGroup.WOOD));
    public static Block TRIMMED_JUNGLE_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD).resistance(3.0F).hardness(2.0F).sounds(BlockSoundGroup.WOOD));
    public static Block TRIMMED_ACACIA_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD).resistance(3.0F).hardness(2.0F).sounds(BlockSoundGroup.WOOD));
    public static Block TRIMMED_DARK_OAK_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD).resistance(3.0F).hardness(2.0F).sounds(BlockSoundGroup.WOOD));
    public static Block TRIMMED_CRIMSON_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD).resistance(3.0F).hardness(2.0F).sounds(BlockSoundGroup.WOOD));
    public static Block TRIMMED_WARPED_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD).resistance(3.0F).hardness(2.0F).sounds(BlockSoundGroup.WOOD));


    public static void registerModBlocks() {
        VanillaAddons.LOGGER.info(VanillaAddons.MOD_ID[1] + " Registering Mod Blocks");
        // GUNPOWDER BLOCK
        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "gunpowder_barrel"), GUNPOWDER_BARREL);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "gunpowder_barrel"), new BlockItem(GUNPOWDER_BARREL, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        // PATH BLOCKS
        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "gravel_path"), GRAVEL_PATH);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "gravel_path"), new BlockItem(GRAVEL_PATH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "sand_path"), SAND_PATH);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "sand_path"), new BlockItem(SAND_PATH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "red_sand_path"), RED_SAND_PATH);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "red_sand_path"), new BlockItem(RED_SAND_PATH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        // TRIMMED WOOD PLANKS
        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_oak_planks"), TRIMMED_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_oak_planks"), new BlockItem(TRIMMED_OAK_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_spruce_planks"), TRIMMED_SPRUCE_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_spruce_planks"), new BlockItem(TRIMMED_SPRUCE_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_birch_planks"), TRIMMED_BIRCH_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_birch_planks"), new BlockItem(TRIMMED_BIRCH_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_jungle_planks"), TRIMMED_JUNGLE_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_jungle_planks"), new BlockItem(TRIMMED_JUNGLE_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_acacia_planks"), TRIMMED_ACACIA_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_acacia_planks"), new BlockItem(TRIMMED_ACACIA_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_dark_oak_planks"), TRIMMED_DARK_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_dark_oak_planks"), new BlockItem(TRIMMED_DARK_OAK_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_crimson_planks"), TRIMMED_CRIMSON_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_crimson_planks"), new BlockItem(TRIMMED_CRIMSON_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_warped_planks"), TRIMMED_WARPED_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "trimmed_warped_planks"), new BlockItem(TRIMMED_WARPED_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}
