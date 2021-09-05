package io.github.sefiraat.slimetinker.categories;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public final class Categories {

    public static final NestedItemGroup MAIN = new NestedItemGroup(SlimeTinker.inst().getKeys().getCategoryMain(), new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MAIN)),
            ThemeUtils.MAIN + "粘液匠魂(SlimeTinker)"
    ));
    public static final SubItemGroup WORKSTATIONS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryWorkstations(), MAIN, new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MAIN)),
            ThemeUtils.MAIN + "工作站"
    ));
    public static final SubItemGroup MATERIALS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryMaterials(), MAIN, new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MATERIALS)),
            ThemeUtils.MAIN + "材料"
    ));
    public static final SubItemGroup MOLTEN_METALS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryMolten(), MAIN, new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MOLTEN)),
            ThemeUtils.MAIN + "熔融金属"
    ));
    public static final SubItemGroup ALLOYS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryAlloys(), MAIN, new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_ALLOYS)),
            ThemeUtils.MAIN + "熔融合金"
    ));
    public static final SubItemGroup CASTS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryCasts(), MAIN, new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_CASTS)),
            ThemeUtils.MAIN + "铸件"
    ));
    public static final SubItemGroup PARTS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryParts(), MAIN, new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_PARTS)),
            ThemeUtils.MAIN + "部件制作指南"
    ));
    public static final SubItemGroup TOOLS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryTools(), MAIN, new CustomItemStack(
            Material.DIAMOND_SWORD,
            ThemeUtils.MAIN + "工具制作指南"
    ));
    public static final SubItemGroup ARMOUR = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryArmour(), MAIN, new CustomItemStack(
            Material.DIAMOND_CHESTPLATE,
            ThemeUtils.MAIN + "防具制作指南"
    ));
    public static final SubItemGroup TRAITS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryProperties(), MAIN, new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_TRAITS)),
            ThemeUtils.MAIN + "特性"
    ));
    public static final SubItemGroup MODIFICATIONS = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryModifications(), MAIN, new CustomItemStack(
            Material.REDSTONE,
            ThemeUtils.MAIN + "模组"
    ));
    public static final SubItemGroup PART_DICT = new SubItemGroup(SlimeTinker.inst().getKeys().getCategoryPartDict(), MAIN, new CustomItemStack(
            PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.PART_PICKAXE_HEAD)),
            ThemeUtils.MAIN + "所有部件"
    ));
    public static final DummyCategory DUMMY = new DummyCategory(SlimeTinker.inst().getKeys().getCategoryDummy(), new CustomItemStack(
            Material.BARRIER,
            ThemeUtils.MAIN + "SlimeTinker 占位符"
    ));

    public static void set(SlimeTinker p) {
        MAIN.register(p);
        WORKSTATIONS.register(p);
        MATERIALS.register(p);
        MOLTEN_METALS.register(p);
        ALLOYS.register(p);
        CASTS.register(p);
        PARTS.register(p);
        TOOLS.register(p);
        ARMOUR.register(p);
        TRAITS.register(p);
        MODIFICATIONS.register(p);
        PART_DICT.register(p);
    }

}
