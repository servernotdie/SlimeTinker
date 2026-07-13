package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterialManager;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Casts {

    private Casts() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final String CAST_DESC = "Đúc chất lỏng vào khuôn để tạo ra hình dạng";
    public static final String INPUT_DESC = "Tiêu thụ : ";
    public static final String OUTPUT_DESC = "Nhận được : ";
    public static final String UNIT_DESC = " Đơn vị";
    public static final SlimefunItemStack CAST_NUGGET =
        ThemeUtils.themedItemStack(
            "CAST_NUGGET",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Hạt kim loại",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_NUGGET + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Hạt"
        );
    public static final SlimefunItemStack CAST_BLOCK =
        ThemeUtils.themedItemStack(
            "CAST_BLOCK",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Khối kim loại",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_BLOCK + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Khối"
        );
    public static final SlimefunItemStack CAST_INGOT =
        ThemeUtils.themedItemStack(
            "CAST_INGOT",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Phôi kim loại",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_INGOT + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Phôi"
        );
    public static final SlimefunItemStack CAST_GEM =
        ThemeUtils.themedItemStack(
            "CAST_GEM",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Đá quý",
            ThemeUtils.PASSIVE + "Áp dụng cho chất lỏng phi kim loại",
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_GEM + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Đá quý"
        );
    public static final SlimefunItemStack CAST_SHOVELHEAD =
        ThemeUtils.themedItemStack(
            "CAST_SHOVELHEAD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Đầu xẻng",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_SHOVELHEAD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Đầu xẻng"
        );
    public static final SlimefunItemStack CAST_PICKAXEHEAD =
        ThemeUtils.themedItemStack(
            "CAST_PICKAXEHEAD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Đầu cúp",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_PICKAXEHEAD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Đầu cúp"
        );
    public static final SlimefunItemStack CAST_AXEHEAD =
        ThemeUtils.themedItemStack(
            "CAST_AXE_HEAD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Lưỡi rìu",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_AXEHEAD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Lưỡi rìu"
        );
    public static final SlimefunItemStack CAST_HOEHEAD =
        ThemeUtils.themedItemStack(
            "CAST_HOEHEAD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Đầu cuốc",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_HOEHEAD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Đầu cuốc"
        );
    public static final SlimefunItemStack CAST_SWORDBLADE =
        ThemeUtils.themedItemStack(
            "CAST_SWORDBLADE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Lưỡi kiếm",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_SWORDBLADE + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Lưỡi kiếm"
        );
    public static final SlimefunItemStack CAST_TOOLROD =
        ThemeUtils.themedItemStack(
            "CAST_TOOLROD",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Tay cầm",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_TOOLROD + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Tay cầm"
        );
    public static final SlimefunItemStack CAST_HELM_PLATE =
        ThemeUtils.themedItemStack(
            "CAST_HELM_PLATE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Tấm mũ giáp",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_ARM_HELM + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Tấm mũ giáp"
        );
    public static final SlimefunItemStack CAST_CHEST_PLATE =
        ThemeUtils.themedItemStack(
            "CAST_CHEST_PLATE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Tấm giáp ngực",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_ARM_CHEST + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Tấm giáp ngực"
        );
    public static final SlimefunItemStack CAST_LEG_PLATE =
        ThemeUtils.themedItemStack(
            "CAST_LEG_PLATE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Tấm quần giáp",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_ARM_LEG + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Tấm quần giáp"
        );
    public static final SlimefunItemStack CAST_BOOT_PLATE =
        ThemeUtils.themedItemStack(
            "CAST_BOOT_PLATE",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Tấm giày giáp",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_ARM_BOOT + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Tấm giày giáp"
        );
    public static final SlimefunItemStack CAST_MAIL_LINK =
        ThemeUtils.themedItemStack(
            "CAST_MAIL_LINK",
            Material.ORANGE_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Khớp nối giáp",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_ARM_LINKS + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Khớp nối giáp"
        );
    public static final SlimefunItemStack CAST_REPAIRKIT =
        ThemeUtils.themedItemStack(
            "CAST_REPAIRKIT",
            Material.YELLOW_CARPET,
            ThemeItemType.CAST,
            "Khuôn: Bộ sửa chữa",
            ThemeUtils.PASSIVE + CAST_DESC,
            "",
            ThemeUtils.CLICK_INFO + INPUT_DESC + ChatColor.WHITE + TinkerMaterialManager.AMOUNT_KIT + UNIT_DESC,
            ThemeUtils.CLICK_INFO + OUTPUT_DESC + ChatColor.WHITE + "1 Bộ sửa chữa"
        );
    protected static final ItemStack[] RECIPE_CAST_NUGGET = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.IRON_NUGGET), null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_INGOT = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.BRICK), null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_BLOCK = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.STONE), null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_GEM = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.DIAMOND), null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_SHOVEL_HEAD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_SHOVEL_HEAD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_PICKAXE_HEAD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_PICKAXE_HEAD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_AXE_HEAD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_AXE_HEAD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_HOE_HEAD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_HOE_HEAD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_SWORD_BLADE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_SWORD_BLADE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_TOOL_ROD = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_TOOL_ROD, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_HELM_PLATE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_HELM_PLATE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_CHEST_PLATE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_CHEST_PLATE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_LEG_PLATE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_LEG_PLATE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_BOOT_PLATE = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_BOOT_PLATE, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_MAIL_LINK = new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.BRASS_INGOT, 2), Dies.DIE_MAIL_LINK, null,
        null, null, null,
        null, null, null
    };
    protected static final ItemStack[] RECIPE_CAST_REPAIR_KIT = new ItemStack[]{
        new ItemStack(Material.GOLD_INGOT, 2), Dies.DIE_REPAIR_KIT, null,
        null, null, null,
        null, null, null
    };

    public static void set(SlimeTinker p) {

        new UnplaceableBlock(ItemGroups.CASTS, CAST_NUGGET, DummySmeltery.TYPE, RECIPE_CAST_NUGGET).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_INGOT, DummySmeltery.TYPE, RECIPE_CAST_INGOT).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_BLOCK, DummySmeltery.TYPE, RECIPE_CAST_BLOCK).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_GEM, DummySmeltery.TYPE, RECIPE_CAST_GEM).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_SHOVELHEAD, DummySmeltery.TYPE, RECIPE_CAST_SHOVEL_HEAD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_PICKAXEHEAD, DummySmeltery.TYPE, RECIPE_CAST_PICKAXE_HEAD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_AXEHEAD, DummySmeltery.TYPE, RECIPE_CAST_AXE_HEAD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_HOEHEAD, DummySmeltery.TYPE, RECIPE_CAST_HOE_HEAD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_SWORDBLADE, DummySmeltery.TYPE, RECIPE_CAST_SWORD_BLADE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_TOOLROD, DummySmeltery.TYPE, RECIPE_CAST_TOOL_ROD).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_HELM_PLATE, DummySmeltery.TYPE, RECIPE_CAST_HELM_PLATE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_CHEST_PLATE, DummySmeltery.TYPE, RECIPE_CAST_CHEST_PLATE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_LEG_PLATE, DummySmeltery.TYPE, RECIPE_CAST_LEG_PLATE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_BOOT_PLATE, DummySmeltery.TYPE, RECIPE_CAST_BOOT_PLATE).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_MAIL_LINK, DummySmeltery.TYPE, RECIPE_CAST_MAIL_LINK).register(p);
        new UnplaceableBlock(ItemGroups.CASTS, CAST_REPAIRKIT, DummySmeltery.TYPE, RECIPE_CAST_REPAIR_KIT).register(p);

    }
}
