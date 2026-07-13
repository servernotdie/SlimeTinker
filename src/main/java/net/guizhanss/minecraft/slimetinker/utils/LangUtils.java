package net.guizhanss.minecraft.slimetinker.utils;

import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;

public final class LangUtils {

    private LangUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getMaterialName(String type) {
        String result = IdMap.getMap().get(type.toUpperCase());
        return result != null ? result : ThemeUtils.toTitleCase(type);
    }

    public static String getToolName(String type){
        switch (type.toUpperCase()) {
            case Ids.PICKAXE:
                return "Cúp";
            case Ids.SHOVEL:
                return "Xẻng";
            case Ids.AXE:
                return "Rìu";
            case Ids.SWORD:
                return "Kiếm";
            case Ids.HOE:
                return "Cuốc";
            default:
                return ThemeUtils.toTitleCase(type);
        }
    }

    public static String getToolHead(String type){
        switch (type.toUpperCase()) {
            case Ids.PICKAXE:
                return "Đầu cúp";
            case Ids.SHOVEL:
                return "Đầu xẻng";
            case Ids.AXE:
                return "Lưỡi rìu";
            case Ids.SWORD:
                return "Lưỡi kiếm";
            case Ids.HOE:
                return "Đầu cuốc";
            default:
                return ThemeUtils.toTitleCase(type);
        }
    }

    public static String getArmorPart(String part) {
        switch (part.toUpperCase()) {
            case Ids.HELMET:
                return "Mũ giáp";
            case Ids.CHESTPLATE:
                return "Áo giáp ngực";
            case Ids.LEGGINGS:
                return "Quần giáp";
            case Ids.BOOTS:
                return "Giày giáp";
            default:
                return ThemeUtils.toTitleCase(part);
        }
    }

    public static String getToolOrArmorName(String type){
        String toolName = getToolName(type);
        return toolName.equals(ThemeUtils.toTitleCase(type)) ? getArmorPart(type) : toolName;
    }
}
