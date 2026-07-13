package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.templates.ArmourTemplate;
import io.github.sefiraat.slimetinker.items.templates.ToolTemplate;
import io.github.sefiraat.slimetinker.items.templates.ToolTemplateExplosive;
import io.github.sefiraat.slimetinker.items.workstations.armourtable.DummyArmourTable;
import io.github.sefiraat.slimetinker.items.workstations.tooltable.DummyToolTable;
import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Guide {

    private Guide() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final String DESC_ERROR = "Error";
    public static final int LEVEL_TOOLS_NETHERITE = 10;
    public static final int LEVEL_TOOLS_DIAMOND = 8;
    public static final int LEVEL_TOOLS_IRON = 6;
    public static final int LEVEL_TOOLS_GOLD = 3;

    public static final int LEVEL_ARMOUR_NETHERITE = 10;
    public static final int LEVEL_ARMOUR_DIAMOND = 8;
    public static final int LEVEL_ARMOUR_IRON = 6;
    public static final int LEVEL_ARMOUR_CHAIN = 3;

    public static final SlimefunItemStack TOOL_SHOVEL_DUMMY = ThemeUtils.themedItemStack(
        "TOOL_SHOVEL_DUMMY",
        Material.STONE_SHOVEL,
        ThemeItemType.TOOL,
        "Xẻng SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tay cầm, Dây buộc, Đầu xẻng",
        ThemeUtils.PASSIVE + "Công cụ SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi"
    );

    public static final SlimefunItemStack TOOL_PICKAXE_DUMMY = ThemeUtils.themedItemStack(
        "TOOL_PICKAXE_DUMMY",
        Material.STONE_PICKAXE,
        ThemeItemType.TOOL,
        "Cúp SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tay cầm, Dây buộc, Đầu cúp",
        ThemeUtils.PASSIVE + "Công cụ SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi"
    );

    public static final SlimefunItemStack TOOL_AXE_DUMMY = ThemeUtils.themedItemStack(
        "TOOL_AXE_DUMMY",
        Material.STONE_AXE,
        ThemeItemType.TOOL,
        "Rìu SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tay cầm, Dây buộc, Lưỡi rìu",
        ThemeUtils.PASSIVE + "Công cụ SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi"
    );

    public static final SlimefunItemStack TOOL_HOE_DUMMY = ThemeUtils.themedItemStack(
        "TOOL_HOE_DUMMY",
        Material.STONE_HOE,
        ThemeItemType.TOOL,
        "Cuốc SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tay cầm, Dây buộc, Đầu cuốc",
        ThemeUtils.PASSIVE + "Công cụ SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi"
    );

    public static final SlimefunItemStack TOOL_SWORD_DUMMY = ThemeUtils.themedItemStack(
        "TOOL_SWORD_DUMMY",
        Material.STONE_SWORD,
        ThemeItemType.TOOL,
        "Kiếm SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tay cầm, Dây buộc, Lưỡi kiếm",
        ThemeUtils.PASSIVE + "Vũ khí SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi"
    );

    public static final SlimefunItemStack ARMOUR_HELMET_DUMMY = ThemeUtils.themedItemStack(
        "ARMOUR_HELMET_DUMMY",
        Material.LEATHER_HELMET,
        ThemeItemType.ARMOUR,
        "Mũ giáp SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tấm mũ giáp, Lớp đệm giáp, Khớp nối giáp",
        ThemeUtils.PASSIVE + "Áo giáp SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi và thuộc tính bổ sung",
        ThemeUtils.PASSIVE + "Sẽ tự động tháo vào kho đồ khi bị hỏng",
        ThemeUtils.WARNING + "Nếu kho đồ không còn chỗ, nó sẽ rơi xuống đất"
    );

    public static final SlimefunItemStack ARMOUR_CHESTPLATE_DUMMY = ThemeUtils.themedItemStack(
        "ARMOUR_CHESTPLATE_DUMMY",
        Material.LEATHER_CHESTPLATE,
        ThemeItemType.ARMOUR,
        "Áo giáp ngực SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tấm giáp ngực, Lớp đệm giáp, Khớp nối giáp",
        ThemeUtils.PASSIVE + "Áo giáp SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi và thuộc tính bổ sung",
        ThemeUtils.PASSIVE + "Sẽ tự động tháo vào kho đồ khi bị hỏng",
        ThemeUtils.WARNING + "Nếu kho đồ không còn chỗ, nó sẽ rơi xuống đất"
    );

    public static final SlimefunItemStack ARMOUR_LEGGINGS_DUMMY = ThemeUtils.themedItemStack(
        "ARMOUR_LEGGINGS_DUMMY",
        Material.LEATHER_LEGGINGS,
        ThemeItemType.ARMOUR,
        "Quần giáp SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tấm quần giáp, Lớp đệm giáp, Khớp nối giáp",
        ThemeUtils.PASSIVE + "Áo giáp SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi và thuộc tính bổ sung",
        ThemeUtils.PASSIVE + "Sẽ tự động tháo vào kho đồ khi bị hỏng",
        ThemeUtils.WARNING + "Nếu kho đồ không còn chỗ, nó sẽ rơi xuống đất"
    );

    public static final SlimefunItemStack ARMOUR_BOOTS_DUMMY = ThemeUtils.themedItemStack(
        "ARMOUR_BOOTS_DUMMY",
        Material.LEATHER_BOOTS,
        ThemeItemType.ARMOUR,
        "Giày giáp SlimeTinker",
        ThemeUtils.PASSIVE + "Bao gồm ba phần: Tấm giày giáp, Lớp đệm giáp, Khớp nối giáp",
        ThemeUtils.PASSIVE + "Áo giáp SlimeTinker có các thuộc tính khác nhau tùy thuộc vào vật liệu của từng bộ phận",
        ThemeUtils.PASSIVE + "Nâng cấp có thể nhận được khe cắm bản sửa đổi và thuộc tính bổ sung",
        ThemeUtils.PASSIVE + "Sẽ tự động tháo vào kho đồ khi bị hỏng",
        ThemeUtils.WARNING + "Nếu kho đồ không còn chỗ, nó sẽ rơi xuống đất"
    );

    public static final SlimefunItemStack TOOL_AXE = ThemeUtils.themedItemStack(
        "TOOL_AXE",
        SkullTextures.PART_AXE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_HOE = ThemeUtils.themedItemStack(
        "TOOL_HOE",
        SkullTextures.PART_HOE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_PICKAXE = ThemeUtils.themedItemStack(
        "TOOL_PICKAXE",
        SkullTextures.PART_PICKAXE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_SHOVEL = ThemeUtils.themedItemStack(
        "TOOL_SHOVEL",
        SkullTextures.PART_SHOVEL_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_SWORD = ThemeUtils.themedItemStack(
        "TOOL_SWORD",
        SkullTextures.PART_SWORD_BLADE,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_AXE_EXP = ThemeUtils.themedItemStack(
        "TOOL_AXE_EXP",
        SkullTextures.PART_AXE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_HOE_EXP = ThemeUtils.themedItemStack(
        "TOOL_HOE_EXP",
        SkullTextures.PART_HOE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_PICKAXE_EXP = ThemeUtils.themedItemStack(
        "TOOL_PICKAXE_EXP",
        SkullTextures.PART_PICKAXE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_SHOVEL_EXP = ThemeUtils.themedItemStack(
        "TOOL_SHOVEL_EXP",
        SkullTextures.PART_SHOVEL_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_SWORD_EXP = ThemeUtils.themedItemStack(
        "TOOL_SWORD_EXP",
        SkullTextures.PART_SWORD_BLADE,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack ARMOUR_HELM = ThemeUtils.themedItemStack(
        "ARMOUR_HELM",
        SkullTextures.PART_HELM_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack ARMOUR_CHESTPLATE = ThemeUtils.themedItemStack(
        "ARMOUR_CHESTPLATE",
        SkullTextures.PART_CHEST_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack ARMOUR_LEGGINGS = ThemeUtils.themedItemStack(
        "ARMOUR_LEGGINGS",
        SkullTextures.PART_LEG_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack ARMOUR_BOOTS = ThemeUtils.themedItemStack(
        "ARMOUR_BOOTS",
        SkullTextures.PART_BOOTS_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack TOOL_INFO = ThemeUtils.themedItemStack(
        "TOOL_INFO",
        SkullTextures.INFO,
        ThemeItemType.INFO,
        "Thông tin công cụ SlimeTinker",
        ThemeUtils.PASSIVE + "Khi sử dụng công cụ hoặc vũ khí SlimeTinker,",
        ThemeUtils.PASSIVE + "bạn sẽ nhận được kinh nghiệm độ thông thạo",
        ThemeUtils.PASSIVE + "Tích lũy đủ kinh nghiệm có thể được nâng cấp",
        ThemeUtils.PASSIVE + "Mỗi lần nâng cấp sẽ nhận được 1 khe cắm bản sửa đổi",
        ThemeUtils.PASSIVE + "Thứ tự chất lượng: Đá > Vàng > Sắt > Kim cương > Netherite"
    );

    public static final SlimefunItemStack ARMOUR_INFO = ThemeUtils.themedItemStack(
        "ARMOUR_INFO",
        SkullTextures.INFO,
        ThemeItemType.INFO,
        "Thông tin áo giáp SlimeTinker",
        ThemeUtils.PASSIVE + "Khi sử dụng áo giáp SlimeTinker,",
        ThemeUtils.PASSIVE + "bạn sẽ nhận được kinh nghiệm độ thông thạo",
        ThemeUtils.PASSIVE + "Tích lũy đủ kinh nghiệm có thể được nâng cấp",
        ThemeUtils.PASSIVE + "Mỗi lần nâng cấp sẽ nhận được 1 khe cắm bản sửa đổi",
        ThemeUtils.PASSIVE + "Thứ tự chất lượng: Da > Xích > Sắt > Kim cương > Netherite"
    );

    public static final ToolTemplate SHOVEL = new ToolTemplate(ItemGroups.DUMMY, TOOL_SHOVEL, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplate PICKAXE = new ToolTemplate(ItemGroups.DUMMY, TOOL_PICKAXE, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplate AXE = new ToolTemplate(ItemGroups.DUMMY, TOOL_AXE, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplate HOE = new ToolTemplate(ItemGroups.DUMMY, TOOL_HOE, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplate SWORD = new ToolTemplate(ItemGroups.DUMMY, TOOL_SWORD, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplateExplosive EXP_SHOVEL = new ToolTemplateExplosive(ItemGroups.DUMMY, TOOL_SHOVEL_EXP, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplateExplosive EXP_PICKAXE = new ToolTemplateExplosive(ItemGroups.DUMMY, TOOL_PICKAXE_EXP, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplateExplosive EXP_AXE = new ToolTemplateExplosive(ItemGroups.DUMMY, TOOL_AXE_EXP, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplateExplosive EXP_HOE = new ToolTemplateExplosive(ItemGroups.DUMMY, TOOL_HOE_EXP, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ToolTemplateExplosive EXP_SWORD = new ToolTemplateExplosive(ItemGroups.DUMMY, TOOL_SWORD_EXP, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ArmourTemplate HELM = new ArmourTemplate(ItemGroups.DUMMY, ARMOUR_HELM, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ArmourTemplate CHEST = new ArmourTemplate(ItemGroups.DUMMY, ARMOUR_CHESTPLATE, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ArmourTemplate LEG = new ArmourTemplate(ItemGroups.DUMMY, ARMOUR_LEGGINGS, DummyToolTable.TYPE, new ItemStack[9]);
    public static final ArmourTemplate BOOT = new ArmourTemplate(ItemGroups.DUMMY, ARMOUR_BOOTS, DummyToolTable.TYPE, new ItemStack[9]);

    private static final Map<String, Map<Integer, Material>> GROWTH_MAP = new HashMap<>();

    public static Map<String, Map<Integer, Material>> getGrowthMap() {
        return GROWTH_MAP;
    }

    @Nonnull
    private static Map<Integer, Material> getShovelMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_TOOLS_NETHERITE, Material.NETHERITE_SHOVEL);
        map.put(LEVEL_TOOLS_DIAMOND, Material.DIAMOND_SHOVEL);
        map.put(LEVEL_TOOLS_IRON, Material.IRON_SHOVEL);
        map.put(LEVEL_TOOLS_GOLD, Material.GOLDEN_SHOVEL);
        return map;
    }

    @Nonnull
    private static Map<Integer, Material> getPickaxeMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_TOOLS_NETHERITE, Material.NETHERITE_PICKAXE);
        map.put(LEVEL_TOOLS_DIAMOND, Material.DIAMOND_PICKAXE);
        map.put(LEVEL_TOOLS_IRON, Material.IRON_PICKAXE);
        map.put(LEVEL_TOOLS_GOLD, Material.GOLDEN_PICKAXE);
        return map;
    }

    @Nonnull
    private static Map<Integer, Material> getAxeMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_TOOLS_NETHERITE, Material.NETHERITE_AXE);
        map.put(LEVEL_TOOLS_DIAMOND, Material.DIAMOND_AXE);
        map.put(LEVEL_TOOLS_IRON, Material.IRON_AXE);
        map.put(LEVEL_TOOLS_GOLD, Material.GOLDEN_AXE);
        return map;
    }

    @Nonnull
    private static Map<Integer, Material> getHoeMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_TOOLS_NETHERITE, Material.NETHERITE_HOE);
        map.put(LEVEL_TOOLS_DIAMOND, Material.DIAMOND_HOE);
        map.put(LEVEL_TOOLS_IRON, Material.IRON_HOE);
        map.put(LEVEL_TOOLS_GOLD, Material.GOLDEN_HOE);
        return map;
    }

    @Nonnull
    private static Map<Integer, Material> getSwordMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_TOOLS_NETHERITE, Material.NETHERITE_SWORD);
        map.put(LEVEL_TOOLS_DIAMOND, Material.DIAMOND_SWORD);
        map.put(LEVEL_TOOLS_IRON, Material.IRON_SWORD);
        map.put(LEVEL_TOOLS_GOLD, Material.GOLDEN_SWORD);
        return map;
    }

    @Nonnull
    private static Map<Integer, Material> getHelmetMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_ARMOUR_NETHERITE, Material.NETHERITE_HELMET);
        map.put(LEVEL_ARMOUR_DIAMOND, Material.DIAMOND_HELMET);
        map.put(LEVEL_ARMOUR_IRON, Material.IRON_HELMET);
        map.put(LEVEL_ARMOUR_CHAIN, Material.CHAINMAIL_HELMET);
        return map;
    }

    @Nonnull
    private static Map<Integer, Material> getChestplateMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_ARMOUR_NETHERITE, Material.NETHERITE_CHESTPLATE);
        map.put(LEVEL_ARMOUR_DIAMOND, Material.DIAMOND_CHESTPLATE);
        map.put(LEVEL_ARMOUR_IRON, Material.IRON_CHESTPLATE);
        map.put(LEVEL_ARMOUR_CHAIN, Material.CHAINMAIL_CHESTPLATE);
        return map;
    }

    @Nonnull
    private static Map<Integer, Material> getLeggingsMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_ARMOUR_NETHERITE, Material.NETHERITE_LEGGINGS);
        map.put(LEVEL_ARMOUR_DIAMOND, Material.DIAMOND_LEGGINGS);
        map.put(LEVEL_ARMOUR_IRON, Material.IRON_LEGGINGS);
        map.put(LEVEL_ARMOUR_CHAIN, Material.CHAINMAIL_LEGGINGS);
        return map;
    }

    @Nonnull
    private static Map<Integer, Material> getBootsMap() {
        Map<Integer, Material> map = new LinkedHashMap<>();
        map.put(LEVEL_ARMOUR_NETHERITE, Material.NETHERITE_BOOTS);
        map.put(LEVEL_ARMOUR_DIAMOND, Material.DIAMOND_BOOTS);
        map.put(LEVEL_ARMOUR_IRON, Material.IRON_BOOTS);
        map.put(LEVEL_ARMOUR_CHAIN, Material.CHAINMAIL_BOOTS);
        return map;
    }

    @Nonnull
    private static ItemStack[] getDummyToolRecipe(ItemStack i3) {
        return new ItemStack[]{
            null, null, null,
            Parts.PART_TOOL_ROD_DUMMY, Parts.PART_BINDING_DUMMY, i3,
            null, null, null
        };
    }

    @Nonnull
    private static ItemStack[] getDummyArmourRecipe(ItemStack i3) {
        return new ItemStack[]{
            null, null, null,
            i3, Parts.PART_GAMBESON_DUMMY, Parts.PART_MAIL_LINKS_DUMMY,
            null, null, null
        };
    }

    public static void set(SlimeTinker p) {
        new UnplaceableBlock(ItemGroups.TOOLS, TOOL_INFO, DummyToolTable.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.TOOLS, TOOL_SHOVEL_DUMMY, DummyToolTable.TYPE, getDummyToolRecipe(Parts.PART_SHOVEL_HEAD_DUMMY)).register(p);
        new UnplaceableBlock(ItemGroups.TOOLS, TOOL_PICKAXE_DUMMY, DummyToolTable.TYPE, getDummyToolRecipe(Parts.PART_PICKAXE_HEAD_DUMMY)).register(p);
        new UnplaceableBlock(ItemGroups.TOOLS, TOOL_AXE_DUMMY, DummyToolTable.TYPE, getDummyToolRecipe(Parts.PART_AXE_HEAD_DUMMY)).register(p);
        new UnplaceableBlock(ItemGroups.TOOLS, TOOL_HOE_DUMMY, DummyToolTable.TYPE, getDummyToolRecipe(Parts.PART_HOE_HEAD_DUMMY)).register(p);
        new UnplaceableBlock(ItemGroups.TOOLS, TOOL_SWORD_DUMMY, DummyToolTable.TYPE, getDummyToolRecipe(Parts.PART_SWORD_BLADE_DUMMY)).register(p);

        new UnplaceableBlock(ItemGroups.ARMOUR, ARMOUR_INFO, DummyArmourTable.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.ARMOUR, ARMOUR_HELMET_DUMMY, DummyArmourTable.TYPE, getDummyArmourRecipe(Parts.PART_HELM_PLATE_DUMMY)).register(p);
        new UnplaceableBlock(ItemGroups.ARMOUR, ARMOUR_CHESTPLATE_DUMMY, DummyArmourTable.TYPE, getDummyArmourRecipe(Parts.PART_CHEST_PLATE_DUMMY)).register(p);
        new UnplaceableBlock(ItemGroups.ARMOUR, ARMOUR_LEGGINGS_DUMMY, DummyArmourTable.TYPE, getDummyArmourRecipe(Parts.PART_LEG_PLATE_DUMMY)).register(p);
        new UnplaceableBlock(ItemGroups.ARMOUR, ARMOUR_BOOTS_DUMMY, DummyArmourTable.TYPE, getDummyArmourRecipe(Parts.PART_BOOT_PLATE_DUMMY)).register(p);

        SHOVEL.register(p);
        PICKAXE.register(p);
        AXE.register(p);
        HOE.register(p);
        SWORD.register(p);
        EXP_SHOVEL.register(p);
        EXP_PICKAXE.register(p);
        EXP_AXE.register(p);
        EXP_HOE.register(p);
        EXP_SWORD.register(p);

        HELM.register(p);
        CHEST.register(p);
        LEG.register(p);
        BOOT.register(p);

        GROWTH_MAP.put(Ids.SHOVEL, getShovelMap());
        GROWTH_MAP.put(Ids.PICKAXE, getPickaxeMap());
        GROWTH_MAP.put(Ids.AXE, getAxeMap());
        GROWTH_MAP.put(Ids.HOE, getHoeMap());
        GROWTH_MAP.put(Ids.SWORD, getSwordMap());

        GROWTH_MAP.put(Ids.HELMET, getHelmetMap());
        GROWTH_MAP.put(Ids.CHESTPLATE, getChestplateMap());
        GROWTH_MAP.put(Ids.LEGGINGS, getLeggingsMap());
        GROWTH_MAP.put(Ids.BOOTS, getBootsMap());
    }
}
