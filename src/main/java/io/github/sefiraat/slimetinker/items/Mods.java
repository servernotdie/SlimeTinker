package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.DummyModificationStation;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Mods {

    public static final SlimefunItemStack MOD_REDSTONE_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_REDSTONE_DUMMY",
                    Material.REDSTONE,
                    ThemeUtils.ThemeItemType.MOD,
                    "模组: 红石",
                    ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
                    ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
                    ThemeUtils.PASSIVE + "可以获得与模组等级对应的急迫效果"
            );

    public static final SlimefunItemStack MOD_LAPIS_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_LAPIS_DUMMY",
                    Material.LAPIS_LAZULI,
                    ThemeUtils.ThemeItemType.MOD,
                    "模组: 青金石",
                    ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
                    ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
                    ThemeUtils.PASSIVE + "会获得等同于时运或抢夺附魔的效果",
                    ThemeUtils.PASSIVE + "每安装1个该模组可提升10%的效果"
            );

    public static final SlimefunItemStack MOD_QUARTZ_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_QUARTZ_DUMMY",
                    Material.QUARTZ,
                    ThemeUtils.ThemeItemType.MOD,
                    "模组: 石英",
                    ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
                    ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
                    ThemeUtils.PASSIVE + "会增加该工具/武器的伤害",
                    ThemeUtils.PASSIVE + "每安装1个该模组可提升20%的效果"
            );

    public static final SlimefunItemStack MOD_DIAMOND_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_DIAMOND_DUMMY",
                    Material.DIAMOND,
                    ThemeUtils.ThemeItemType.MOD,
                    "模组: 钻石",
                    ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
                    ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
                    ThemeUtils.PASSIVE + "has a chance to reflect damage taken",
                    ThemeUtils.PASSIVE + "back on to the attacker. 10% per level"
            );

    public static final SlimefunItemStack MOD_EMERALD_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_EMERALD_DUMMY",
                    Material.EMERALD,
                    ThemeUtils.ThemeItemType.MOD,
                    "模组: 绿宝石",
                    ThemeUtils.PASSIVE + "将此模组安装到工具上后,",
                    ThemeUtils.PASSIVE + "玩家手持该工具/武器,",
                    ThemeUtils.PASSIVE + "will gain bonus tool EXP per action",
                    ThemeUtils.PASSIVE + "undertaken. +1 exp for tools and 10%",
                    ThemeUtils.PASSIVE + "for weapons."
            );


    public static final SlimefunItemStack MOD_PLATE_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_PLATE_DUMMY",
                    Material.OBSIDIAN,
                    ThemeUtils.ThemeItemType.MOD,
                    "模组: Reinforced Plate",
                    ThemeUtils.PASSIVE + "A tool with this modification has a",
                    ThemeUtils.PASSIVE + "chance to not take durability damage. 10%",
                    ThemeUtils.PASSIVE + "per level - at Level 10 tools are unbreakable"
            );


    public static void set(SlimeTinker p) {

        // Dummies for the recipe book
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_REDSTONE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_LAPIS_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_QUARTZ_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_DIAMOND_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_EMERALD_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_PLATE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);

    }
}
