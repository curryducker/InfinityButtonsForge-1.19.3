package net.larsmans.infinitybuttons.block.custom.largebutton;

import net.larsmans.infinitybuttons.block.custom.button.WoodenButton;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WoodenLargeButton extends WoodenButton {

    public final boolean isNetherWood;

    public WoodenLargeButton(BlockBehaviour.Properties properties, boolean isNetherWood) {
        super(properties);
        this.isNetherWood = isNetherWood;
    }

    @Override
    protected SoundEvent getSoundEvent(boolean isOn) {
        if (isNetherWood) {
            return isOn ? SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON : SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF;
        }
        return isOn ? SoundEvents.WOODEN_BUTTON_CLICK_ON : SoundEvents.WOODEN_BUTTON_CLICK_OFF;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return LargeButtonShape.outlineShape(state);
    }
}
