package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterialManager;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import net.guizhanss.minecraft.slimetinker.utils.LangUtils;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class GUIItems {

    private GUIItems() {
        throw new IllegalStateException("Utility class");
    }

    public static final CustomItemStack MENU_BACKGROUND_INPUT = new CustomItemStack(
        Material.LIGHT_BLUE_STAINED_GLASS_PANE,
        ChatColor.BLUE + "Đầu vào",
        " "
    );

    public static final CustomItemStack MENU_BACKGROUND_OUTPUT = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        ChatColor.RED + "Đầu ra",
        " "
    );

    public static final CustomItemStack MENU_BACKGROUND_CAST = new CustomItemStack(
        Material.LIME_STAINED_GLASS_PANE,
        ChatColor.GREEN + "Khuôn/Nguyên mẫu khuôn",
        " "
    );

    public static final CustomItemStack MENU_PREVIEW = new CustomItemStack(
        Material.LIME_STAINED_GLASS_PANE,
        ChatColor.GREEN + "Xem trước",
        " "
    );

    public static final CustomItemStack MENU_BACKGROUND_PREVIEW = new CustomItemStack(
        Material.LIME_STAINED_GLASS_PANE,
        ChatColor.GREEN + "Xem trước",
        " "
    );

    public static final CustomItemStack MENU_MARKER_ROD = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "Đặt tay cầm vào",
        ThemeUtils.PASSIVE + "Đặt bộ phận tay cầm vào ô bên dưới"
    );


    public static final CustomItemStack MENU_MARKER_BINDER = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "Đặt dây buộc vào",
        ThemeUtils.PASSIVE + "Đặt bộ phận dây buộc vào ô bên dưới"
    );

    public static final CustomItemStack MENU_MARKER_HEAD = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "Đặt đầu công cụ/vũ khí vào",
        ThemeUtils.PASSIVE + "Đặt bộ phận đầu công cụ/vũ khí vào ô bên dưới"
    );

    public static final CustomItemStack MENU_MARKER_LINKS = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "Đặt khớp nối giáp vào",
        ThemeUtils.PASSIVE + "Đặt bộ phận khớp nối giáp vào ô bên dưới"
    );

    public static final CustomItemStack MENU_MARKER_GAMBESON = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "Đặt lớp đệm giáp vào",
        ThemeUtils.PASSIVE + "Đặt lớp đệm giáp vào ô bên dưới"
    );


    public static final CustomItemStack MENU_MARKER_PLATES = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "Đặt tấm giáp vào",
        ThemeUtils.PASSIVE + "Đặt tấm giáp vào ô bên dưới"
    );

    public static final CustomItemStack MENU_PURGE = new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUTTON_PURGE)),
        ThemeUtils.GUI_HEAD + "Loại bỏ kim loại",
        "",
        ThemeUtils.PASSIVE + "Có thể trực tiếp loại bỏ kim loại không mong muốn khỏi bình chứa",
        "",
        ThemeUtils.CLICK_INFO + "Chuột trái để " + ChatColor.WHITE + "loại bỏ lớp kim loại trên cùng",
        ThemeUtils.CLICK_INFO + "Chuột phải để " + ChatColor.WHITE + "loại bỏ tất cả kim loại"
    );

    public static final CustomItemStack MENU_ALLOY = new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUTTON_ALLOY)),
        ThemeUtils.GUI_HEAD + "Hợp kim",
        "",
        ThemeUtils.PASSIVE + "Trộn chất lỏng trong bình kim loại",
        ThemeUtils.PASSIVE + "để thử tạo ra hợp kim"
    );

    public static final CustomItemStack MENU_POUR = new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUCKET_ORANGE)),
        ThemeUtils.GUI_HEAD + "Đúc",
        "",
        ThemeUtils.PASSIVE + "Đúc lớp kim loại trên cùng",
        ThemeUtils.PASSIVE + "Khuôn sẽ xác định hình dạng của kim loại nóng chảy",
        ThemeUtils.PASSIVE + "Sản phẩm sẽ nằm trong ô đầu ra"
    );

    public static final CustomItemStack MENU_CRAFT_WORKBENCH = new CustomItemStack(
        Material.FLETCHING_TABLE,
        ThemeUtils.GUI_HEAD + "Chế tạo",
        "",
        ThemeUtils.CLICK_INFO + "Nhấn vào đây " + ChatColor.WHITE + "để chế tạo vật phẩm"
    );

    public static final CustomItemStack MENU_CRAFT_TOOL_TABLE = new CustomItemStack(
        Material.SMITHING_TABLE,
        ThemeUtils.GUI_HEAD + "Lắp ráp công cụ/vũ khí",
        "",
        ThemeUtils.PASSIVE + "Lắp ráp ba bộ phận thành công cụ/vũ khí:",
        ThemeUtils.PASSIVE + "Tay cầm, Dây buộc, Đầu công cụ/vũ khí",
        ThemeUtils.CLICK_INFO + "Nhấn vào đây " + ChatColor.WHITE + "để lắp ráp"
    );

    public static final CustomItemStack MENU_CRAFT_ARMOUR_TABLE = new CustomItemStack(
        Material.SMITHING_TABLE,
        ThemeUtils.GUI_HEAD + "Lắp ráp áo giáp",
        "",
        ThemeUtils.PASSIVE + "Lắp ráp ba bộ phận thành áo giáp:",
        ThemeUtils.PASSIVE + "Tấm giáp, Lớp đệm giáp, Khớp nối giáp",
        ThemeUtils.CLICK_INFO + "Nhấn vào đây " + ChatColor.WHITE + "để lắp ráp"
    );

    public static final CustomItemStack MENU_CRAFT_REPAIR = new CustomItemStack(
        Material.CARTOGRAPHY_TABLE,
        ThemeUtils.GUI_HEAD + "Sửa chữa",
        "",
        ThemeUtils.PASSIVE + "Đặt trang bị SlimeTinker cần sửa chữa vào ô đầu tiên",
        ThemeUtils.PASSIVE + "Đặt bộ công cụ sửa chữa có chất liệu tương ứng với đầu công cụ/tấm giáp vào ô thứ hai",
        ThemeUtils.CLICK_INFO + "Nhấn vào đây " + ChatColor.WHITE + "để sửa chữa"
    );

    public static final CustomItemStack MENU_CRAFT_MOD = new CustomItemStack(
        Material.GRINDSTONE,
        ThemeUtils.GUI_HEAD + "Cài đặt bản sửa đổi",
        "",
        ThemeUtils.PASSIVE + "Đặt trang bị SlimeTinker vào ô đầu tiên",
        ThemeUtils.PASSIVE + "Đặt bản sửa đổi cần cài đặt vào ô thứ hai",
        ThemeUtils.CLICK_INFO + "Nhấn vào đây " + ChatColor.WHITE + "để cài đặt bản sửa đổi"
    );

    public static final CustomItemStack MENU_CRAFT_SWAP = new CustomItemStack(
        Material.LOOM,
        ThemeUtils.GUI_HEAD + "Thay thế bộ phận",
        "",
        ThemeUtils.PASSIVE + "Đặt trang bị SlimeTinker vào ô đầu tiên",
        ThemeUtils.PASSIVE + "Đặt bộ phận cần thay thế vào ô thứ hai",
        ThemeUtils.CLICK_INFO + "Nhấn vào đây " + ChatColor.WHITE + "để thay thế bộ phận"
    );

    @Nonnull
    public static CustomItemStack menuLavaInfo(int fillPercent, int fillAmt, int fillMax) {
        ItemStack skull;
        if (fillPercent >= 95) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_5));
        } else if (fillPercent >= 75) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_4));
        } else if (fillPercent >= 50) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_3));
        } else if (fillPercent >= 25) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_2));
        } else if (fillPercent > 0) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_1));
        } else {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_EMPTY));
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "Bình dung nham");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "Dung nham: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        return new CustomItemStack(
            skull,
            meta
        );
    }

    @Nonnull
    public static CustomItemStack menuMetalInfo(int fillPercent, int fillAmt, int fillMax, @Nullable Map<String, Integer> map) {
        ItemStack skull;
        if (fillPercent >= 95) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_5));
        } else if (fillPercent >= 75) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_4));
        } else if (fillPercent >= 50) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_3));
        } else if (fillPercent >= 25) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_2));
        } else if (fillPercent > 0) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_1));
        } else {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_EMPTY));
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "Bình kim loại");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "Dung tích kim loại: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        meta.add("");
        if (map != null) {
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                String name =
                    TinkerMaterialManager.getById(e.getKey()).getColor() +
                        LangUtils.getMaterialName(e.getKey());
                String amount = e.getValue().toString();
                meta.add(ThemeUtils.CLICK_INFO + name + ": " + ChatColor.WHITE + amount + " Đơn vị");
            }
        }
        meta.add("");
        meta.add(ThemeUtils.PASSIVE + "Việc đúc sẽ bắt đầu từ kim loại ở " + ChatColor.BOLD + "lớp trên cùng" + ThemeUtils.PASSIVE + "");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "Nhấn để " + ChatColor.WHITE + "di chuyển kim loại ở lớp trên cùng xuống lớp dưới cùng");
        return new CustomItemStack(
            skull,
            meta
        );
    }
}
