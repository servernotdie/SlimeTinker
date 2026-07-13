package io.github.sefiraat.slimetinker.items.workstations.armourtable;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummyArmourTable {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_ARMOUR_TABLE",
        Material.CHISELED_NETHER_BRICKS,
        ThemeItemType.MACHINE,
        "Bàn lắp ráp giáp Tinker",
        "Tại bàn lắp ráp giáp Tinker",
        "Đặt các bộ phận tương ứng vào để lắp ráp"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_ARMOUR_TABLE, STACK);

    private DummyArmourTable() {
        throw new IllegalStateException("Utility class");
    }

}
