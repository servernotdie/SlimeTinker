package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.templates.PartTemplate;
import io.github.sefiraat.slimetinker.items.templates.RepairkitTemplate;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.DummyWorkbench;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Parts {

    private Parts() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final String DESC_ERROR = "Lỗi";

    public static final SlimefunItemStack PART_SHOVEL_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_SHOVEL_HEAD_DUMMY",
        SkullTextures.PART_SHOVEL_HEAD,
        ThemeItemType.CAST,
        "Bộ phận: Đầu xẻng",
        ThemeUtils.PASSIVE + "Một bộ phận đầu xẻng"
    );

    public static final SlimefunItemStack PART_PICKAXE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_PICKAXE_HEAD_DUMMY",
        SkullTextures.PART_PICKAXE_HEAD,
        ThemeItemType.CAST,
        "Bộ phận: Đầu cúp",
        ThemeUtils.PASSIVE + "Một bộ phận đầu cúp"
    );

    public static final SlimefunItemStack PART_AXE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_AXE_HEAD_DUMMY",
        SkullTextures.PART_AXE_HEAD,
        ThemeItemType.CAST,
        "Bộ phận: Lưỡi rìu",
        ThemeUtils.PASSIVE + "Một bộ phận lưỡi rìu"
    );

    public static final SlimefunItemStack PART_HOE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_HOE_HEAD_DUMMY",
        SkullTextures.PART_HOE_HEAD,
        ThemeItemType.CAST,
        "Bộ phận: Đầu cuốc",
        ThemeUtils.PASSIVE + "Một bộ phận đầu cuốc"
    );

    public static final SlimefunItemStack PART_SWORD_BLADE_DUMMY = ThemeUtils.themedItemStack(
        "PART_SWORD_BLADE_DUMMY",
        SkullTextures.PART_SWORD_BLADE,
        ThemeItemType.CAST,
        "Bộ phận: Lưỡi kiếm",
        ThemeUtils.PASSIVE + "Một bộ phận lưỡi kiếm"
    );

    public static final SlimefunItemStack PART_TOOL_ROD_DUMMY = ThemeUtils.themedItemStack(
        "PART_TOOL_ROD_DUMMY",
        SkullTextures.PART_TOOL_ROD,
        ThemeItemType.CAST,
        "Bộ phận: Tay cầm",
        ThemeUtils.PASSIVE + "Một bộ phận tay cầm"
    );

    public static final SlimefunItemStack PART_BINDING_DUMMY = ThemeUtils.themedItemStack(
        "PART_BINDING_DUMMY",
        SkullTextures.PART_BINDING,
        ThemeItemType.CAST,
        "Bộ phận: Dây buộc",
        ThemeUtils.PASSIVE + "Một bộ phận dây buộc"
    );

    public static final SlimefunItemStack PART_HELM_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_HELM_PLATE_DUMMY",
        SkullTextures.PART_HELM_PLATES,
        ThemeItemType.CAST,
        "Bộ phận: Tấm mũ giáp",
        ThemeUtils.PASSIVE + "Một bộ phận tấm mũ giáp"
    );

    public static final SlimefunItemStack PART_CHEST_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_CHEST_PLATE_DUMMY",
        SkullTextures.PART_CHEST_PLATES,
        ThemeItemType.CAST,
        "Bộ phận: Tấm giáp ngực",
        ThemeUtils.PASSIVE + "Một bộ phận tấm giáp ngực"
    );

    public static final SlimefunItemStack PART_LEG_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_LEG_PLATE_DUMMY",
        SkullTextures.PART_LEG_PLATES,
        ThemeItemType.CAST,
        "Bộ phận: Tấm quần giáp",
        ThemeUtils.PASSIVE + "Một bộ phận tấm quần giáp"
    );

    public static final SlimefunItemStack PART_BOOT_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_BOOT_PLATE_DUMMY",
        SkullTextures.PART_BOOTS_PLATES,
        ThemeItemType.CAST,
        "Bộ phận: Tấm giày giáp",
        ThemeUtils.PASSIVE + "Một bộ phận tấm giày giáp"
    );

    public static final SlimefunItemStack PART_MAIL_LINKS_DUMMY = ThemeUtils.themedItemStack(
        "PART_MAIL_LINKS_DUMMY",
        SkullTextures.PART_LINKS,
        ThemeItemType.CAST,
        "Bộ phận: Khớp nối giáp",
        ThemeUtils.PASSIVE + "Một bộ phận khớp nối giáp"
    );

    public static final SlimefunItemStack PART_GAMBESON_DUMMY = ThemeUtils.themedItemStack(
        "PART_GAMBESON_DUMMY",
        SkullTextures.PART_GAMBESON,
        ThemeItemType.CAST,
        "Bộ phận: Lớp đệm giáp",
        ThemeUtils.PASSIVE + "Một lớp lót đệm bên trong áo giáp"
    );

    public static final SlimefunItemStack PART_REPAIR_KIT_DUMMY = ThemeUtils.themedItemStack(
        "PART_REPAIR_KIT_DUMMY",
        Material.CHEST_MINECART,
        ThemeItemType.CAST,
        "Bộ phận: Bộ sửa chữa",
        ThemeUtils.PASSIVE + "Dùng để sửa chữa trang bị hỏng trong Bàn sửa chữa SlimeTinker"
    );

    public static final SlimefunItemStack PART_AXE_HEAD = ThemeUtils.themedItemStack(
        "PART_AXE_HEAD",
        SkullTextures.PART_AXE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_HOE_HEAD = ThemeUtils.themedItemStack(
        "PART_HOE_HEAD",
        SkullTextures.PART_HOE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_PICKAXE_HEAD = ThemeUtils.themedItemStack(
        "PART_PICKAXE_HEAD",
        SkullTextures.PART_PICKAXE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_SHOVEL_HEAD = ThemeUtils.themedItemStack(
        "PART_SHOVEL_HEAD",
        SkullTextures.PART_SHOVEL_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_SWORD_BLADE = ThemeUtils.themedItemStack(
        "PART_SWORD_BLADE",
        SkullTextures.PART_SWORD_BLADE,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_TOOL_ROD = ThemeUtils.themedItemStack(
        "PART_TOOL_ROD",
        SkullTextures.PART_TOOL_ROD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_REPAIR_KIT = ThemeUtils.themedItemStack(
        "PART_REPAIR_KIT",
        Material.CHEST_MINECART,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_BINDING_GENERAL_DISPLAY = ThemeUtils.themedItemStack(
        "PART_BINDING_GENERAL_DISPLAY",
        Material.STRING,
        ThemeItemType.CRAFTING,
        "Vật liệu dây buộc",
        ThemeUtils.PASSIVE + "Có thể dùng bất kỳ vật liệu nào phù hợp làm dây buộc",
        ThemeUtils.PASSIVE + "Không chỉ dây tơ, các vật liệu phù hợp khác đều được",
        ThemeUtils.PASSIVE + "Chỉ cần đặt như thế này là được"
    );

    public static final SlimefunItemStack PART_HELM_PLATES = ThemeUtils.themedItemStack(
        "PART_HELM_PLATES",
        SkullTextures.PART_HELM_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_CHEST_PLATES = ThemeUtils.themedItemStack(
        "PART_CHEST_PLATES",
        SkullTextures.PART_CHEST_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_LEG_PLATES = ThemeUtils.themedItemStack(
        "PART_LEG_PLATES",
        SkullTextures.PART_LEG_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_BOOTS_PLATES = ThemeUtils.themedItemStack(
        "PART_BOOTS_PLATES",
        SkullTextures.PART_BOOTS_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_MAIL_LINKS = ThemeUtils.themedItemStack(
        "PART_MAIL_LINKS",
        SkullTextures.PART_LINKS,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_GAMBESON_GENERAL_DISPLAY = ThemeUtils.themedItemStack(
        "PART_GAMBESON_GENERAL_DISPLAY",
        Material.STRING,
        ThemeItemType.CRAFTING,
        "Vật liệu lớp đệm giáp",
        ThemeUtils.PASSIVE + "Có thể dùng bất kỳ vật liệu nào phù hợp làm lớp đệm giáp",
        ThemeUtils.PASSIVE + "Không chỉ dây tơ, các vật liệu phù hợp khác đều được",
        ThemeUtils.PASSIVE + "Chỉ cần đặt như thế này là được"
    );

    // Statics for Recipes
    public static final PartTemplate SHOVEL_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_SHOVEL_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Đầu xẻng");
    public static final PartTemplate PICKAXE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_PICKAXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Đầu cúp");
    public static final PartTemplate AXE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_AXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Lưỡi rìu");
    public static final PartTemplate HOE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_HOE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Đầu cuốc");
    public static final PartTemplate SWORD_BLADE = new PartTemplate(ItemGroups.DUMMY, PART_SWORD_BLADE, DummySmeltery.TYPE, new ItemStack[9], "Lưỡi kiếm");
    public static final PartTemplate TOOL_ROD = new PartTemplate(ItemGroups.DUMMY, PART_TOOL_ROD, DummySmeltery.TYPE, new ItemStack[9], "Tay cầm");
    public static final RepairkitTemplate REPAIR_KIT = new RepairkitTemplate(ItemGroups.DUMMY, PART_REPAIR_KIT, DummySmeltery.TYPE, new ItemStack[9], "Bộ sửa chữa");
    public static final PartTemplate HELM_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_HELM_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Tấm mũ giáp");
    public static final PartTemplate CHEST_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_CHEST_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Tấm giáp ngực");
    public static final PartTemplate LEG_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_LEG_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Tấm quần giáp");
    public static final PartTemplate BOOT_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_BOOTS_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Tấm giày giáp");
    public static final PartTemplate MAIL_LINKS = new PartTemplate(ItemGroups.DUMMY, PART_MAIL_LINKS, DummySmeltery.TYPE, new ItemStack[9], "Khớp nối giáp");

    public static void set(SlimeTinker p) {

        // Dummies for the recipe book
        new UnplaceableBlock(ItemGroups.PARTS, PART_SHOVEL_HEAD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_SHOVELHEAD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_PICKAXE_HEAD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_PICKAXEHEAD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_AXE_HEAD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_AXEHEAD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_HOE_HEAD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_HOEHEAD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_SWORD_BLADE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_SWORDBLADE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_TOOL_ROD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_TOOLROD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_BINDING_DUMMY, DummyWorkbench.TYPE, new ItemStack[]{
            PART_BINDING_GENERAL_DISPLAY, null, PART_BINDING_GENERAL_DISPLAY,
            null, PART_BINDING_GENERAL_DISPLAY, null,
            PART_BINDING_GENERAL_DISPLAY, null, PART_BINDING_GENERAL_DISPLAY
        }).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_HELM_PLATE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_HELM_PLATE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_CHEST_PLATE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_CHEST_PLATE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_LEG_PLATE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_LEG_PLATE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_BOOT_PLATE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BOOT_PLATE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_MAIL_LINKS_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_MAIL_LINK)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_GAMBESON_DUMMY, DummyWorkbench.TYPE, new ItemStack[]{
            null, PART_GAMBESON_GENERAL_DISPLAY, PART_BINDING_GENERAL_DISPLAY,
            PART_GAMBESON_GENERAL_DISPLAY, null, PART_GAMBESON_GENERAL_DISPLAY,
            PART_BINDING_GENERAL_DISPLAY, PART_GAMBESON_GENERAL_DISPLAY, null
        }).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_REPAIR_KIT_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_REPAIRKIT)).register(p);

        // Real ones, not in recipe book due to the variations
        SHOVEL_HEAD.register(p);
        PICKAXE_HEAD.register(p);
        AXE_HEAD.register(p);
        HOE_HEAD.register(p);
        SWORD_BLADE.register(p);
        TOOL_ROD.register(p);

        REPAIR_KIT.register(p);

        HELM_PLATE.register(p);
        CHEST_PLATE.register(p);
        LEG_PLATE.register(p);
        BOOT_PLATE.register(p);

    }

}
