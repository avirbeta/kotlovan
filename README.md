# Kotlovan

Чит-мод **Котлован 2.1.0** для **Minecraft 1.16.5** (Fabric). ClickGUI в стиле Delta, легаси-модули и новый фреймворк с модулями KillAura, Fly, Jesus, ESP, TargetHUD и Panic.

Работает с любым Fabric-клиентом/лаунчером для 1.16.5: дополнительных зависимостей, кроме Fabric API, нет.

## Что нового в 2.1.0

- Исправлен критический краш: в `kotlovan.mixins.json` был указан несуществующий `InGameHudMixin`.
- Новые модули (`ESP`, `TargetHUD`, `KillAura` target ESP) теперь реально получают события рендера 2D/3D.
- `Panic` больше не отписывает все модули от EventBus навсегда — после паники чит продолжает работать до перезапуска.
- Починен Freecam: флаг `freecam` не выставлялся, поэтому камера не включалась.
- KillAura снова бьёт игроков, а не только мобов; исправлена интерполяция `prevYaw/prevPitch`.
- SafeWalk больше не пустышка, Velocity не замедляет обычную ходьбу, NoWeb срабатывает только в паутине.
- Клавиши новых модулей регистрируются сразу и видны в меню управления.
- `panic()` выключает и новые модули, а не только легаси.
- Добавлены CI-сборка и релиз 2.1.0.

## Модули

**Легаси:** Nuker, Fly, Speed, AutoSprint, NoFall, KillAura, FullBright, Step, AirJump, Spider, AutoTool, InstantAttack, Glide, LongJump, Criticals, AutoSword, Freecam, ChestStealer, Velocity, NoWeb, FastLadder, SafeWalk, ESP, Tracers, X-Ray, NoRender, Timer.

**Новый фреймворк:** KillAura, TargetHUD, Fly (Vanilla/Packet/Matrix), Jesus, ESP (Boxes/Skeletons/Glow), Panic.

## Управление

- **Правый Shift** — открыть ClickGUI.
- Легаси-хоткеи: `R F C P N H V U J K T I G B Y LAlt Z X Insert Delete`.
- Новые модули: `O` — KillAura, `Q` — Fly, `Enter` — Jesus, `E` — ESP, `M` — TargetHUD.
- `F8` — паника (легаси), модуль **Panic** — экстренное отключение всего.

## Сборка

Требуется JDK 17, Gradle 7.6, Fabric Loom 0.12.56, yarn `1.16.5+build.10:v2`, fabric-api `0.42.0+1.16`.

```bash
gradle build --no-daemon
```

Готовый мод: `build/libs/kotlovan-2.1.0.jar`.

CI на GitHub собирает jar на каждый push.

## Установка

1. Установи Fabric Loader для 1.16.5 и Fabric API `0.42.0+1.16`.
2. Положи `kotlovan-2.1.0.jar` в папку `mods/`.
3. Запусти игру.

## Автор

avirbeta
