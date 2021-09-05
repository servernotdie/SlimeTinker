package io.github.sefiraat.slimetinker.items.workstations.modificationstation;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class DummyModificationStation {

    private DummyModificationStation() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "DUMMY_MODIFICATION_STATION",
            Material.GRINDSTONE,
            ThemeUtils.ITEM_MACHINE + "匠魂模组工作站",
            "",
            ThemeUtils.PASSIVE + "在匠魂模组工作站中给工具/武器安装模组",
            ThemeUtils.PASSIVE + "station using the appropriate material.",
            ThemeUtils.PASSIVE + "Once enough material has been added, the",
            ThemeUtils.PASSIVE + "modification will level.",
            "",
            ThemeUtils.LORE_TYPE_MACHINE
    );

    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummyToolTable(), STACK, "");

}
