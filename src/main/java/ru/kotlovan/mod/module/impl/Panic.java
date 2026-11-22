package ru.kotlovan.mod.module.impl;

import ru.kotlovan.mod.KotlovanMod;
import ru.kotlovan.mod.event.EventUpdate;
import ru.kotlovan.mod.module.EventTarget;
import ru.kotlovan.mod.module.Module;
import ru.kotlovan.mod.module.ModuleInfo;
import ru.kotlovan.mod.module.ModuleManager;

@ModuleInfo(name = "Panic", category = "System", description = "Экстренное отключение всех модулей")
public class Panic extends Module {

    @Override
    protected void onEnable() {
        // Сначала выключаем сам Panic, чтобы не было рекурсии.
        setEnabled(false);

        ModuleManager mm = ModuleManager.getInstance();
        for (Module module : mm.getModules()) {
            if (module != this) {
                module.setEnabled(false);
            }
        }

        // Legacy-клиент тоже гасим: Fly/Freecam/FullBright и т.д.
        KotlovanMod.client().panic();

        // EventBus НЕ очищаем — иначе модули перестанут работать до перезапуска.
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if (isEnabled()) {
            onEnable();
        }
    }
}
