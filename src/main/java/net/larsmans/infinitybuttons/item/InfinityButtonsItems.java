package net.larsmans.infinitybuttons.item;

import net.larsmans.infinitybuttons.InfinityButtons;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class InfinityButtonsItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfinityButtons.MOD_ID);

    /**
     * Torches
     */

    public static final RegistryObject<Item> TORCH_BUTTON = registerTorch("torch_button", InfinityButtonsBlocks.TORCH_BUTTON, InfinityButtonsBlocks.WALL_TORCH_BUTTON);
    public static final RegistryObject<Item> TORCH_LEVER = registerTorch("torch_lever", InfinityButtonsBlocks.TORCH_LEVER, InfinityButtonsBlocks.WALL_TORCH_LEVER);
    public static final RegistryObject<Item> SOUL_TORCH_BUTTON = registerTorch("soul_torch_button", InfinityButtonsBlocks.SOUL_TORCH_BUTTON, InfinityButtonsBlocks.SOUL_WALL_TORCH_BUTTON);
    public static final RegistryObject<Item> SOUL_TORCH_LEVER = registerTorch("soul_torch_lever", InfinityButtonsBlocks.SOUL_TORCH_LEVER, InfinityButtonsBlocks.SOUL_WALL_TORCH_LEVER);
    public static final RegistryObject<Item> REDSTONE_TORCH_BUTTON = registerTorch("redstone_torch_button", InfinityButtonsBlocks.REDSTONE_TORCH_BUTTON, InfinityButtonsBlocks.REDSTONE_WALL_TORCH_BUTTON);
    public static final RegistryObject<Item> REDSTONE_TORCH_LEVER = registerTorch("redstone_torch_lever", InfinityButtonsBlocks.REDSTONE_TORCH_LEVER, InfinityButtonsBlocks.REDSTONE_WALL_TORCH_LEVER);

    /**
     * Methods
     */

    public static RegistryObject<Item> registerTorch(String name, RegistryObject<Block> standing, RegistryObject<Block> wall) {
        return registerItem(name, () -> new StandingAndWallBlockItem(standing.get(), wall.get(), new Item.Properties(), Direction.DOWN));
    }

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
