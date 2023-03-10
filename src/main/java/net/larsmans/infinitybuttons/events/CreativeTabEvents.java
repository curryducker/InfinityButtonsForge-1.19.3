package net.larsmans.infinitybuttons.events;

import net.larsmans.infinitybuttons.InfinityButtons;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.larsmans.infinitybuttons.compat.NethersDelightBlocks;
import net.larsmans.infinitybuttons.compat.NethersDelightItems;
import net.larsmans.infinitybuttons.compat.QuarkBlocks;
import net.larsmans.infinitybuttons.compat.WoodworksBlocks;
import net.larsmans.infinitybuttons.item.InfinityButtonsItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;

public class CreativeTabEvents {
    public static CreativeModeTab INFINITYBUTTONS;

    @SubscribeEvent
    public static void onCreativeModeTabRegister(CreativeModeTabEvent.Register event) {
        INFINITYBUTTONS = event.registerCreativeModeTab(new ResourceLocation(InfinityButtons.MOD_ID, "infinitybuttons"), builder -> {
            builder
                    .icon(() -> new ItemStack(InfinityButtonsBlocks.OAK_LARGE_BUTTON.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(Blocks.OAK_BUTTON));
                        output.accept(new ItemStack(Blocks.SPRUCE_BUTTON));
                        output.accept(new ItemStack(Blocks.BIRCH_BUTTON));
                        output.accept(new ItemStack(Blocks.JUNGLE_BUTTON));
                        output.accept(new ItemStack(Blocks.ACACIA_BUTTON));
                        output.accept(new ItemStack(Blocks.DARK_OAK_BUTTON));
                        output.accept(new ItemStack(Blocks.MANGROVE_BUTTON));
                        output.accept(new ItemStack(Blocks.CRIMSON_BUTTON));
                        output.accept(new ItemStack(Blocks.WARPED_BUTTON));
                        output.accept(new ItemStack(Blocks.STONE_BUTTON));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DEEPSLATE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GRANITE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DIORITE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.ANDESITE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CALCITE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.TUFF_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DRIPSTONE_BUTTON.get()));
                        output.accept(new ItemStack(Blocks.POLISHED_BLACKSTONE_BUTTON));
                        output.accept(new ItemStack(InfinityButtonsBlocks.COPPER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.EXPOSED_COPPER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.WEATHERED_COPPER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.OXIDIZED_COPPER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STICKY_COPPER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STICKY_EXPOSED_COPPER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STICKY_WEATHERED_COPPER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STICKY_OXIDIZED_COPPER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.IRON_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GOLD_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.EMERALD_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DIAMOND_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PRISMARINE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PRISMARINE_BRICK_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DARK_PRISMARINE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.SAND_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.RED_SAND_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GRAVEL_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.WHITE_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GRAY_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BLACK_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BROWN_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.RED_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.ORANGE_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.YELLOW_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIME_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GREEN_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CYAN_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BLUE_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PURPLE_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.MAGENTA_CONCRETE_POWDER_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PINK_CONCRETE_POWDER_BUTTON.get()));

                        output.accept(new ItemStack(InfinityButtonsBlocks.OAK_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.SPRUCE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BIRCH_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.JUNGLE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.ACACIA_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DARK_OAK_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.MANGROVE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CRIMSON_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.WARPED_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STONE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DEEPSLATE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GRANITE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DIORITE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.ANDESITE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.TUFF_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DRIPSTONE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CALCITE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.POLISHED_BLACKSTONE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.COPPER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.EXPOSED_COPPER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.WEATHERED_COPPER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.OXIDIZED_COPPER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STICKY_COPPER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STICKY_EXPOSED_COPPER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STICKY_WEATHERED_COPPER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.STICKY_OXIDIZED_COPPER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.IRON_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GOLD_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.EMERALD_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DIAMOND_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PRISMARINE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PRISMARINE_BRICK_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DARK_PRISMARINE_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.SAND_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.RED_SAND_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GRAVEL_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.WHITE_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIGHT_GRAY_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GRAY_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BLACK_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BROWN_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.RED_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.ORANGE_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.YELLOW_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIME_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GREEN_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CYAN_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIGHT_BLUE_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BLUE_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PURPLE_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.MAGENTA_CONCRETE_POWDER_LARGE_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PINK_CONCRETE_POWDER_LARGE_BUTTON.get()));

                        output.accept(new ItemStack(InfinityButtonsBlocks.WHITE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIGHT_GRAY_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GRAY_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BLACK_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BROWN_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.RED_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.ORANGE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.YELLOW_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIME_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GREEN_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CYAN_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIGHT_BLUE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BLUE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PURPLE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.MAGENTA_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PINK_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.FANCY_EMERGENCY_BUTTON.get()));

                        output.accept(new ItemStack(InfinityButtonsBlocks.WHITE_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIGHT_GRAY_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GRAY_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BLACK_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BROWN_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.RED_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.ORANGE_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.YELLOW_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIME_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.GREEN_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CYAN_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LIGHT_BLUE_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BLUE_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PURPLE_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.MAGENTA_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.PINK_SAFE_EMERGENCY_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.FANCY_SAFE_EMERGENCY_BUTTON.get()));

                        output.accept(new ItemStack(InfinityButtonsBlocks.BOOKSHELF_SECRET_BUTTON.get()));
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.SPRUCE_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("woodworks")) {
                            output.accept(new ItemStack(WoodworksBlocks.SPRUCE_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.BIRCH_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("woodworks")) {
                            output.accept(new ItemStack(WoodworksBlocks.BIRCH_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.JUNGLE_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("woodworks")) {
                            output.accept(new ItemStack(WoodworksBlocks.JUNGLE_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.ACACIA_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("woodworks")) {
                            output.accept(new ItemStack(WoodworksBlocks.ACACIA_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.DARK_OAK_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("woodworks")) {
                            output.accept(new ItemStack(WoodworksBlocks.DARK_OAK_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.MANGROVE_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("woodworks")) {
                            output.accept(new ItemStack(WoodworksBlocks.MANGROVE_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.CRIMSON_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("woodworks")) {
                            output.accept(new ItemStack(WoodworksBlocks.CRIMSON_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.WARPED_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("woodworks")) {
                            output.accept(new ItemStack(WoodworksBlocks.WARPED_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.AZALEA_BOOKSHELF_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.BLOSSOM_BOOKSHELF_SECRET_BUTTON.get()));
                        }
                        output.accept(new ItemStack(InfinityButtonsBlocks.BRICK_SECRET_BUTTON.get()));
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.PERMAFROST_BRICK_SECRET_BUTTON.get()));
                        }
                        output.accept(new ItemStack(InfinityButtonsBlocks.STONE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.MOSSY_STONE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CRACKED_STONE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CHISELED_STONE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DEEPSLATE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CRACKED_DEEPSLATE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DEEPSLATE_TILE_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CRACKED_DEEPSLATE_TILE_SECRET_BUTTON.get()));
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_GRANITE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_GRANITE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_DIORITE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_DIORITE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_ANDESITE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_ANDESITE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_CALCITE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_CALCITE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_TUFF_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_TUFF_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_TUFF_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_TUFF_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_DRIPSTONE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_DRIPSTONE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_LIMESTONE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_LIMESTONE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_JASPER_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_JASPER_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.POLISHED_SHALE_BRICK_SECRET_BUTTON.get()));
                            output.accept(new ItemStack(QuarkBlocks.CHISELED_POLISHED_SHALE_BRICK_SECRET_BUTTON.get()));
                        }
                        output.accept(new ItemStack(InfinityButtonsBlocks.OAK_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.SPRUCE_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.BIRCH_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.JUNGLE_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.ACACIA_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DARK_OAK_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.MANGROVE_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CRIMSON_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.WARPED_PLANK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.MUD_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.END_STONE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.QUARTZ_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DARK_PRISMARINE_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.POLISHED_BLACKSTONE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CHISELED_POLISHED_BLACKSTONE_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.NETHER_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CRACKED_NETHER_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.CHISELED_NETHER_BRICK_SECRET_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.RED_NETHER_BRICK_SECRET_BUTTON.get()));
                        if (ModList.get().isLoaded("quark")) {
                            output.accept(new ItemStack(QuarkBlocks.BLUE_NETHER_BRICK_SECRET_BUTTON.get()));
                        }

                        output.accept(new ItemStack(InfinityButtonsBlocks.DOORBELL.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.DOORBELL_BUTTON.get()));
                        if (ModList.get().isLoaded("nethers_delight")) {
                            output.accept(new ItemStack(NethersDelightBlocks.HOGLIN_MOUNT_BUTTON.get()));
                        }
                        output.accept(new ItemStack(InfinityButtonsBlocks.LAMP_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsBlocks.LAMP_LEVER.get()));

                        output.accept(new ItemStack(InfinityButtonsItems.TORCH_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsItems.TORCH_LEVER.get()));
                        output.accept(new ItemStack(InfinityButtonsItems.SOUL_TORCH_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsItems.SOUL_TORCH_LEVER.get()));
                        output.accept(new ItemStack(InfinityButtonsItems.REDSTONE_TORCH_BUTTON.get()));
                        output.accept(new ItemStack(InfinityButtonsItems.REDSTONE_TORCH_LEVER.get()));
                        if (ModList.get().isLoaded("nethers_delight")) {
                            output.accept(new ItemStack(NethersDelightItems.PROPELPLANT_TORCH_BUTTON.get()));
                            output.accept(new ItemStack(NethersDelightItems.PROPELPLANT_TORCH_LEVER.get()));
                        }
                    })
                    .title(Component.translatable("itemGroup.infinityButtonsTab"))
                    .build();
        });
    }
    @SubscribeEvent
    public static void addButtonsToVanillaTabs(CreativeModeTabEvent.BuildContents event) {
        addAfterInBuildingBlocks(event, Items.OAK_BUTTON, InfinityButtonsBlocks.OAK_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.SPRUCE_BUTTON, InfinityButtonsBlocks.SPRUCE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.BIRCH_BUTTON, InfinityButtonsBlocks.BIRCH_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.JUNGLE_BUTTON, InfinityButtonsBlocks.JUNGLE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.ACACIA_BUTTON, InfinityButtonsBlocks.ACACIA_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.DARK_OAK_BUTTON, InfinityButtonsBlocks.DARK_OAK_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.MANGROVE_BUTTON, InfinityButtonsBlocks.MANGROVE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.CRIMSON_BUTTON, InfinityButtonsBlocks.CRIMSON_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.WARPED_BUTTON, InfinityButtonsBlocks.WARPED_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.STONE_BUTTON, InfinityButtonsBlocks.STONE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.GRANITE_WALL, InfinityButtonsBlocks.GRANITE_BUTTON.get());
        addAfterInBuildingBlocks(event, InfinityButtonsBlocks.GRANITE_BUTTON.get().asItem(), InfinityButtonsBlocks.GRANITE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.DIORITE_WALL, InfinityButtonsBlocks.DIORITE_BUTTON.get());
        addAfterInBuildingBlocks(event, InfinityButtonsBlocks.DIORITE_BUTTON.get().asItem(), InfinityButtonsBlocks.DIORITE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.ANDESITE_WALL, InfinityButtonsBlocks.ANDESITE_BUTTON.get());
        addAfterInBuildingBlocks(event, InfinityButtonsBlocks.ANDESITE_BUTTON.get().asItem(), InfinityButtonsBlocks.ANDESITE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.PRISMARINE_WALL, InfinityButtonsBlocks.PRISMARINE_BUTTON.get());
        addAfterInBuildingBlocks(event, InfinityButtonsBlocks.PRISMARINE_BUTTON.get().asItem(), InfinityButtonsBlocks.PRISMARINE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.PRISMARINE_BRICK_SLAB, InfinityButtonsBlocks.PRISMARINE_BRICK_BUTTON.get());
        addAfterInBuildingBlocks(event, InfinityButtonsBlocks.PRISMARINE_BRICK_BUTTON.get().asItem(), InfinityButtonsBlocks.PRISMARINE_BRICK_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.DARK_PRISMARINE_SLAB, InfinityButtonsBlocks.DARK_PRISMARINE_BUTTON.get());
        addAfterInBuildingBlocks(event, InfinityButtonsBlocks.DARK_PRISMARINE_BUTTON.get().asItem(), InfinityButtonsBlocks.DARK_PRISMARINE_LARGE_BUTTON.get());
        addAfterInBuildingBlocks(event, Items.POLISHED_BLACKSTONE_BUTTON, InfinityButtonsBlocks.POLISHED_BLACKSTONE_LARGE_BUTTON.get());

        addAfterInRedstone(event, Items.STONE_BUTTON, InfinityButtonsBlocks.COPPER_BUTTON.get());
        addAfterInRedstone(event, InfinityButtonsBlocks.COPPER_BUTTON.get().asItem(), InfinityButtonsBlocks.STICKY_COPPER_BUTTON.get());
        addAfterInRedstone(event, Items.REDSTONE_TORCH, InfinityButtonsBlocks.REDSTONE_TORCH_LEVER.get());

        addToColoredBlocks(event, InfinityButtonsBlocks.WHITE_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.GRAY_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BLACK_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BROWN_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.RED_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.ORANGE_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.YELLOW_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIME_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.GREEN_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.CYAN_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BLUE_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.PURPLE_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.MAGENTA_CONCRETE_POWDER_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.PINK_CONCRETE_POWDER_BUTTON.get());

        addToColoredBlocks(event, InfinityButtonsBlocks.WHITE_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIGHT_GRAY_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.GRAY_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BLACK_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BROWN_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.RED_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.ORANGE_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.YELLOW_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIME_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.GREEN_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.CYAN_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIGHT_BLUE_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BLUE_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.PURPLE_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.MAGENTA_CONCRETE_POWDER_LARGE_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.PINK_CONCRETE_POWDER_LARGE_BUTTON.get());

        addToColoredBlocks(event, InfinityButtonsBlocks.WHITE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIGHT_GRAY_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.GRAY_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BLACK_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BROWN_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.RED_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.ORANGE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.YELLOW_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIME_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.GREEN_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.CYAN_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIGHT_BLUE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BLUE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.PURPLE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.MAGENTA_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.PINK_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.FANCY_EMERGENCY_BUTTON.get());

        addToColoredBlocks(event, InfinityButtonsBlocks.WHITE_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIGHT_GRAY_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.GRAY_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BLACK_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BROWN_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.RED_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.ORANGE_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.YELLOW_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIME_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.GREEN_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.CYAN_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.LIGHT_BLUE_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.BLUE_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.PURPLE_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.MAGENTA_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.PINK_SAFE_EMERGENCY_BUTTON.get());
        addToColoredBlocks(event, InfinityButtonsBlocks.FANCY_SAFE_EMERGENCY_BUTTON.get());
    }

    private static void addAfterInBuildingBlocks(CreativeModeTabEvent.BuildContents event, Item item, Block block) {
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(item), new ItemStack(block), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    private static void addAfterInRedstone(CreativeModeTabEvent.BuildContents event, Item item, Block block) {
        if (event.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(item), new ItemStack(block), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    private static void addToColoredBlocks(CreativeModeTabEvent.BuildContents event, Block block) {
        if (event.getTab() == CreativeModeTabs.COLORED_BLOCKS) {
            event.accept(new ItemStack(block));
        }
    }
}