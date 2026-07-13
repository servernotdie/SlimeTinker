package net.guizhanss.minecraft.slimetinker.utils;

import io.github.sefiraat.slimetinker.utils.Ids;

import java.util.HashMap;
import java.util.Map;

/**
 * Chứa hầu hết bản dịch của {@link Ids}
 */
public class IdMap {

    private IdMap() {
        throw new IllegalStateException("Utility class");
    }

    private static final Map<String, String> idMap = new HashMap<>();

    static {
        // Vanilla + Core Sf
        idMap.put(Ids.IRON, "Sắt");
        idMap.put(Ids.GOLD, "Vàng");
        idMap.put(Ids.COPPER, "Đồng");
        idMap.put(Ids.SILVER, "Bạc");
        idMap.put(Ids.TIN, "Thiếc");
        idMap.put(Ids.MAGNESIUM, "Magiê");
        idMap.put(Ids.ALUMINUM, "Nhôm");
        idMap.put(Ids.LEAD, "Chì");
        idMap.put(Ids.ZINC, "Kẽm");
        idMap.put(Ids.COAL, "Than");
        idMap.put(Ids.STEEL, "Thép");
        idMap.put(Ids.DAMASCUS_STEEL, "Thép Damascus");
        idMap.put(Ids.DURALUMIN, "Duralumin");
        idMap.put(Ids.BRONZE, "Đồng thau");
        idMap.put(Ids.ALUMINUM_BRONZE, "Đồng nhôm");
        idMap.put(Ids.HARDENED_METAL, "Kim loại cứng");
        idMap.put(Ids.CORINTHIAN_BRONZE, "Đồng Corinthian");
        idMap.put(Ids.SOLDER, "Chất hàn");
        idMap.put(Ids.BILLON, "Bạc đồng");
        idMap.put(Ids.BRASS, "Đồng thau");
        idMap.put(Ids.ALUMINUM_BRASS, "Đồng nhôm");
        idMap.put(Ids.NICKEL, "Niken");
        idMap.put(Ids.COBALT, "Coban");
        idMap.put(Ids.REINFORCED_ALLOY, "Hợp kim gia cố");
        idMap.put(Ids.STRING, "Sợi chỉ");
        idMap.put(Ids.VINE, "Dây leo");
        idMap.put(Ids.CRIMSON_ROOTS, "Rễ nấm đỏ");
        idMap.put(Ids.WARPED_ROOTS, "Rễ nấm kỳ dị");
        idMap.put(Ids.WEEPING_VINES, "Dây leo rủ");
        idMap.put(Ids.TWISTING_VINES, "Dây leo xoắn");
        idMap.put(Ids.SLIME, "Slime");
        idMap.put(Ids.LEATHER, "Da");
        idMap.put(Ids.DIAMOND, "Kim cương");
        idMap.put(Ids.REDSTONE, "Đá đỏ");
        idMap.put(Ids.REDSTONE_ALLOY, "Hợp kim đá đỏ");
        idMap.put(Ids.SILICON, "Silic");
        idMap.put(Ids.FERROSILICON, "Ferrosilicon");
        idMap.put(Ids.BOOMERITE, "Hợp kim Boomer");
        idMap.put(Ids.SEFIRITE, "Hợp kim Sefi");
        idMap.put(Ids.LIQUID_CHRISTMAS, "Quà Giáng sinh");
        idMap.put(Ids.CRINGLEIUM, "Hợp kim Giáng sinh");
        idMap.put(Ids.FLOWING_FONDNESS, "Yêu thích");
        idMap.put(Ids.DETAILED_DEVOTION, "Yêu sâu đậm");
        idMap.put(Ids.PURIFIED_PASSION, "Đam mê");
        idMap.put(Ids.LIQUID_LOVE, "Tình yêu");
        idMap.put(Ids.NICEINIUM, "Tốt bụng");
        idMap.put(Ids.DRACONIC, "Hơi thở Rồng");
        idMap.put(Ids.REINFORCED_DRACONIUM, "Rồng gia cố");

        // Mods
        idMap.put("QUARTZ", "Thạch anh");
        idMap.put("LAPIS_LAZULI", "Ngọc lưu ly");
        idMap.put("MOD_PLATE", "Tấm hợp kim gia cố");
        idMap.put("EMERALD", "Ngọc lục bảo");

        // Infinity Expansion (SlimefunGuguProject)
        idMap.put(Ids.VOID, "Hư không");
        idMap.put(Ids.INFINITY, "Vô cực");
        idMap.put(Ids.FORTUNE_SINGULARITY, "Điểm kỳ dị Gia tài");
        idMap.put(Ids.MAGIC_SINGULARITY, "Điểm kỳ dị Phép thuật");
        idMap.put(Ids.EARTH_SINGULARITY, "Điểm kỳ dị Trái Đất");
        idMap.put(Ids.METAL_SINGULARITY, "Điểm kỳ dị Kim loại");
        idMap.put(Ids.MAGSTEEL, "Thép từ");
        idMap.put(Ids.TITANIUM, "Titan");
        idMap.put(Ids.MYTHRIL, "Mythril");
        idMap.put(Ids.ADAMANTITE, "Adamantite");
        idMap.put(Ids.MAGNONIUM, "Magnonium");
        idMap.put(Ids.COPPER_SINGULARITY, "Điểm kỳ dị Đồng");
        idMap.put(Ids.ZINC_SINGULARITY, "Điểm kỳ dị Kẽm");
        idMap.put(Ids.TIN_SINGULARITY, "Điểm kỳ dị Thiếc");
        idMap.put(Ids.ALUMINUM_SINGULARITY, "Điểm kỳ dị Nhôm");
        idMap.put(Ids.SILVER_SINGULARITY, "Điểm kỳ dị Bạc");
        idMap.put(Ids.MAGNESIUM_SINGULARITY, "Điểm kỳ dị Magiê");
        idMap.put(Ids.LEAD_SINGULARITY, "Điểm kỳ dị Chì");
        idMap.put(Ids.GOLD_SINGULARITY, "Điểm kỳ dị Vàng");
        idMap.put(Ids.IRON_SINGULARITY, "Điểm kỳ dị Sắt");
        idMap.put(Ids.DIAMOND_SINGULARITY, "Điểm kỳ dị Kim cương");
        idMap.put(Ids.INFINITY_SINGULARITY, "Điểm kỳ dị Vô cực");

        // Slimefun Warfare
        idMap.put(Ids.SLIMESTEEL, "Thép mềm");
        idMap.put(Ids.REINFORCED_SLIMESTEEL, "Thép mềm gia cố");
        idMap.put(Ids.OSMIUM_SUPERALLOY, "Siêu hợp kim Osmium");
        idMap.put(Ids.OSMIUM, "Osmium");
        idMap.put(Ids.SEGGANESSON, "Segganesson");
        idMap.put(Ids.UNPATENTABLIUM, "Unpatentablium");

        // DynaTech
        idMap.put(Ids.STAINLESS_STEEL, "Thép không gỉ");
        idMap.put(Ids.VEX_GEM, "Ngọc Vex");
        idMap.put(Ids.STARDUST, "Bụi sao");
        idMap.put(Ids.GHOSTLY_ESSENCE, "Tinh hoa ma quái");
        idMap.put(Ids.TESSERACT, "Vật liệu quang học");

        // LiteXpansion
        idMap.put(Ids.RUBBER, "Cao su");
        idMap.put(Ids.REFINED_IRON, "Sắt tinh luyện");
        idMap.put(Ids.MIXED_METAL, "Hợp kim");
        idMap.put(Ids.ADVANCED_ALLOY, "Hợp kim cao cấp");
        idMap.put(Ids.THORIUM, "Thorium");
        idMap.put(Ids.MAG_THOR, "Hợp kim Mag-Thor");
        idMap.put(Ids.CARBON_MESH, "Lưới carbon thô");
        idMap.put(Ids.SCRAP, "Phế liệu");
        idMap.put(Ids.IRIDIUM, "Iridium");

        // TranscEndence
        idMap.put(Ids.DAXI_STRENGTH, "Lõi siêu năng lực (S)");
        idMap.put(Ids.DAXI_ABSORPTION, "Lõi siêu năng lực (A)");
        idMap.put(Ids.DAXI_FORTITUDE, "Lõi siêu năng lực (F)");
        idMap.put(Ids.DAXI_SATURATION, "Lõi siêu năng lực (H)");
        idMap.put(Ids.DAXI_REGENERATION, "Lõi siêu năng lực (R)");

        // Networks
        idMap.put(Ids.MOLTEN_PRESENCE, "Sự tồn tại xuyên chiều không gian");
        idMap.put(Ids.REMOTININIUM, "Truy cập từ xa cổ đại");
        idMap.put(Ids.ULTIMANINIUM, "Truy cập từ xa tối thượng");
    }

    public static Map<String, String> getMap() {
        return idMap;
    }
}
