package net.larsmans.infinitybuttons.block.custom.secretbutton.compat;

import net.larsmans.infinitybuttons.block.custom.secretbutton.FullBlockBrickSecretButton;
import net.larsmans.infinitybuttons.compat.NethersDelightItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.ArrayList;
import java.util.List;

public class FullCompatBrickSecretButton extends FullBlockBrickSecretButton {
    public FullCompatBrickSecretButton(Properties properties) {
        super(properties);
    }

    //Untested
    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> list = new ArrayList<>();
        list.add(new ItemStack(this));
        return list;
    }
}
