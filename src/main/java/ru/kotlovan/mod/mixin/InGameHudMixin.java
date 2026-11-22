package ru.kotlovan.mod.mixin;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.kotlovan.mod.Kotlovan;

@Mixin(InGameHud.class)
public class InGameHudMixin {

    @Inject(method = "render", at = @At("TAIL"))
    private void kotlovan$render2d(MatrixStack matrices, float tickDelta, CallbackInfo ci) {
        try {
            Kotlovan.getInstance().onRender2D(tickDelta, null);
        } catch (Throwable ignored) {
        }
    }
}
