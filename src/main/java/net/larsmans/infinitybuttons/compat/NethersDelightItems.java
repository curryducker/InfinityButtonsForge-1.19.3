package net.larsmans.infinitybuttons.compat;

import net.larsmans.infinitybuttons.InfinityButtons;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.larsmans.infinitybuttons.item.InfinityButtonsItems.ITEMS;

public class NethersDelightItems {

    public static final RegistryObject<Item> PROPELPLANT_TORCH_BUTTON =
            registerItem("propelplant_torch_button",
                    () -> new StandingAndWallBlockItem(NethersDelightBlocks.PROPELPLANT_TORCH_BUTTON.get(), NethersDelightBlocks.PROPELPLANT_WALL_TORCH_BUTTON.get(),
                            new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> PROPELPLANT_TORCH_LEVER =
            registerItem("propelplant_torch_lever",
                    () -> new StandingAndWallBlockItem(NethersDelightBlocks.PROPELPLANT_TORCH_LEVER.get(), NethersDelightBlocks.PROPELPLANT_WALL_TORCH_LEVER.get(),
                            new Item.Properties(), Direction.DOWN));

    /**
     * Methods
     */

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static void registerCompatItems() {
        InfinityButtons.LOGGER.debug("Registering Nether's Delight Compat Items for Infinity Buttons");
    }
}
