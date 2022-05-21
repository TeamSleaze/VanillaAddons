package net.teamsleaze.vanillaaddons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
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
    public static Block GUNPOWDER_BARREL = new GunpowderBarrel(AbstractBlock.Settings
            .of(Material.WOOD)
            .strength(2.5f)
            .sounds(BlockSoundGroup.WOOD)
            .mapColor(MapColor.STONE_GRAY)
    );

    public static void registerModBlocks() {
        VanillaAddons.LOGGER.info(VanillaAddons.MOD_ID[1] + " Registering Mod Blocks");
        Registry.register(Registry.BLOCK, new Identifier(VanillaAddons.MOD_ID[0], "gunpowder_barrel"), GUNPOWDER_BARREL);
        Registry.register(Registry.ITEM, new Identifier(VanillaAddons.MOD_ID[0], "gunpowder_barrel"), new BlockItem(GUNPOWDER_BARREL, new FabricItemSettings().group(ItemGroup.REDSTONE)));
    }

}
