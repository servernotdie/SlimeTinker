package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.DummyModificationStation;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Mods {

    private Mods() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final SlimefunItemStack MOD_REDSTONE_DUMMY = ThemeUtils.themedItemStack(
        "MOD_REDSTONE_DUMMY",
        Material.REDSTONE,
        ThemeItemType.MOD,
        "Bản sửa đổi: Đá đỏ",
        ThemeUtils.PASSIVE + "Trang bị có thể áp dụng: Công cụ/Vũ khí",
        "",
        ThemeUtils.PASSIVE + "Khi người chơi cầm trang bị này,",
        ThemeUtils.PASSIVE + "sẽ nhận được hiệu ứng Hấp tấp tương ứng với cấp độ bản sửa đổi"
    );

    public static final SlimefunItemStack MOD_LAPIS_DUMMY = ThemeUtils.themedItemStack(
        "MOD_LAPIS_DUMMY",
        Material.LAPIS_LAZULI,
        ThemeItemType.MOD,
        "Bản sửa đổi: Ngọc lưu ly",
        ThemeUtils.PASSIVE + "Trang bị có thể áp dụng: Công cụ/Vũ khí",
        "",
        ThemeUtils.PASSIVE + "Khi người chơi cầm trang bị này,",
        ThemeUtils.PASSIVE + "sẽ nhận được hiệu ứng tương đương với phù phép Gia tài hoặc Nhặt rác",
        ThemeUtils.PASSIVE + "Mỗi bản sửa đổi này được cài đặt sẽ tăng 10% hiệu ứng"
    );

    public static final SlimefunItemStack MOD_QUARTZ_DUMMY = ThemeUtils.themedItemStack(
        "MOD_QUARTZ_DUMMY",
        Material.QUARTZ,
        ThemeItemType.MOD,
        "Bản sửa đổi: Thạch anh",
        ThemeUtils.PASSIVE + "Trang bị có thể áp dụng: Công cụ/Vũ khí",
        "",
        ThemeUtils.PASSIVE + "Khi người chơi cầm trang bị này,",
        ThemeUtils.PASSIVE + "sẽ tăng sát thương của công cụ/vũ khí đó",
        ThemeUtils.PASSIVE + "Mỗi bản sửa đổi này được cài đặt sẽ tăng 20% hiệu ứng"
    );

    public static final SlimefunItemStack MOD_DIAMOND_DUMMY = ThemeUtils.themedItemStack(
        "MOD_DIAMOND_DUMMY",
        Material.DIAMOND,
        ThemeItemType.MOD,
        "Bản sửa đổi: Kim cương",
        ThemeUtils.PASSIVE + "Trang bị có thể áp dụng: Công cụ/Vũ khí",
        "",
        ThemeUtils.PASSIVE + "Khi người chơi cầm trang bị này,",
        ThemeUtils.PASSIVE + "có tỉ lệ phản đòn khi bị tấn công",
        ThemeUtils.PASSIVE + "Mỗi bản sửa đổi này được cài đặt sẽ tăng 10% hiệu ứng"
    );

    public static final SlimefunItemStack MOD_EMERALD_DUMMY = ThemeUtils.themedItemStack(
        "MOD_EMERALD_DUMMY",
        Material.EMERALD,
        ThemeItemType.MOD,
        "Bản sửa đổi: Ngọc lục bảo",
        ThemeUtils.PASSIVE + "Trang bị có thể áp dụng: Công cụ/Vũ khí",
        "",
        ThemeUtils.PASSIVE + "Mỗi lần sử dụng trang bị đều có thể nhận thêm kinh nghiệm",
        ThemeUtils.PASSIVE + "Mỗi bản sửa đổi này được cài đặt sẽ tăng 1 điểm kinh nghiệm công cụ hoặc 10% kinh nghiệm vũ khí"
    );


    public static final SlimefunItemStack MOD_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "MOD_PLATE_DUMMY",
        Material.OBSIDIAN,
        ThemeItemType.MOD,
        "Bản sửa đổi: Tấm hợp kim gia cố",
        ThemeUtils.PASSIVE + "Trang bị có thể áp dụng: Công cụ/Vũ khí/Áo giáp",
        "",
        ThemeUtils.PASSIVE + "Mỗi bản sửa đổi này được cài đặt sẽ tăng 10% cơ hội không tiêu hao độ bền",
        ThemeUtils.PASSIVE + "Trang bị được cài đặt 10 bản sửa đổi sẽ không thể phá hủy"
    );


    public static void set(SlimeTinker p) {
        // Dummies for the recipe book
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_REDSTONE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_LAPIS_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_QUARTZ_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_DIAMOND_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_EMERALD_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_PLATE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
    }
}
