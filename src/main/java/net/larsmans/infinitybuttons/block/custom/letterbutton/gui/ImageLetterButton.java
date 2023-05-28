package net.larsmans.infinitybuttons.block.custom.letterbutton.gui;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.resources.ResourceLocation;

import java.awt.*;

public class ImageLetterButton extends ImageButton {

    private final int buttonId;
    private static final int THICKNESS = 4;
    private static final int HOVER_COLOR = Color.GRAY.getRGB();
    private static final int SELECT_COLOR = Color.LIGHT_GRAY.getRGB();

    public ImageLetterButton(int pX, int pY, int pWidth, int pHeight, int pXTexStart, int pYTexStart, int pYDiffTex, ResourceLocation pResourceLocation, OnPress pOnPress, int buttonId) {
        super(pX, pY, pWidth, pHeight, pXTexStart, pYTexStart, pYDiffTex, pResourceLocation, pOnPress);
        this.buttonId = buttonId;
    }

    @Override
    public void renderButton(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        int COLOR;
        super.renderButton(pPoseStack, pMouseX, pMouseY, pPartialTick);
        if (isHovered || isSelected()) {
            if (isHovered) {
                COLOR = HOVER_COLOR;
            } else {
                COLOR = SELECT_COLOR;
            }
            fill(pPoseStack, this.getX() - THICKNESS, this.getY() - THICKNESS, this.getX() + width + THICKNESS, this.getY(), COLOR);
            fill(pPoseStack, this.getX() - THICKNESS, this.getY(), this.getX(), this.getY() + height, COLOR);
            fill(pPoseStack, this.getX() - THICKNESS, this.getY() + height, this.getX() + width + THICKNESS, this.getY() + height + THICKNESS, COLOR);
            fill(pPoseStack, this.getX() + width, this.getY(), this.getX() + width + THICKNESS, this.getY() + height, COLOR);
        }
    }

    public boolean isSelected() {
        return LetterButtonGui.getSelectedButton() == buttonId;
    }
}
