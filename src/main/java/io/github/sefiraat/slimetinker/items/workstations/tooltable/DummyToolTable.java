package io.github.sefiraat.slimetinker.items.workstations.tooltable;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummyToolTable {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_TABLE",
        Material.SMITHING_TABLE,
        ThemeItemType.MACHINE,
        "Bàn lắp ráp công cụ Tinker",
        "Tại bàn lắp ráp công cụ Tinker",
        "Đặt các bộ phận tương ứng vào để lắp ráp"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_TOOL_TABLE, STACK);

    private DummyToolTable() {
        throw new IllegalStateException("Utility class");
    }
}
