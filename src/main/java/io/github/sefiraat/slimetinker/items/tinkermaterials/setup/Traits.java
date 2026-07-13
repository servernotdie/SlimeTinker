package io.github.sefiraat.slimetinker.items.tinkermaterials.setup;

import io.github.sefiraat.slimetinker.events.BlockBreakEvents;
import io.github.sefiraat.slimetinker.events.DurabilityEvents;
import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.InteractionEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.events.friend.TraitEventType;
import io.github.sefiraat.slimetinker.items.tinkermaterials.elements.MaterialTrait;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;


public final class Traits {

    private Traits() {
        throw new UnsupportedOperationException("Utility Class");
    }

    // region Core

    public static final MaterialTrait CORE_IRON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ổn định")
        .setLore(
            "Không có đặc tính!"
        );

    public static final MaterialTrait CORE_IRON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sắc bén 1")
        .setLore(
            "Nhận hiệu ứng Sức Mạnh (có thể cộng dồn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodIron);

    public static final MaterialTrait CORE_IRON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Kiên cố")
        .setLore(
            "33% tỷ lệ miễn nhiễm sát thương nổ"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateIron);

    public static final MaterialTrait CORE_IRON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ăn mòn")
        .setLore(
            "-10% sát thương đầu ra",
            "+10% nhận kinh nghiệm người chơi"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksIron);

    public static final MaterialTrait CORE_GOLD_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mạng che vàng")
        .setLore(
            "Nhận hiệu ứng T trị",
            "",
            "Khi áp dụng lên vũ khí: ",
            "-100% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headGold)
        .addConsumer(TraitEventType.TICK, TickEvents::headGold);

    public static final MaterialTrait CORE_GOLD_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Lấp lánh")
        .setLore(
            "Nhận hiệu ứng Phát sáng"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodGold);

    public static final MaterialTrait CORE_GOLD_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Thịnh vượng")
        .setLore(
            "Khi bị sát thương",
            "1% tỷ lệ rơi 1 hạt vàng"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateGold);

    public static final MaterialTrait CORE_GOLD_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Đổi chác")
        .setLore(
            "Piglin sẽ bị bạn thu hút",
            "(Piglin trong phạm vi 5 ô sẽ không tấn công bạn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksGold);

    public static final MaterialTrait CORE_COPPER_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Việc trí óc")
        .setLore(
            "+100% nhận kinh nghiệm công cụ",
            "-50% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCopper);

    public static final MaterialTrait CORE_COPPER_ROD = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Truyền kinh nghiệm")
        .setLore(
            "Tất cả kinh nghiệm công cụ chuyển thành kinh nghiệm người chơi"
        );

    public static final MaterialTrait CORE_COPPER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tân thủ")
        .setLore(
            "+20% nhận kinh nghiệm giáp",
            "+25% sát thương phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateCopper)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateCopper);

    public static final MaterialTrait CORE_COPPER_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mờ nhạt")
        .setLore(
            "-20% sát thương đầu ra",
            "+20% nhận kinh nghiệm giáp"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksCopper);

    public static final MaterialTrait CORE_LEAD_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Độc tố")
        .setLore(
            "25% tỷ lệ gây hiệu ứng Độc khi trúng"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headLead);

    public static final MaterialTrait CORE_LEAD_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Đỉa")
        .setLore(
            "Nhận thêm máu, nhưng tiêu hao năng lượng",
            "(Nhận hiệu ứng Đói, Nâng cao Sinh lực III)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodLead);

    public static final MaterialTrait CORE_LEAD_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ốm rồi")
        .setLore(
            "Giáp chì không phải ý hay"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateLead);

    public static final MaterialTrait CORE_LEAD_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ốm rồi")
        .setLore(
            "Giáp chì không phải ý hay"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksLead);

    public static final MaterialTrait CORE_SILVER_HEAD = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Phù phép")
        .setLore(
            "-50% nhận kinh nghiệm công cụ",
            "",
            "Khi công cụ lên cấp, nhận phù phép ngẫu nhiên",
            "Phù phép có thể không phù hợp với công cụ này"
        );

    public static final MaterialTrait CORE_SILVER_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nhẹ nhàng")
        .setLore(
            "Bạn cảm thấy nhẹ nhõm hơn nhiều",
            "(Nhận hiệu ứng Rơi chậm III)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSilver);

    public static final MaterialTrait CORE_SILVER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Dẫn điện")
        .setLore(
            "Miễn nhiễm sát thương sét",
            "Khi bị sét đánh, triệu hồi sét xung quanh"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSilver);

    public static final MaterialTrait CORE_SILVER_LINKS = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Phù phép")
        .setLore(
            "Khi giáp lên cấp, nhận phù phép ngẫu nhiên",
            "Phù phép có thể không phù hợp với loại giáp này"
        );

    public static final MaterialTrait CORE_ALUMINUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tái sinh")
        .setLore(
            "25% tỷ lệ hồi phục độ bền khi sử dụng"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headAluminum);

    public static final MaterialTrait CORE_ALUMINUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Dẻo dai")
        .setLore(
            "+100% tiêu hao độ bền",
            "+50% kinh nghiệm công cụ"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAluminum)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodAluminum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodAluminum);

    public static final MaterialTrait CORE_ALUMINUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Chạy nhanh")
        .setLore(
            "+50% sát thương phải chịu",
            "Nhận hiệu ứng Tốc độ"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAluminum)
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluminum);

    public static final MaterialTrait CORE_ALUMINUM_LINKS = new MaterialTrait()
        // Special case - in RepairBench.java. Will have to stay there
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sửa nhanh")
        .setLore(
            "Chỉ cần 1 dụng cụ sửa chữa là sửa hoàn toàn"
        );

    public static final MaterialTrait CORE_TIN_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("May mắn")
        .setLore(
            "-50% sát thương đầu ra",
            "Nhận hiệu ứng May mắn"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headTin)
        .addConsumer(TraitEventType.TICK, TickEvents::headTin);

    public static final MaterialTrait CORE_TIN_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Đồ hộp")
        .setLore(
            "Bạn không còn đói",
            "(Nhận hiệu ứng No)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodTin);

    public static final MaterialTrait CORE_TIN_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Kháng độc")
        .setLore(
            "Miễn nhiễm hiệu ứng Độc"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateTin);

    public static final MaterialTrait CORE_TIN_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Chịu đòn")
        .setLore(
            "Khi bị sát thương, nhận hiệu ứng Hấp thụ"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksTin);

    public static final MaterialTrait CORE_ZINC_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ân huệ cá heo")
        .setLore(
            "Kích hoạt sức mạnh cá heo!",
            "(Nhận hiệu ứng Ân huệ cá heo)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headZinc);

    public static final MaterialTrait CORE_ZINC_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Bay bổng")
        .setLore(
            "Khi không ngồi, làm bạn nhẹ hơn không khí",
            "(Nhận hiệu ứng Bay bổng II)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodZinc);

    public static final MaterialTrait CORE_ZINC_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Đột kích")
        .setLore(
            "Khi mục tiêu nhìn chỗ khác,",
            "+100% sát thương gây ra cho chúng"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateZinc);

    public static final MaterialTrait CORE_ZINC_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Châm cứu")
        .setLore(
            "Miễn nhiễm sát thương từ xương rồng"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksZinc);

    public static final MaterialTrait CORE_MAGNESIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Thiêu đốt")
        .setLore(
            "Có (cấp công cụ x 5)% tỷ lệ",
            "khiến kẻ địch bốc cháy"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nam châm")
        .setLore(
            "Nhặt ngẫu nhiên vật phẩm trong phạm vi 5 ô"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Chuồn nhanh")
        .setLore(
            "-25% sát thương đầu ra",
            "Nhận hiệu ứng Tốc độ"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateMagnesium)
        .addConsumer(TraitEventType.TICK, TickEvents::plateMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Magie™ nhìn đêm")
        .setLore(
            "Nhận hiệu ứng Nhìn đêm"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksMagnesium);

    public static final MaterialTrait CORE_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Inox")
        .setLore(
            "Có thể ngăn máu",
            "(Chỉ hiệu ứng hình ảnh)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSteel);

    public static final MaterialTrait CORE_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nhẹ")
        .setLore(
            "+50% kinh nghiệm công cụ",
            "Nhận hiệu ứng Tốc độ"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSteel);

    public static final MaterialTrait CORE_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Cứng rắn")
        .setLore(
            "-25% sát thương nổ phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSteel);

    public static final MaterialTrait CORE_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mạnh mẽ")
        .setLore(
            "Nhận hiệu ứng Nâng cao sinh lực"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ma cà rồng")
        .setLore(
            "33% tỷ lệ hồi 1 máu khi gây sát thương",
            "-50% sát thương (ban ngày)",
            "+50% sát thương (ban đêm)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDamsteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Kẻ đêm")
        .setLore(
            "Nhận hiệu ứng Nhìn đêm"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodDamsteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tái sử dụng")
        .setLore(
            "Nhận hiệu ứng Nâng cao sinh lực",
            "Cấp độ phụ thuộc vào số lượng giáp có đặc tính Tái sử dụng",
            "1 cái ⇒ Cấp 1",
            "2 cái ⇒ Cấp 3",
            "3 cái ⇒ Cấp 6",
            "4 cái ⇒ Cấp 10"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDamSteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Gai")
        .setLore(
            "Miễn nhiễm và phản xạ sát thương Gai"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksDamSteel);

    public static final MaterialTrait CORE_DURALUMIN_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Bền bỉ")
        .setLore(
            "Công cụ hỏng vẫn dùng được, nhưng:",
            "-50% sát thương đầu ra",
            "Nhận hiệu ứng Mỏi đào",
            "Không thể nhận kinh nghiệm công cụ"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDuralium)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headDuralium)
        .addConsumer(TraitEventType.TICK, TickEvents::headDuralium);

    public static final MaterialTrait CORE_DURALUMIN_ROD = new MaterialTrait()
        // Special case - in RepairBench.java. Will have to stay there
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sửa hoàn toàn")
        .setLore(
            "Chỉ cần 1 ô sửa chữa là sửa hoàn toàn"
        );

    public static final MaterialTrait CORE_DURALUMIN_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Bền bỉ")
        .setLore(
            "Giáp hỏng vẫn dùng được, nhưng:",
            "+20% sát thương phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateDuralium);

    public static final MaterialTrait CORE_DURALUMIN_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Giảm xóc")
        .setLore(
            "10% tỷ lệ miễn nhiễm sát thương",
            "Nhiều đặc tính sẽ không tăng tỷ lệ này"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksDuralium);

    public static final MaterialTrait CORE_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Chống cháy")
        .setLore(
            "Nhận hiệu ứng Chống cháy"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headBronze);

    public static final MaterialTrait CORE_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sai sai")
        .setLore(
            "Chắc chắn là công cụ này có vấn đề..."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBronze);

    public static final MaterialTrait CORE_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nông dân")
        .setLore(
            "Tăng 1 vật phẩm rơi khi thu hoạch cây trồng",
            "Hiệu ứng này không bị ảnh hưởng bởi May mắn",
            "Hiệu ứng này không cộng dồn, nhưng có thể bị ảnh hưởng bởi đặc tính khác"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::plateBronze);

    public static final MaterialTrait CORE_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mỏng manh")
        .setLore(
            "+100% tiêu hao độ bền"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::linksBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sắc bén 2")
        .setLore(
            "Nhận hiệu ứng Sức mạnh (có thể cộng dồn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headAlubronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mỏng manh")
        .setLore(
            "+100% tiêu hao độ bền"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAluBronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hoa tươi")
        .setLore(
            "Có tỷ lệ khiến cỏ xung quanh nở hoa khi đi"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluBronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Bắn tung!")
        .setLore(
            "Khi bị sát thương khi máu dưới một nửa",
            "Sẽ bắn tung lên!",
            "(Nhận hiệu ứng Bay bổng III)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBronze);

    public static final MaterialTrait CORE_HARDENED_METAL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Đẩy lùi")
        .setLore(
            "Đẩy lùi bất kỳ sinh vật nào trúng",
            "Có tỷ lệ giam cầm mục tiêu"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headHard);

    public static final MaterialTrait CORE_HARDENED_METAL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Búa")
        .setLore(
            "Có thể đào khu vực 3x3x3"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_HARDENED_METAL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Kiên nhẫn")
        .setLore(
            "Không tiêu hao độ bền"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::plateHardened);

    public static final MaterialTrait CORE_HARDENED_METAL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Yêu tinh")
        .setLore(
            "Có tỷ lệ tìm thấy vật phẩm thêm khi đào",
            "Tỷ lệ này có thể cộng dồn"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksHardened);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nóng bỏng")
        .setLore(
            "Có thể nấu chảy vật rơi",
            "",
            "Có lẽ đây là cúp lò?"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCorbronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nóng hổi")
        .setLore(
            "&kNóng hổi"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodCorbronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Cao nhiệt")
        .setLore(
            "Có tỷ lệ khiến thực thể xung quanh bốc cháy"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCorBronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Máu nóng")
        .setLore(
            "Ở địa ngục nhận hiệu ứng Tốc độ II",
            "Ở end nhận hiệu ứng Chậm"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCorBronze);

    public static final MaterialTrait CORE_SOLDER_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tàng hình")
        .setLore(
            "Nhận hiệu ứng Tàng hình",
            "Nhưng sẽ hỏng ngay khi sử dụng"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSolder)
        .addConsumer(TraitEventType.TICK, TickEvents::headSolder);

    public static final MaterialTrait CORE_SOLDER_ROD = new MaterialTrait()
        // Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ràng buộc")
        .setLore(
            "Công cụ không thể vứt bỏ",
            "cũng không rơi khi chết"
        );

    public static final MaterialTrait CORE_SOLDER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hạ cánh mềm")
        .setLore(
            "Miễn nhiễm sát thương va chạm của cánh"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSolder);

    public static final MaterialTrait CORE_SOLDER_LINKS = new MaterialTrait()
        // Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ràng buộc")
        .setLore(
            "Giáp không thể vứt bỏ",
            "cũng không rơi khi chết"
        );

    public static final MaterialTrait CORE_BILLON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Đào nhanh")
        .setLore(
            "Nhận hiệu ứng Gấp gáp",
            "(Có thể cộng dồn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headBillon);

    public static final MaterialTrait CORE_BILLON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Lò xo")
        .setLore(
            "Giúp bạn nhảy cao hơn",
            "(Nhận hiệu ứng Nhảy cao IV)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBillon);

    public static final MaterialTrait CORE_BILLON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Thiên thần giáng thế")
        .setLore(
            "Đòn tấn công của bạn sẽ chữa lành mục tiêu",
            "thay vì gây sát thương"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateBillon);

    public static final MaterialTrait CORE_BILLON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Dẫn nhiệt")
        .setLore(
            "Miễn nhiễm sát thương từ khối magma"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksBillon);

    public static final MaterialTrait CORE_BRASS_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Xui xẻo")
        .setLore(
            "+50% sát thương đầu ra",
            "Nhận hiệu ứng Xui xẻo III"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headBrass)
        .addConsumer(TraitEventType.TICK, TickEvents::headBrass);

    public static final MaterialTrait CORE_BRASS_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Oxy")
        .setLore(
            "Nhận hiệu ứng Thở dưới nước"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBrass);

    public static final MaterialTrait CORE_BRASS_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Vòng ràng buộc")
        .setLore(
            "+200% tiêu hao độ bền",
            "Sát thương phải chịu dựa theo độ bền:",
            "Độ bền trên một nửa giảm sát thương phải chịu, tối đa giảm 25% khi đầy độ bền",
            "Độ bền dưới một nửa tăng sát thương phải chịu, tối đa tăng 25% khi 1 độ bền"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateBrass)
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::plateBrass);

    public static final MaterialTrait CORE_BRASS_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Chạy! Mau!")
        .setLore(
            "+100% tiêu hao độ bền",
            "Khi bị sát thương khi máu dưới một nửa",
            "Nhận hiệu ứng Tốc độ III"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Abra")
        .setLore(
            "33% tỷ lệ khi trúng sinh vật",
            "dịch chuyển mục tiêu ngẫu nhiên"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hiếu học")
        .setLore(
            "+50% kinh nghiệm công cụ",
            "+50% kinh nghiệm người chơi",
            "-50% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodAlubrass)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Phù thủy")
        .setLore(
            "-50% sát thương phép phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Thoát thân")
        .setLore(
            "Khi bị sát thương, dịch chuyển ngẫu nhiên gần đó",
            "(CD: 10 giây)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBrass);

    public static final MaterialTrait CORE_NICKEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tích điện(Âm-)")
        .setLore(
            "20% tỷ lệ",
            "+200% sát thương đầu ra",
            "và giam cầm mục tiêu",
            "(Cần tồn tại cùng với Dương+ mới có hiệu lực)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_NICKEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tích điện(Âm-)")
        .setLore(
            "20% tỷ lệ",
            "+200% sát thương đầu ra",
            "và giam cầm mục tiêu",
            "(Cần tồn tại cùng với Dương+ mới có hiệu lực)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_NICKEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nam châm(Âm-)")
        .setLore(
            "Âm của nam châm",
            "Nam châm có thể tự hút vật rơi xung quanh",
            "Phạm vi = (số DC + số NC) - (chênh lệch DC và NC)",
            "(Càng nhiều và càng đồng đều DC & NC, phạm vi càng lớn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateNickel);

    public static final MaterialTrait CORE_NICKEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nam châm(Âm-)")
        .setLore(
            "Âm của nam châm",
            "Nam châm có thể tự hút vật rơi xung quanh",
            "Phạm vi = (số DC + số NC) - (chênh lệch DC và NC)",
            "(Càng nhiều và càng đồng đều DC & NC, phạm vi càng lớn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksNickel);

    public static final MaterialTrait CORE_COBALT_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tích điện(Dương+)")
        .setLore(
            "20% tỷ lệ",
            "+200% sát thương đầu ra",
            "và giam cầm mục tiêu",
            "(Cần tồn tại cùng với Âm- mới có hiệu lực)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_COBALT_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tích điện(Dương+)")
        .setLore(
            "20% tỷ lệ",
            "+200% sát thương đầu ra",
            "và giam cầm mục tiêu",
            "(Cần tồn tại cùng với Âm- mới có hiệu lực)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_COBALT_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nam châm(Dương+)")
        .setLore(
            "Dương của nam châm",
            "Nam châm có thể tự hút vật rơi xung quanh",
            "Phạm vi = (số DC + số NC) - (chênh lệch DC và NC)",
            "(Càng nhiều và càng đồng đều DC & NC, phạm vi càng lớn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCobalt);

    public static final MaterialTrait CORE_COBALT_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nam châm(Dương+)")
        .setLore(
            "Dương của nam châm",
            "Nam châm có thể tự hút vật rơi xung quanh",
            "Phạm vi = (số DC + số NC) - (chênh lệch DC và NC)",
            "(Càng nhiều và càng đồng đều DC & NC, phạm vi càng lớn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCobalt);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Búa")
        .setLore(
            "Có thể đào khu vực 3x3x3"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_ROD = new MaterialTrait()
        // Special Case - nested within plate mod. Will be moved when mods are changed to consumers
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nhân đôi gia cường")
        .setLore(
            "Module hợp kim gia cường có hiệu ứng nhân đôi",
            "(Chỉ cần 5 cái là không tiêu hao độ bền)"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_PLATES = new MaterialTrait()
        // Special Case - nested within plate mod. Will be moved when mods are changed to consumers
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nhân đôi gia cường")
        .setLore(
            "Module hợp kim gia cường có hiệu ứng nhân đôi",
            "(Chỉ cần 5 cái là không tiêu hao độ bền)"
        );

    public static final MaterialTrait CORE_REINFORCED_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Chống Wither")
        .setLore(
            "Miễn nhiễm hiệu ứng Wither"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksReinforced);

    public static final MaterialTrait CORE_STRING_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Cũng tạm được")
        .setLore(
            "Không có hiệu ứng gì",
            "Xài tạm được rồi"
        );

    public static final MaterialTrait CORE_STRING_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Cũng tạm được")
        .setLore(
            "Không có hiệu ứng gì",
            "Xài tạm được rồi"
        );

    public static final MaterialTrait CORE_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Phát triển")
        .setLore(
            "Sửa chữa công cụ chậm vào ban ngày"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderVine);

    public static final MaterialTrait CORE_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Phát triển")
        .setLore(
            "Sửa chữa công cụ chậm vào ban ngày"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonVine);


    public static final MaterialTrait CORE_CRIMSON_ROOT_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mục nát")
        .setLore(
            "Sửa chữa công cụ chậm vào ban đêm"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderCrimsonRoot);

    public static final MaterialTrait CORE_CRIMSON_ROOT_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mục nát")
        .setLore(
            "Sửa chữa công cụ chậm vào ban đêm"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonCrimsonRoots);

    public static final MaterialTrait CORE_WARPED_ROOT_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hồi phục")
        .setLore(
            "Chữa lành chậm cho người chơi"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::bindWarpedRoot);

    public static final MaterialTrait CORE_WARPED_ROOT_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hồi phục")
        .setLore(
            "Chữa lành chậm cho người chơi"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonWarpedRoots);

    public static final MaterialTrait CORE_WEEPING_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Điềm gở")
        .setLore(
            "Tôi cảm thấy rất tệ...",
            "(Nhận hiệu ứng Điềm gở)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderWeepingVine);

    public static final MaterialTrait CORE_WEEPING_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Điềm gở")
        .setLore(
            "Tôi cảm thấy rất tệ...",
            "(Nhận hiệu ứng Điềm gở)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonWeepingVines);

    public static final MaterialTrait CORE_TWISTING_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hấp dẫn")
        .setLore(
            "Tự hút vật rơi trong phạm vi 5 ô"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderTwistingVine);

    public static final MaterialTrait CORE_TWISTING_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hấp dẫn")
        .setLore(
            "Tự hút vật rơi trong phạm vi 5 ô"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonTwistingWines);

    public static final MaterialTrait CORE_SLIME_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Đàn hồi")
        .setLore(
            "-50% sát thương rơi"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindSlime);

    public static final MaterialTrait CORE_SLIME_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Đàn hồi")
        .setLore(
            "-25% sát thương rơi"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::gambesonSlime);

    public static final MaterialTrait CORE_SILICON_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Học chậm")
        .setLore(
            "Khi phá khối",
            "+(5 * cấp công cụ)% kinh nghiệm công cụ"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::bindSilicon);

    public static final MaterialTrait CORE_SILICON_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Học chậm")
        .setLore(
            "+(5 * cấp giáp)% kinh nghiệm giáp"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::gambesonSilicon);

    public static final MaterialTrait CORE_LEATHER_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Da dày")
        .setLore(
            "+50% kinh nghiệm công cụ"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::binderLeather)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::binderLeather);

    public static final MaterialTrait CORE_LEATHER_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Da dày")
        .setLore(
            "+10% kinh nghiệm giáp"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::gambesonLeather);

    public static final MaterialTrait CORE_FERROSILICON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hydro")
        .setLore(
            "Khi bị sát thương",
            "nhận hiệu ứng Bay bổng"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headFerrosilicon);

    public static final MaterialTrait CORE_FERROSILICON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Năng lượng mặt trời")
        .setLore(
            "Hồi phục độ bền liên tục vào ban ngày"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateFerrosilicon);

    public static final MaterialTrait CORE_FERROSILICON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ma đồng")
        .setLore(
            "Nhận 1 lớp hiệu ứng Ma đồng",
            "Khi có 4 lớp Ma đồng trở lên",
            "Đẩy lùi tất cả sinh vật trong phạm vi 5 ô",
            "(Trừ Wither và Ender Dragon)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Dùi cui điện")
        .setLore(
            "Có tỷ lệ triệu hồi sét khi trúng sinh vật"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodRedstoneAlloy);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nạp năng lượng")
        .setLore(
            "Nạp năng lượng ngẫu nhiên khối trong phạm vi 5x2x5",
            "(Kích hoạt tín hiệu Redstone)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateRedstoneAlloy);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Cần gì áp lực?")
        .setLore(
            "Khối dưới chân bạn được nạp năng lượng"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksRedstoneAlloy);

    public static final MaterialTrait CORE_BOOMERITE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mô phỏng thang™")
        .setLore(
            "Click chuột phải để tạo thang"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headBoomerite);

    public static final MaterialTrait CORE_BOOMERITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Go Boomer")
        .setLore(
            "Cảnh báo: Sắp phát nổ"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateBoomerite);

    public static final MaterialTrait CORE_SEFIRITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ăn mừng")
        .setLore(
            "Đến lúc ăn mừng sinh nhật Sefi rồi"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headSefirite);

    public static final MaterialTrait CORE_CRINGLEIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ăn mừng lễ hội")
        .setLore(
            "Cùng ăn mừng Giáng Sinh nào!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCringleium);

    public static final MaterialTrait CORE_LOVE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Mọi điều bạn cần")
        .setLore(
            "Bạn được yêu thương",
            "(Nhận hiệu ứng hồi máu)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksLove);

    public static final MaterialTrait CORE_NICEINIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nice")
        .setLore(
            "Nice"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headNice)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headNice);

    public static final MaterialTrait CORE_SMITHIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nghị lực")
        .setLore(
            "Có 50% tỷ lệ không tiêu hao độ bền."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSmithium);

    public static final MaterialTrait CORE_SMITHIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Cần cù")
        .setLore(
            "Shift + chuột phải để kích hoạt hiệu ứng Bùng nổ Tốc độ, kéo dài 30 giây.",
            "Trong thời gian hiệu ứng Bùng nổ Tốc độ có hiệu lực,",
            "mỗi khi phá một khối có [50 ÷ cấp Haste]% tỷ lệ",
            "tăng 1 cấp Haste, tối đa Haste 10. Hồi chiêu 5 phút."
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodSmithium)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodSmithium);

    public static final MaterialTrait CORE_SMITHIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Chịu nhiệt")
        .setLore(
            "Có 25% tỷ lệ bỏ qua sát thương lửa/lava."
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::platesSmithium);

    public static final MaterialTrait CORE_SMITHIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Kỹ thuật thợ thủ công")
        .setLore(
            "Có 25% tỷ lệ hoàn trả chi phí sửa chữa."
        );

    public static final MaterialTrait CORE_ANNIVERSARIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Slimefun 10 năm!")
        .setLore(
            "Ăn mừng Slimefun 10 năm!",
            "",
            "Cần đủ bộ giáp mới có hiệu lực."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAnniversary);

    // endregion

    // region Infinity Expansion

    public static final MaterialTrait INFINITY_VOID_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Thợ mỏ hư vô")
        .setLore(
            "Khi đào có tỷ lệ rơi quặng ngẫu nhiên"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headVoid);

    public static final MaterialTrait INFINITY_VOID_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Khiếp sợ hư vô")
        .setLore(
            "+150% sát thương đầu ra",
            "Ở The End:",
            "+250% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodVoid);

    public static final MaterialTrait INFINITY_VOID_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Hành giả hư vô")
        .setLore(
            "Hư vô không còn là kẻ thù của bạn",
            "(Khi rơi xuống hư vô tự động dịch chuyển lên vị trí cao hơn 200 khối)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateVoid);

    public static final MaterialTrait INFINITY_VOID_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Chúa tể End")
        .setLore(
            "-10% sát thương từ Ender Dragon, Enderman, Shulker"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksVoid);

    public static final MaterialTrait INFINITY_MAGSTEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Thực sự là inox")
        .setLore(
            "Giống inox, nhưng thực sự có thể chặn máu",
            "(Hiệu ứng thị giác ngầu hơn)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagSteel);

    public static final MaterialTrait INFINITY_MAGSTEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Thiêu đốt")
        .setLore(
            "Có (cấp công cụ x 5)% tỷ lệ",
            "khiến kẻ địch bốc cháy"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagnesium);

    public static final MaterialTrait INFINITY_MAGSTEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Mờ nhạt")
        .setLore(
            "-20% sát thương đầu ra",
            "+20% nhận kinh nghiệm giáp"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksCopper);

    public static final MaterialTrait INFINITY_MAGSTEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Phòng thủ")
        .setLore(
            "Khi bị sát thương, có 5% tỷ lệ",
            "miễn nhiễm sát thương và nhận hiệu ứng hấp thụ sát thương"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagSteel);

    public static final MaterialTrait INFINITY_TITANIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Nhân đôi gia cường")
        .setLore(
            "Module hợp kim gia cường có hiệu ứng nhân đôi",
            "(Chỉ cần 5 cái là không tiêu hao độ bền)"
        );

    public static final MaterialTrait INFINITY_TITANIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Bền bỉ")
        .setLore(
            "Công cụ hỏng vẫn dùng được, nhưng:",
            "-50% sát thương đầu ra",
            "Nhận hiệu ứng Mệt mỏi",
            "Không thể nhận kinh nghiệm công cụ"
        );

    public static final MaterialTrait INFINITY_TITANIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Yêu tinh")
        .setLore(
            "Khi đào có tỷ lệ tìm thấy vật phẩm thêm",
            "Tỷ lệ này có thể cộng dồn"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksHardened);

    public static final MaterialTrait INFINITY_TITANIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Chống cháy")
        .setLore(
            "Miễn nhiễm sát thương từ lửa, lava và khối magma"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksTitanium);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Ổn định II")
        .setLore(
            "Vẫn không có đặc tính"
        );

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sắc bén 1 II")
        .setLore(
            "Nhận hiệu ứng Lực II (có thể cộng dồn)",
            "(Đừng để ý cái tên tệ này)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingIron);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Kiên cố II")
        .setLore(
            "Vụ nổ sẽ chữa lành cho bạn",
            "thay vì gây sát thương"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingIron);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Ăn mòn II")
        .setLore(
            "-10% sát thương đầu ra",
            "+10% nhận kinh nghiệm người chơi"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSingIron);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Mạng che vàng II")
        .setLore(
            "Nhận hiệu ứng T trị",
            "",
            "Khi áp dụng lên vũ khí: ",
            "+50% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headSingGold)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Lấp lánh II")
        .setLore(
            "Nhận hiệu ứng phát sáng cầu vồng"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Thịnh vượng II")
        .setLore(
            "Khi bị sát thương",
            "có 1% tỷ lệ rơi 1-4 hạt vàng"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Đổi chác II")
        .setLore(
            "Piglin sẽ bị bạn thu hút sâu sắc",
            "(Piglin trong 5 khối xung quanh sẽ không tấn công bạn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingGold);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Việc trí óc II")
        .setLore(
            "+200% nhận kinh nghiệm công cụ",
            "-50% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headSingCopper);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_ROD = new MaterialTrait()
        // Special case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Truyền kinh nghiệm II")
        .setLore(
            "Tất cả kinh nghiệm công cụ chuyển thành kinh nghiệm người chơi",
            "và nhận thêm 50% thưởng"
        );

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Tân thủ II")
        .setLore(
            "+40% nhận kinh nghiệm giáp",
            "+50% sát thương phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingCopper)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingCopper);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Mờ nhạt II")
        .setLore(
            "-20% sát thương đầu ra",
            "+40% nhận kinh nghiệm giáp"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSingCopper);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Độc tố II")
        .setLore(
            "Khi trúng có 50% tỷ lệ gây hiệu ứng Trúng độc II"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Đỉa II")
        .setLore(
            "Nhận thêm máu",
            "(Nhận hiệu ứng Tăng máu II)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Ốm rồi II")
        .setLore(
            "Giáp chì thực sự không phải ý hay"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Ốm rồi II")
        .setLore(
            "Giáp chì thực sự không phải ý hay"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingLead);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_HEAD = new MaterialTrait()
        // Special Case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Phù phép II")
        .setLore(
            "-50% nhận kinh nghiệm công cụ",
            "Khi công cụ lên cấp nhận 1-3 phù phép ngẫu nhiên",
            "Phù phép có thể không phù hợp với công cụ này"
        );

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Nhẹ nhàng II")
        .setLore(
            "Bạn cảm thấy nhẹ nhõm hơn",
            "(Miễn nhiễm sát thương rơi)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodSingSilver);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Dẫn điện II")
        .setLore(
            "Khi bị sét đánh có thể được chữa lành",
            "và tạo ra bão sét xung quanh"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingSilver);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_LINKS = new MaterialTrait()
        // Special Case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Phù phép II")
        .setLore(
            "Khi giáp lên cấp nhận 1-3 phù phép ngẫu nhiên",
            "Phù phép có thể không phù hợp với giáp này"
        );

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Tái sinh II")
        .setLore(
            "Khi sử dụng có 33% tỷ lệ phục hồi độ bền"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSingAluminum);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Dẻo dai II")
        .setLore(
            "+100% tiêu hao độ bền",
            "+100% nhận kinh nghiệm công cụ"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodSingAluminum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodSingAluminum)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodSingAluminum);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Chạy nhanh II")
        .setLore(
            "+50% sát thương phải chịu",
            "Nhận hiệu ứng Tốc độ II"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingAluminium)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingAluminium);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sửa nhanh II")
        .setLore(
            "Chỉ cần 1 dụng cụ sửa chữa bất kỳ là sửa hoàn toàn"
        );

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("May mắn II")
        .setLore(
            "-50% sát thương đầu ra",
            "Nhận hiệu ứng May mắn II",
            "Nhận hiệu ứng Tốc độ II"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingTin)
        .addConsumer(TraitEventType.TICK, TickEvents::headSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Đồ hộp II")
        .setLore(
            "Đói sẽ không giảm"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Kháng độc II")
        .setLore(
            "Miễn nhiễm hiệu ứng Trúng độc, Đói, Yếu đuối",
            "Hiệu ứng Trúng độc sẽ chữa lành bạn"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Chịu đòn II")
        .setLore(
            "Khi bị sát thương, nhận hiệu ứng Hấp thụ sát thương II"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingTin);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Ân huệ cá heo II")
        .setLore(
            "Kích hoạt sức mạnh cá heo! Thêm sức mạnh!",
            "(Nhận hiệu ứng Ân huệ cá heo II)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Bay bổng II")
        .setLore(
            "Khi ngồi xuống làm bạn nhẹ hơn không khí",
            "(Nhận hiệu ứng Bay bổng II)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Đột kích II")
        .setLore(
            "Khi mục tiêu nhìn chỗ khác,",
            "+100% sát thương gây ra cho chúng",
            "(Phạm vi xác định nhìn chỗ khác rộng hơn)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Châm cứu II")
        .setLore(
            "Miễn nhiễm sát thương từ xương rồng",
            "Sát thương từ xương rồng có thể chữa lành bạn"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingZinc);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Thiêu đốt II")
        .setLore(
            "Có (cấp công cụ x 10)% tỷ lệ",
            "khiến kẻ địch cháy lâu hơn"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Nam châm II")
        .setLore(
            "Ngẫu nhiên nhặt vật phẩm trong phạm vi 10 khối"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Chuồn nhanh II")
        .setLore(
            "-50% sát thương đầu ra",
            "Nhận hiệu ứng Tốc độ II"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingMagnesium)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Magie™ nhìn đêm II")
        .setLore(
            "Nhận hiệu ứng Nhìn đêm",
            "và đánh dấu tất cả sinh vật trong 10 khối"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingMagnesium);

    public static final MaterialTrait INFINITY_MYTHRIL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Tinh linh phi nước đại")
        .setLore(
            "+50% tiêu hao độ bền",
            "Nhận hiệu ứng Haste II",
            "Nhận hiệu ứng Tốc độ"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headMythril)
        .addConsumer(TraitEventType.TICK, TickEvents::headMythril);

    public static final MaterialTrait INFINITY_MYTHRIL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Kim Gondolin")
        .setLore(
            "Đẩy lùi tất cả sinh vật địch xung quanh"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMythril);

    public static final MaterialTrait INFINITY_MYTHRIL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Ma đồng")
        .setLore(
            "Nhận 1 lớp hiệu ứng Ma đồng",
            "Khi có 4 lớp Ma đồng trở lên",
            "Đẩy lùi tất cả sinh vật địch trong phạm vi 5 ô",
            "(Trừ Wither và Ender Dragon)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait INFINITY_MYTHRIL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Tiếng gọi hoang dã")
        .setLore(
            "Khi bị sát thương",
            "có tỷ lệ triệu hồi một con sói giúp bạn"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMythril);

    public static final MaterialTrait INFINITY_ADAMANTITE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Huyền bí")
        .setLore(
            "Khi đào: ",
            "+100% nhận kinh nghiệm người chơi",
            "",
            "Khi giết sinh vật: ",
            "+50% nhận kinh nghiệm người chơi"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headAdamantite)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Cứng rắn")
        .setLore(
            "Miễn nhiễm sát thương nổ"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Trượt rồi")
        .setLore(
            "-25% sát thương từ đạn bắn"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Dày dạn")
        .setLore(
            "+10% nhận kinh nghiệm công cụ",
            "+10% nhận kinh nghiệm người chơi"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksAdamantite)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksAdamantite);

    public static final MaterialTrait INFINITY_MAGNONIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Rộng lượng")
        .setLore(
            "Bạn thực sự tuyệt vời",
            "Cảm ơn bạn"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headMagnonium);

    public static final MaterialTrait INFINITY_MAGNONIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Nóng bỏng")
        .setLore(
            "Vật rơi có thể nấu chảy"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCorbronze);

    public static final MaterialTrait INFINITY_MAGNONIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Thoát thân")
        .setLore(
            "Khi bị sát thương, dịch chuyển ngẫu nhiên gần đó",
            "(CD: 10 giây)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBrass);

    public static final MaterialTrait INFINITY_MAGNONIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Có oxy")
        .setLore(
            "Ai cần nó chứ?",
            "(Miễn nhiễm sát thương chết đuối)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagnonium);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("May mắn")
        .setLore(
            "Nhận gấp đôi vật rơi",
            "Có thể cộng dồn với module Lapis"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Mạng che thương nhân")
        .setLore(
            "T trị không tác dụng phụ",
            "(Nhận hiệu ứng T trị III)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Thật may mắn")
        .setLore(
            "Khi bị sát thương trên 1 (ban đầu)",
            "có 0.5% tỷ lệ nhận một món quà"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Hoa tươi")
        .setLore(
            "Khi đi có tỷ lệ làm cỏ xung quanh nở hoa"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluBronze);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Ảo thuật")
        .setLore(
            "Ngẫu nhiên thi triển ảo thuật lên tất cả sinh vật xung quanh, bao gồm:",
            "- Đẩy lùi",
            "- Trúng độc",
            "- Dịch chuyển ngẫu nhiên",
            "- Bốc cháy",
            "- Tốc độ"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Vạch trần bí mật")
        .setLore(
            "Đánh dấu tất cả sinh vật trong 10 khối (có lẽ không phải tất cả)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Áo phù thủy")
        .setLore(
            "Khi gây sát thương",
            "có tỷ lệ giải phóng ma thuật"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Bạc hà ma thuật")
        .setLore(
            "Miễn nhiễm sát thương rồng phun"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagic);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Chấn động đất")
        .setLore(
            "Đẩy lùi và giam cầm sinh vật trúng đòn"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Máy nghiền")
        .setLore(
            "Vật rơi khi phá khối",
            "giống như đã qua máy nghiền"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Bước trên dung nham")
        .setLore(
            "Lava dưới chân biến thành đá magma"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Quy luật tự nhiên")
        .setLore(
            "Chuột phải để cho ăn hai động vật xung quanh",
            "(CD: 2 phút)",
            "Dù cho ăn thành công hay không, hiệu ứng này vẫn vào hồi chiêu"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksEarth);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sạch sẽ gọn gàng")
        .setLore(
            "+100% sát thương đầu ra",
            "Nhận hiệu ứng Haste II"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMetal)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Dây dẫn kinh nghiệm")
        .setLore(
            "Tất cả kinh nghiệm người chơi theo tỷ lệ 10:1",
            "chuyển thành kinh nghiệm công cụ"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodMetal)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Hiệp sĩ bàn tròn")
        .setLore(
            "Khi bị sát thương có tỷ lệ",
            "sinh ra Hiệp sĩ bàn tròn xung quanh",
            "(Ừ thì, là Iron Golem)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Lựu đạn flash")
        .setLore(
            "Khi bị sát thương, có tỷ lệ",
            "phản đòn sát thương và làm choáng kẻ tấn công"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMetal);

    public static final MaterialTrait INFINITY_INFINITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Vô tận")
        .setLore(
            "Công cụ này đã đạt được sự bất tử..."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headInfinity);

    public static final MaterialTrait INFINITY_INFINITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Phòng thủ khái niệm")
        .setLore(
            "-50% sát thương phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodInfinity);

    public static final MaterialTrait INFINITY_INFINITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Giáp phản ứng vô tận")
        .setLore(
            "Mỗi lần chịu sát thương, 10% được lưu trữ",
            "Tối đa lưu trữ 10 sát thương (5 trái tim)",
            "Chuột phải để giải phóng sát thương đã lưu",
            "lên tất cả sinh vật xung quanh"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateInfinity)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::plateInfinity);

    public static final MaterialTrait INFINITY_INFINITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Rắn nuốt đuôi")
        .setLore(
            "Có 20% tỷ lệ phản đòn sát thương phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Điểm dừng")
        .setLore(
            "Không thể phá hủy",
            "+200% sát thương đầu ra",
            "+200% nhận kinh nghiệm công cụ",
            "Có thể đào khu vực 3x3x3"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSingInfinity)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingInfinity)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headSingInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sức mạnh vô tận")
        .setLore(
            "Cứ chịu 2000 sát thương (trước khi giảm trừ)",
            "có thể nhận một phù phép ngẫu nhiên mới",
            "Không giới hạn cấp"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Phòng thủ vô tận")
        .setLore(
            "Khi trang bị đủ bộ giáp có Phòng thủ vô tận",
            "tất cả sát thương phải chịu đều giảm xuống còn 1"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingInfinity);

    public static final MaterialTrait INFINITY_REINFORCED_DRACONIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setSponsoredBy("Bunkky/ReasonFoundDecoy")
        .setTraitName("Thịnh nộ của rồng")
        .setLore(
            "Khi bị Ender Dragon đánh trúng, nhận hiệu ứng Thịnh nộ của rồng,",
            "mỗi tầng tăng 10% sát thương lên Ender Dragon, kéo dài 15 giây, không giới hạn.",
            "Tầng có thể cộng dồn, 2 tầng là 20%, 3 tầng là 30%, v.v.",
            "Cộng dồn tầng sẽ đặt lại thời gian."
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headReinforcedDraconium)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headReinforcedDraconium);

    // endregion

    // region LiteXpansion

    public static final MaterialTrait LITE_RUBBER_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Cách điện")
        .setLore(
            "Miễn nhiễm sát thương sét"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindRubber);

    public static final MaterialTrait LITE_RUBBER_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Đẫm mồ hôi")
        .setLore(
            "Áo giáp mềm cao su thực sự quá nóng!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonRubber);

    public static final MaterialTrait LITE_REFINED_IRON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Thực sự ổn định")
        .setLore(
            "Thực sự không có đặc tính",
            "Nhưng có thể sau khi nâng cấp sẽ có?",
            "",
            "Sau khi cấp công cụ đạt 10:",
            "+(Cấp công cụ * 10)% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Vô lễ bất lập")
        .setLore(
            "Nhận hiệu ứng Tốc độ",
            "+50% sát thương đầu ra",
            "Quá trình chiến đấu của bạn sẽ trở nên ngầu"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodRefinedIron)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodRefinedIron)
        .addConsumer(TraitEventType.TICK, TickEvents::rodRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Đặc vụ số một")
        .setLore(
            "Cần thỏa mãn tất cả điều kiện sau mới có hiệu lực:",
            "- Trang bị đủ bộ giáp có đặc tính Đặc vụ số một",
            "- Thông thạo lễ nghi (Vô lễ bất lập)",
            "",
            "Chuột phải để triệu hồi trận hủy diệt",
            "Gây sát thương lên tất cả sinh vật trong trận",
            "(CD: 20 phút)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::plateRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Không thấy tôi")
        .setLore(
            "Kẻ tấn công nhận hiệu ứng Mù"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksRefinedIron);

    public static final MaterialTrait LITE_MIXED_METAL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Hợp kim")
        .setLore(
            "Ngẫu nhiên nhận đặc tính của nguyên liệu chế tạo",
            "Nhưng hiệu quả giảm một nửa",
            "(Ngẫu nhiên nhận hiệu ứng Tốc độ, Chống cháy, May mắn)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMixedMetal);

    public static final MaterialTrait LITE_MIXED_METAL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Kẻ xui xẻo")
        .setLore(
            "+50% sát thương đầu ra",
            "Nhận hiệu ứng Xui xẻo III"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headBrass)
        .addConsumer(TraitEventType.TICK, TickEvents::headBrass);

    public static final MaterialTrait LITE_MIXED_METAL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Có kinh nghiệm")
        .setLore(
            "+10% nhận kinh nghiệm công cụ",
            "+10% nhận kinh nghiệm người chơi"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksAdamantite)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksAdamantite);

    public static final MaterialTrait LITE_MIXED_METAL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Hỗn loạn")
        .setLore(
            "Khi bị tấn công",
            "có tỷ lệ hoán đổi vị trí với kẻ tấn công"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMixedMetal);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Tán xạ")
        .setLore(
            "Khi tấn công gây sát thương lên tất cả sinh vật xung quanh",
            "Sát thương tán xạ không bị ảnh hưởng bởi đặc tính hoặc module khác"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAdvancedAlloy);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Quá tải")
        .setLore(
            "Cứ mất 50 độ bền, sẽ",
            "tiêu hao một thỏi sắt để hồi 50 độ bền"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAdvancedAlloy);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_PLATES = new MaterialTrait()
        // Event More Advanced (mod affector)
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Cao cấp hơn")
        .setLore(
            "Advanced modifiers +1 for each piece.",
            "(Tính năng đang phát triển, tạm chưa dịch)"
        );

    public static final MaterialTrait LITE_ADVANCED_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Nhiệt độ cao")
        .setLore(
            "Có tỷ lệ làm thực thể xung quanh bốc cháy"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCorBronze);

    public static final MaterialTrait LITE_MAG_THOR_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Chịu nhiệt")
        .setLore(
            "Bạn có thể bơi trong dung nham",
            "(Miễn nhiễm sát thương lửa và dung nham)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headMagThor);

    public static final MaterialTrait LITE_MAG_THOR_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Ma cà rồng")
        .setLore(
            "Có 33% tỷ lệ hồi 1 máu khi gây sát thương",
            "-50% sát thương (ban ngày)",
            "+50% sát thương (ban đêm)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDamsteel);

    public static final MaterialTrait LITE_MAG_THOR_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Giáp phóng xạ")
        .setLore(
            "Khi bị sát thương",
            "gây hiệu ứng Trúng độc cho kẻ tấn công"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMagThor);

    public static final MaterialTrait LITE_MAG_THOR_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Nộ xây dựng")
        .setLore(
            "Có 20% tỷ lệ khi bị sát thương",
            "nhận hiệu ứng Tốc độ",
            "nhận hiệu ứng Gấp rút"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagThor);

    public static final MaterialTrait LITE_CARBON_MESH_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Nhanh nhẹn")
        .setLore(
            "Nhận hiệu ứng Tốc độ",
            "-33% sát thương phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindCarbonMesh)
        .addConsumer(TraitEventType.TICK, TickEvents::bindCarbonMesh);

    public static final MaterialTrait LITE_CARBON_MESH_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Sợi carbon")
        .setLore(
            "Nhận hiệu ứng Tốc độ"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonCarbonMesh);

    public static final MaterialTrait LITE_SCRAP_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Đáng sợ")
        .setLore(
            "+300% tiêu hao độ bền",
            "-100% nhận kinh nghiệm công cụ"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headScrap)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headScrap)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headScrap);

    public static final MaterialTrait LITE_SCRAP_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Việc trí óc")
        .setLore(
            "+100% nhận kinh nghiệm công cụ",
            "-50% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCopper);

    public static final MaterialTrait LITE_SCRAP_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Đáng thương")
        .setLore(
            "Cảnh báo: Đừng mặc giáp này",
            "Sẽ có chuyện xấu xảy ra",
            "+400% nhận kinh nghiệm người chơi"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateScrap)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateScrap);

    public static final MaterialTrait LITE_SCRAP_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Tan rã")
        .setLore(
            "+200% nhận kinh nghiệm người chơi",
            "Khi bị sát thương giáp có tỷ lệ rơi ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksScrap)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksScrap);

    public static final MaterialTrait LITE_IRIDIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Bảo vệ")
        .setLore(
            "Giúp bạn tránh khỏi cái chết",
            "(CD: 20 phút)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headIridium);

    public static final MaterialTrait LITE_IRIDIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Đừng nhìn tôi")
        .setLore(
            "Khiến mục tiêu nhìn về hướng của bạn",
            "(CD: 20 giây)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodIridium);

    public static final MaterialTrait LITE_IRIDIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Bất khuất")
        .setLore(
            "10% sát thương phải chịu sẽ bị phản đòn lại kẻ tấn công"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateIridium);

    public static final MaterialTrait LITE_IRIDIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Năng lượng phi quy ước")
        .setLore(
            "Sát thương phải chịu sẽ được chuyển thành năng lượng",
            "và lưu trữ trong giáp (sát thương không bị triệt tiêu)",
            "Chuột phải để giải phóng năng lượng đã lưu trữ",
            "sạc cho tất cả vật phẩm trong túi đồ"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksIridium)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksIridium);

    // endregion

    // region Slimefun Warfare

    public static final MaterialTrait SFW_SEGGANESSON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Quá tải")
        .setLore(
            "Sát thương ban đầu của mỗi lần tấn công được lưu trữ",
            "Mỗi 10 lần tấn công sẽ giải phóng toàn bộ sát thương đã lưu"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Mù tốc độ")
        .setLore(
            "Nhận hiệu ứng Tốc độ V",
            "Nhận hiệu ứng Mù"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Hấp dẫn")
        .setLore(
            "Tất cả thực thể gần đó",
            "sẽ từ từ bị kéo về phía bạn"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Hút linh hồn")
        .setLore(
            "Mỗi lần tiêu diệt sinh vật địch thu thập 1 linh hồn",
            "Mỗi 100 linh hồn +1% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSegganesson);

    public static final MaterialTrait SFW_SLIMESTEEL_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Đàn hồi II")
        .setLore(
            "-50% sát thương rơi",
            "Nhận hiệu ứng Nhảy cao II"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::bindSlimesteel)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindSlimesteel);

    public static final MaterialTrait SFW_SLIMESTEEL_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Trăng nhảy")
        .setLore(
            "Khi áp dụng cho giày: ",
            "Miễn nhiễm sát thương rơi"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::gambesonSlimeSteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Chất nhờn mạnh")
        .setLore(
            "Khi túi đồ còn chỗ trống",
            "khối rơi sẽ trực tiếp vào túi"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Linh hoạt")
        .setLore(
            "Chỉ hiệu lực khi công cụ chưa hỏng",
            "-50% sát thương phải chịu",
            "Tiêu hao độ bền bằng sát thương ban đầu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Cương và nhu")
        .setLore(
            "Nhận hiệu ứng Tốc độ",
            "Nhận hiệu ứng Nhảy cao",
            "+10% sát thương phải chịu"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateReinforcedSlimesteel)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Bắn hụt")
        .setLore(
            "Có 10% tỷ lệ miễn nhiễm sát thương từ đạn bắn"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksReinforcedSlimesteel);

    public static final MaterialTrait SFW_OSMIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Búa")
        .setLore(
            "Có thể đào khu vực 3x3x3"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait SFW_OSMIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Yên nặng")
        .setLore(
            "Mục tiêu trúng đòn sẽ bị làm chậm",
            "và không thể dịch chuyển"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodOsmium);

    public static final MaterialTrait SFW_OSMIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Tăng trọng")
        .setLore(
            "Nhận hiệu ứng Làm chậm",
            "Khi bị sát thương, kẻ tấn công bị đẩy lùi"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateOsmium)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateOsmium);

    public static final MaterialTrait SFW_OSMIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Bút vẽ")
        .setLore(
            "Có 5% tỷ lệ được chữa trị bởi sát thương phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksOsmium);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Dã man")
        .setLore(
            "Nhận hiệu ứng Mệt mỏi đào",
            "Mục tiêu trúng đòn bị giam cầm",
            "+100% sát thương đầu ra",
            "Có 33% tỷ lệ thêm +100% sát thương đầu ra"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headOsmiumSuperalloy)
        .addConsumer(TraitEventType.TICK, TickEvents::headOsmiumSuperalloy);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Đẩy lùi")
        .setLore(
            "Đẩy lùi bất kỳ sinh vật trúng đòn",
            "Có tỷ lệ giam cầm mục tiêu"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headHard);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Bão sét")
        .setLore(
            "Khi mặc đủ bộ giáp có đặc tính Bão sét",
            "có tỷ lệ triệu hồi bão sét xung quanh"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateOsmiumSuperalloy);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Phân rã một phần")
        .setLore(
            "Có tỷ lệ gây sát thương ngẫu nhiên lên sinh vật xung quanh",
            "Không gây chết"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksOsmiumSuperalloy);

    public static final MaterialTrait SFW_UNPATENTABLIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Sáng tạo")
        .setLore(
            "Vào ban ngày: ",
            "+100% nhận kinh nghiệm công cụ",
            "+100% nhận kinh nghiệm người chơi"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headUnpatentabilum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headUnpatentabilum);

    public static final MaterialTrait SFW_UNPATENTABLIUM_ROD = new MaterialTrait()
        // Special case in ItemDrop and PlayerDeath
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Quyền vô hình")
        .setLore(
            "Công cụ không thể bị vứt bỏ",
            "Không rơi khi chết"
        );

    public static final MaterialTrait SFW_UNPATENTABLIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Nhìn chằm chằm")
        .setLore(
            "Thực thể bạn nhìn vào sẽ dịch chuyển đến bên bạn",
            "Không hiệu lực với người chơi, Wither, Ender Dragon"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateUnpatentabilum);

    public static final MaterialTrait SFW_UNPATENTABLIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Hiệp sĩ bàn tròn")
        .setLore(
            "Khi bị sát thương có tỷ lệ",
            "sinh ra Hiệp sĩ bàn tròn xung quanh",
            "(Ừ thì, là Iron Golem)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMetal);

    // endregion

    // region DynaTech

    public static final MaterialTrait DYN_STAINLESS_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Siêu inox")
        .setLore(
            "Thật sự, tuyệt đối là inox",
            "Có thể chặn nhiều máu hơn",
            "(Thêm hiệu ứng hoa mỹ ngầu hơn)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Dao muỗng")
        .setLore(
            "Tấn công động vật có thể tự ăn luôn",
            "Tuyệt vời..."
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Tiêu chuẩn")
        .setLore(
            "-5% sát thương phải chịu"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("An toàn dưới nước")
        .setLore(
            "Nhận hiệu ứng Thở dưới nước"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksStainlessSteel);

    public static final MaterialTrait DYN_VEX_GEM_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Độn thổ")
        .setLore(
            "Chuột phải để dịch chuyển ngẫu nhiên gần đó",
            "(CD: 5 phút)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::bindVex);

    public static final MaterialTrait DYN_VEX_GEM_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Thật phiền phức")
        .setLore(
            "Ngọc Vex không nên dùng thế này!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonVex);

    public static final MaterialTrait DYN_STAR_DUST_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Quang sát")
        .setLore(
            "+50% sát thương đầu ra",
            "Tấn công có thể làm choáng mục tiêu"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headStarDust);

    public static final MaterialTrait DYN_STAR_DUST_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Y Phàm")
        .setLore(
            "\"Đừng ước với sao băng, nếu không nó sẽ biến thành phụ nữ\"",
            "Nhận hiệu ứng Phát sáng",
            "Dân làng xung quanh sẽ liên tục tụ tập về phía bạn"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodStarDust);

    public static final MaterialTrait DYN_STAR_DUST_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Ánh sao")
        .setLore(
            "Có 5% tỷ lệ",
            "hồi 1 máu (nửa tim) vào ban đêm"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateStardust);

    public static final MaterialTrait DYN_STAR_DUST_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Ma đồng")
        .setLore(
            "Nhận 1 lớp hiệu ứng Ma đồng",
            "Khi có 4 lớp Ma đồng trở lên",
            "Đẩy lùi tất cả sinh vật địch trong phạm vi 5 ô",
            "(Trừ Wither và Ender Dragon)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Hình thái ma")
        .setLore(
            "Miễn nhiễm sát thương từ đạn bắn"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Siêu khối lập phương [B]")
        .setLore(
            "Chỉ có hiệu lực khi [A] và [B] cùng tồn tại",
            "",
            ThemeUtils.CLICK_INFO + "Shift + chuột phải" + ThemeUtils.PASSIVE + "lưu vị trí",
            ThemeUtils.CLICK_INFO + "Chuột phải" + ThemeUtils.PASSIVE + "dịch chuyển đến vị trí đã lưu",
            "(CD: 10 phút)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Đội cơ giới")
        .setLore(
            "Tiêu hao độ bền để tấn công chậm tất cả sinh vật xung quanh",
            "Đặc tính này sẽ không gây chết",
            "(Tiêu hao độ bền không bị ảnh hưởng bởi đặc tính, module, phù phép khác)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Bóng ma")
        .setLore(
            "Lơ lửng như ma",
            "(Nhận hiệu ứng Bay bổng)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksGhostly);

    public static final MaterialTrait DYN_TESSERACT_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Siêu khối lập phương [A]")
        .setLore(
            "Chỉ có hiệu lực khi [A] và [B] cùng tồn tại",
            "",
            ThemeUtils.CLICK_INFO + "Shift + chuột phải" + ThemeUtils.PASSIVE + "lưu vị trí",
            ThemeUtils.CLICK_INFO + "Chuột phải" + ThemeUtils.PASSIVE + "dịch chuyển đến vị trí đã lưu",
            "(CD: 10 phút)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headTessMat);

    public static final MaterialTrait DYN_TESSERACT_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Năng lượng quang học")
        .setLore(
            "Cần đủ bộ giáp có đặc tính Năng lượng quang học kép",
            "(Mỗi món giáp cần có 2 đặc tính Năng lượng quang học) mới có hiệu lực",
            "Khi bạn ở trong Ngôi nhà dị thứ nguyên, sẽ tích lũy Năng lượng quang học",
            "Khi bị sát thương, Năng lượng quang học sẽ được giải phóng để triệt tiêu sát thương",
            "(Sát thương sau khi tính tăng/giảm)",
            "1 điểm Năng lượng quang học có thể triệt tiêu 1 sát thương",
            "Nếu Năng lượng quang học không đủ, sẽ không triệt tiêu bất kỳ sát thương nào",
            "Mỗi món giáp tối đa lưu trữ 50 Năng lượng quang học",
            "Đủ bộ giáp tối đa lưu trữ 200 Năng lượng quang học"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::hyperbolic)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::hyperbolic);

    public static final MaterialTrait DYN_TESSERACT_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Năng lượng quang học")
        .setLore(
            "Cần 8 đặc tính Năng lượng quang học mới có hiệu lực",
            "(Mỗi món giáp cần có 2 đặc tính Năng lượng quang học)",
            "Khi bạn ở trong Ngôi nhà dị thứ nguyên, sẽ tích lũy Năng lượng quang học",
            "Khi bị sát thương, Năng lượng quang học sẽ được giải phóng để triệt tiêu sát thương",
            "(Sát thương sau khi tính tăng/giảm)",
            "1 điểm Năng lượng quang học có thể triệt tiêu 1 sát thương",
            "Nếu Năng lượng quang học không đủ, sẽ không triệt tiêu bất kỳ sát thương nào",
            "Mỗi món giáp tối đa lưu trữ 50 Năng lượng quang học",
            "Đủ bộ giáp tối đa lưu trữ 200 Năng lượng quang học"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::hyperbolic)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::hyperbolic);

    // endregion

    // region TranscEndence

    public static final MaterialTrait TNS_DAXI_STRENGTH = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Siêu năng lực")
        .setLore(
            "Có 20% tỷ lệ giải phóng sức mạnh lõi siêu năng lực",
            "gây 100% sát thương thêm"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDaxiStrength);

    public static final MaterialTrait TNS_DAXI_ABSORPTION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Siêu năng lực liên hợp (A)")
        .setLore(
            "Khi 4 loại siêu năng lực (A, F, S, R) kết hợp lại",
            "bạn có thể giữ lại hiệu ứng lõi siêu năng lực khi chết"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiAbsorption);

    public static final MaterialTrait TNS_DAXI_FORTITUDE = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Siêu năng lực liên hợp (F)")
        .setLore(
            "Khi 4 loại siêu năng lực (A, F, H, R) kết hợp lại",
            "bạn có thể giữ lại hiệu ứng lõi siêu năng lực khi chết"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiFortitude);

    public static final MaterialTrait TNS_DAXI_SATURATION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Siêu năng lực liên hợp (H)")
        .setLore(
            "Khi 4 loại siêu năng lực (A, F, H, R) kết hợp lại",
            "bạn có thể giữ lại hiệu ứng lõi siêu năng lực khi chết"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiSaturation);

    public static final MaterialTrait TNS_DAXI_REGENERATION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Siêu năng lực liên hợp (R)")
        .setLore(
            "Khi 4 loại siêu năng lực (A, F, H, R) kết hợp lại",
            "bạn có thể giữ lại hiệu ứng lõi siêu năng lực khi chết"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiRegeneration);

    // endregion

    // region Networks

    public static final MaterialTrait NTW_UTLIMANINIUM = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.NETWORKS_NOTE)
        .setTraitName("Kết nối mạng")
        .setLore(
            "Bạn có thể thông qua tín hiệu từ mũ phát ra",
            "kết nối từ xa vào một mạng lưới",
            "",
            "Khi tay không:",
            ThemeUtils.CLICK_INFO + "Shift + chuột phải" + ThemeUtils.PASSIVE + "ràng buộc mạng lưới",
            ThemeUtils.CLICK_INFO + "Chuột trái" + ThemeUtils.PASSIVE + "mở mạng lưới đã ràng buộc",
            "",
            ThemeUtils.ITEM_MOLTEN_METAL + "Đặc tính này chỉ có hiệu lực khi dùng cho mũ"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksUltimaninium);

    // endregion
}
