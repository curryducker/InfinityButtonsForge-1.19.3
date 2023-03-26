package net.larsmans.infinitybuttons.block.custom.button;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

public class WoodenButton extends AbstractSmallButton{
    private final boolean isNetherWood;

    public WoodenButton(Properties properties, boolean large, boolean isNetherWood) {
        super(true, large, properties);
        this.isNetherWood = isNetherWood;
    }

    @Override
    public int getPressDuration() {
        return 30;
    }

    @Override
    protected SoundEvent getSoundEvent(boolean isOn) {
        if (isNetherWood) {
            return isOn ? SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON : SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF;
        }
        return isOn ? SoundEvents.WOODEN_BUTTON_CLICK_ON : SoundEvents.WOODEN_BUTTON_CLICK_OFF;
    }
}
