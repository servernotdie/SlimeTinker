package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.TinkersSmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Materials {

    private Materials() {
        throw new UnsupportedOperationException("Utility Class");
    }

    // region Vanilla + Core SF

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_COPPER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COPPER",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt đồng",
        "Hạt được làm từ đồng nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_TIN = ThemeUtils.themedItemStack(
        "NUGGET_CAST_TIN",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt thiếc",
        "Hạt được làm từ thiếc nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_ZINC = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ZINC",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt kẽm",
        "Hạt được làm từ kẽm nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALUMINUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALUMINUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt nhôm",
        "Hạt được làm từ nhôm nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGNESIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGNESIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt magiê",
        "Hạt được làm từ magiê nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_LEAD = ThemeUtils.themedItemStack(
        "NUGGET_CAST_LEAD",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt chì",
        "Hạt được làm từ chì nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_SILVER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SILVER",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt bạc",
        "Hạt được làm từ bạc nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_COAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COAL",
        Material.POLISHED_BLACKSTONE_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt than",
        "Hạt được làm từ than nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_STEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_STEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt thép",
        "Hạt được làm từ thép nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAMASCUS_STEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAMASCUS_STEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt thép Damascus",
        "Hạt được làm từ thép Damascus nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_DURALIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DURALIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt Duralium",
        "Hạt được làm từ Duralium nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BRONZE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt đồng thau",
        "Hạt được làm từ đồng thau nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALU_BRONZE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt đồng nhôm",
        "Hạt được làm từ đồng nhôm nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_HARD_METAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_HARD_METAL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt kim loại cứng",
        "Hạt được làm từ kim loại cứng nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_COR_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COR_BRONZE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt đồng Corinthian",
        "Hạt được làm từ đồng Corinthian nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_SOLDER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SOLDER",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt chất hàn",
        "Hạt được làm từ chất hàn nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_BILLON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BILLON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim bạc đồng",
        "Hạt được làm từ hợp kim bạc đồng nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_BRASS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BRASS",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt đồng thau",
        "Hạt được làm từ đồng thau nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRASS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALU_BRASS",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt đồng nhôm",
        "Hạt được làm từ đồng nhôm nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_NICKEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_NICKEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt niken",
        "Hạt được làm từ niken nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_COBALT = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COBALT",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt coban",
        "Hạt được làm từ coban nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim gia cố",
        "Hạt được làm từ hợp kim gia cố nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_FERROSILICON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_FERROSILICON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt ferrosilicon",
        "Hạt được làm từ ferrosilicon nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_REDSTONE_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REDSTONE_ALLOY",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim đá đỏ",
        "Hạt được làm từ hợp kim đá đỏ nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BOOMERITE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim Boomer",
        "Hạt được làm từ hợp kim Boomer nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SEFIRITE",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim Sefi",
        "Hạt được làm từ hợp kim Sefi nóng chảy"
    );
    public static final SlimefunItemStack NUGGET_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_CRINGLEIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim Giáng sinh",
        "Hạt được làm từ hợp kim Giáng sinh nóng chảy"
    );
    public static final SlimefunItemStack NUGGET_CAST_FONDNESS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_FONDNESS",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "Hạt yêu thích",
        "Hạt mang ý nghĩa yêu thích"
    );
    public static final SlimefunItemStack NUGGET_CAST_DEVOTION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DEVOTION",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "Hạt yêu sâu đậm",
        "Hạt mang ý nghĩa yêu sâu đậm"
    );
    public static final SlimefunItemStack NUGGET_CAST_PASSION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_PASSION",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "Hạt nhiệt huyết",
        "Hạt mang ý nghĩa nhiệt huyết"
    );
    public static final SlimefunItemStack NUGGET_CAST_LOVE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_LOVE",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "Hạt ái tình",
        "Hạt được đúc từ tình yêu thuần khiết"
    );
    public static final SlimefunItemStack NUGGET_CAST_NICE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_NICE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt tuyệt vời",
        "Tuyệt vời~"
    );
    public static final SlimefunItemStack NUGGET_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SMITHIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt Smith",
        "Một kim loại cơ bản, có nhiều công dụng công nghiệp."
    );
    public static final SlimefunItemStack NUGGET_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ANNIVERSARIUM",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt kỉ niệm",
        "Kỷ niệm 10 năm Slimefun!"
    );
    public static final SlimefunItemStack NUGGET_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED_DRACONIUM",
        Material.CRIMSON_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt rồng gia cố",
        "Hạt được đúc từ sự phẫn nộ vô tận"
    );
    // endregion

    // region Ingots
    public static final SlimefunItemStack INGOT_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "INGOT_CAST_BOOMERITE",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Phôi hợp kim Boomer",
        "Phôi được làm từ hợp kim Boomer nóng chảy"
    );
    public static final SlimefunItemStack INGOT_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "INGOT_CAST_SEFIRITE",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi hợp kim Sefi",
        "Phôi được làm từ hợp kim Sefi nóng chảy",
        "Không ổn định, chỉ có thể tồn tại trong một thời gian ngắn"
    );
    public static final SlimefunItemStack INGOT_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_CRINGLEIUM",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi hợp kim Giáng sinh",
        "Phôi được làm từ hợp kim Giáng sinh nóng chảy",
        "Không ổn định, chỉ có thể tồn tại trong một thời gian ngắn"
    );
    public static final SlimefunItemStack INGOT_CAST_FONDNESS = ThemeUtils.themedItemStack(
        "INGOT_CAST_FONDNESS",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Phôi yêu thích",
        "Phôi mang ý nghĩa yêu thích"
    );
    public static final SlimefunItemStack INGOT_CAST_DEVOTION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DEVOTION",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Phôi yêu sâu đậm",
        "Phôi mang ý nghĩa yêu sâu đậm"
    );
    public static final SlimefunItemStack INGOT_CAST_PASSION = ThemeUtils.themedItemStack(
        "INGOT_CAST_PASSION",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Phôi nhiệt huyết",
        "Phôi mang ý nghĩa nhiệt huyết"
    );
    public static final SlimefunItemStack INGOT_CAST_LOVE = ThemeUtils.themedItemStack(
        "INGOT_CAST_LOVE",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Phôi ái tình",
        "Phôi được làm từ tình yêu thuần khiết"
    );
    public static final SlimefunItemStack INGOT_CAST_NICE = ThemeUtils.themedItemStack(
        "INGOT_CAST_NICE",
        Material.GOLD_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi tuyệt vời",
        "Tuyệt vời~"
    );
    public static final SlimefunItemStack INGOT_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_SMITHIUM",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi Smith",
        "Một kim loại cơ bản, có nhiều công dụng công nghiệp."
    );
    public static final SlimefunItemStack INGOT_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_ANNIVERSARIUM",
        Material.GOLD_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi kỉ niệm",
        "Kỷ niệm 10 năm Slimefun!"
    );
    public static final SlimefunItemStack INGOT_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_REINFORCED_DRACONIUM",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Phôi rồng gia cố",
        "Phôi được đúc từ sự phẫn nộ vô tận"
    );
    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_COPPER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COPPER",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối đồng",
        "Khối được làm từ đồng nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_TIN = ThemeUtils.themedItemStack(
        "BLOCK_CAST_TIN",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối thiếc",
        "Khối được làm từ thiếc nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_ZINC = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ZINC",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối kẽm",
        "Khối được làm từ kẽm nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALUMINUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALUMINUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối nhôm",
        "Khối được làm từ nhôm nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGNESIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGNESIUM",
        Material.PINK_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối magiê",
        "Khối được làm từ magiê nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_LEAD = ThemeUtils.themedItemStack(
        "BLOCK_CAST_LEAD",
        Material.PURPLE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối chì",
        "Khối được làm từ chì nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_SILVER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SILVER",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối bạc",
        "Khối được làm từ bạc nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_STEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_STEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối thép",
        "Khối được làm từ thép nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_DAMASCUS_STEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_DAMASCUS_STEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối thép Damascus",
        "Khối được làm từ thép Damascus nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_DURALIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_DURALIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối Duralium",
        "Khối được làm từ Duralium nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối đồng thau",
        "Khối được làm từ đồng thau nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALU_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối đồng nhôm",
        "Khối được làm từ đồng nhôm nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_HARD_METAL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_HARD_METAL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối kim loại cứng",
        "Khối được làm từ kim loại cứng nóng chảy"
    );
    public static final SlimefunItemStack BLOCK_CAST_COR_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COR_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối đồng Corinthian",
        "Khối được làm từ đồng Corinthian nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_SOLDER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SOLDER",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối chất hàn",
        "Khối được làm từ chất hàn nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_BILLON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BILLON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối hợp kim bạc đồng",
        "Khối được làm từ hợp kim bạc đồng nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_BRASS = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BRASS",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối đồng thau",
        "Khối được làm từ đồng thau nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRASS = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALU_BRASS",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối đồng nhôm",
        "Khối được làm từ đồng nhôm nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_NICKEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_NICKEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối niken",
        "Khối được làm từ niken nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_COBALT = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COBALT",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối coban",
        "Khối được làm từ coban nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối hợp kim gia cố",
        "Khối được làm từ hợp kim gia cố nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_FERROSILICON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_FERROSILICON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối ferrosilicon",
        "Khối được làm từ ferrosilicon nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_REDSTONE_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REDSTONE_ALLOY",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối hợp kim đá đỏ",
        "Khối được làm từ hợp kim đá đỏ nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BOOMERITE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối hợp kim Boomer",
        "Khối được làm từ hợp kim Boomer nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SEFIRITE",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối hợp kim Sefi",
        "Khối được làm từ hợp kim Sefi nóng chảy"
    );
    public static final SlimefunItemStack BLOCK_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_CRINGLEIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối hợp kim Giáng sinh",
        "Khối được làm từ hợp kim Giáng sinh nóng chảy"
    );
    public static final SlimefunItemStack BLOCK_CAST_LOVE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_LOVE",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "Khối ái tình",
        "Khối được làm từ tình yêu thuần khiết"
    );
    public static final SlimefunItemStack BLOCK_CAST_NICE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_NICE",
        Material.GOLD_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối tuyệt vời",
        "Tuyệt vời~"
    );

    public static final SlimefunItemStack BLOCK_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SMITHIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối Smith",
        "Một kim loại cơ bản, có nhiều công dụng công nghiệp."
    );
    public static final SlimefunItemStack BLOCK_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ANNIVERSARIUM",
        Material.GOLD_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối kỷ niệm",
        "Kỷ niệm 10 năm Slimefun!"
    );
    public static final SlimefunItemStack BLOCK_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED_DRACONIUM",
        Material.RED_CONCRETE,
        ThemeItemType.CRAFTING,
        "Khối rồng gia cố",
        "Khối được đúc từ sự phẫn nộ vô tận"
    );
    // endregion

    // region Crafts
    public static final SlimefunItemStack MOD_PLATE = ThemeUtils.themedItemStack(
        "MOD_PLATE",
        Material.OBSIDIAN,
        ThemeItemType.MOD,
        "Tấm hợp kim gia cố",
        ThemeUtils.PASSIVE + "Một bản sửa đổi, giúp công cụ",
        ThemeUtils.PASSIVE + "có tỷ lệ không tiêu hao độ bền"
    );

    public static final SlimefunItemStack GROUT = ThemeUtils.themedItemStack(
        "GROUT",
        Material.GRAVEL,
        ThemeItemType.CRAFTING,
        "Xi măng",
        ThemeUtils.PASSIVE + "Có thể nung thành gạch nung"
    );


    public static final SlimefunItemStack SEARED_BRICK = ThemeUtils.themedItemStack(
        "SEARED_BRICK",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Gạch nung",
        ThemeUtils.PASSIVE + "Dùng để chế tạo khối lò luyện Tinker"
    );

    public static final SlimefunItemStack SMELTERY_CONTROLLER = ThemeUtils.themedItemStack(
        "SMELTERY_CONTROLLER",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "Bộ điều khiển lò luyện",
        ThemeUtils.PASSIVE + "Dùng để xây dựng lò luyện Tinker"
    );

    public static final SlimefunItemStack SEARED_TANK = ThemeUtils.themedItemStack(
        "SEARED_TANK",
        Material.RED_NETHER_BRICK_WALL,
        ThemeItemType.CRAFTING,
        "Bồn chứa nung",
        ThemeUtils.PASSIVE + "Dùng để xây dựng lò luyện Tinker"
    );

    public static final SlimefunItemStack SPOUT = ThemeUtils.themedItemStack(
        "SPOUT",
        Material.POLISHED_BLACKSTONE_BRICK_WALL,
        ThemeItemType.CRAFTING,
        "Vòi rót nung",
        ThemeUtils.PASSIVE + "Dùng để xây dựng lò luyện Tinker"
    );

    public static final SlimefunItemStack SEARED_BRICK_BLOCK = ThemeUtils.themedItemStack(
        "SEARED_BRICK_BLOCK",
        Material.POLISHED_BLACKSTONE_BRICKS,
        ThemeItemType.CRAFTING,
        "Gạch đá nung",
        ThemeUtils.PASSIVE + "Dùng để xây dựng lò luyện Tinker"
    );
    // endregion

    // endregion

    // region Infinity Expansion

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_INFINITY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_INFINITY",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt vô tận",
        "Hạt được làm từ vô tận nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGSTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGSTEEL",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt thép từ",
        "Hạt được làm từ thép từ nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_TITANIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_TITANIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt titan",
        "Hạt được làm từ titan nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_MYTHRIL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MYTHRIL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt mythril",
        "Hạt được làm từ mythril nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_ADAMANTITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ADAMANTITE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt adamantite",
        "Hạt được làm từ adamantite nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGNONIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGNONIUM",
        Material.CRIMSON_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt magnonium",
        "Hạt được làm từ magnonium nóng chảy"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_VOID = ThemeUtils.themedItemStack(
        "BLOCK_CAST_VOID",
        Material.NETHERITE_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối hư vô",
        "Khối được làm từ hư vô nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_INFINITY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_INFINITY",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối vô tận",
        "Khối được làm từ vô tận nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGSTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGSTEEL",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối thép từ",
        "Khối được làm từ thép từ nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_TITANIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_TITANIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối titan",
        "Khối được làm từ titan nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_MYTHRIL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MYTHRIL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối mythril",
        "Khối được làm từ mythril nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_ADAMANTITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ADAMANTITE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối adamantite",
        "Khối được làm từ adamantite nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGNONIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGNONIUM",
        Material.PURPLE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối magnonium",
        "Khối được làm từ magnonium nóng chảy"
    );

    // endregion

    // endregion

    // region SFWarfare

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_SLIMESTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SLIMESTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt slimesteel",
        "Hạt được làm từ slimesteel nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED_SLIMESTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED_SLIMESTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt slimesteel gia cố",
        "Hạt được làm từ slimesteel gia cố nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_OSMIUM",
        Material.WARPED_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt osmi",
        "Hạt được làm từ osmi nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM_SUPER_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_OSMIUM_SUPER_ALLOY",
        Material.WARPED_BUTTON,
        ThemeItemType.CRAFTING,
        "Hạt siêu hợp kim osmi",
        "Hạt được làm từ siêu hợp kim osmi nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_UNPATENTABILUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_UNPATENTABILUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Hạt unpatentabilum",
        "Hạt được làm từ unpatentabilum nóng chảy"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_SLIMESTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SLIMESTEEL",
        Material.SLIME_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối slimesteel",
        "Khối được làm từ slimesteel nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED_SLIMESTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED_SLIMESTEEL",
        Material.SLIME_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối slimesteel gia cố",
        "Khối được làm từ slimesteel gia cố nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_OSMIUM",
        Material.LIGHT_BLUE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối osmi",
        "Khối được làm từ osmi nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM_SUPER_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_OSMIUM_SUPER_ALLOY",
        Material.BLUE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Khối siêu hợp kim osmi",
        "Khối được làm từ siêu hợp kim osmi nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_UNPATENTABILUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_UNPATENTABILUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối unpatentabilum",
        "Khối được làm từ unpatentabilum nóng chảy"
    );

    // endregion

    // endregion

    // region DynaTech

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_STAINLESSSTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_STAINLESSSTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt thép không gỉ",
        "Hạt được làm từ thép không gỉ nóng chảy"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_STAINLESSSTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_STAINLESSSTEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối thép không gỉ",
        "Khối được làm từ thép không gỉ nóng chảy"
    );

    // endregion

    // endregion

    // region LiteXpansion
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_REFINED_IRON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REFINED_IRON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt sắt tinh luyện",
        "Hạt được làm từ sắt tinh luyện nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_MIXED_METAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MIXED_METAL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim",
        "Hạt được làm từ hợp kim nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_ADVANCED_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ADVANCED_ALLOY",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim cao cấp",
        "Hạt được làm từ hợp kim cao cấp nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAG_THOR = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAG_THOR",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt hợp kim mag-thor",
        "Hạt được làm từ hợp kim mag-thor nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_SCRAP = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SCRAP",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt phế liệu",
        "Hạt được làm từ phế liệu nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_IRIDIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_IRIDIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt iridi",
        "Hạt được làm từ iridi nóng chảy"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_REFINED_IRON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REFINED_IRON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối sắt tinh luyện",
        "Khối được làm từ sắt tinh luyện nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_MIXED_METAL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MIXED_METAL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối hợp kim",
        "Khối được làm từ hợp kim nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_ADVANCED_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ADVANCED_ALLOY",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối hợp kim cao cấp",
        "Khối được làm từ hợp kim cao cấp nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAG_THOR = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAG_THOR",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối hợp kim mag-thor",
        "Khối được làm từ hợp kim mag-thor nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_SCRAP = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SCRAP",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối phế liệu",
        "Khối được làm từ phế liệu nóng chảy"
    );

    public static final SlimefunItemStack BLOCK_CAST_IRIDIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_IRIDIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Khối iridi",
        "Khối được làm từ iridi nóng chảy"
    );

    // endregion

    // endregion

    // region TranscEndance

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_DAXI_STRENGTH = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_STRENGTH",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt lõi siêu năng lực(S)",
        "Hạt được làm từ lõi siêu năng lực(S) nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_ABSORPTION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_ABSORPTION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt lõi siêu năng lực(A)",
        "Hạt được làm từ lõi siêu năng lực(A) nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_FORTITUDE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_FORTITUDE",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt lõi siêu năng lực(F)",
        "Hạt được làm từ lõi siêu năng lực(F) nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_SATURATION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_SATURATION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt lõi siêu năng lực(H)",
        "Hạt được làm từ lõi siêu năng lực(H) nóng chảy"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_REGENERATION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_REGENERATION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Hạt lõi siêu năng lực(R)",
        "Hạt được làm từ lõi siêu năng lực(R) nóng chảy"
    );

    // endregion

    // region Ingots

    public static final SlimefunItemStack INGOT_CAST_DAXI_STRENGTH = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_STRENGTH",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi lõi siêu năng lực(S)",
        "Phôi được làm từ lõi siêu năng lực(S) nóng chảy"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_ABSORPTION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_ABSORPTION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi lõi siêu năng lực(A)",
        "Phôi được làm từ lõi siêu năng lực(A) nóng chảy"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_FORTITUDE = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_FORTITUDE",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi lõi siêu năng lực(F)",
        "Phôi được làm từ lõi siêu năng lực(F) nóng chảy"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_SATURATION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_SATURATION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi lõi siêu năng lực(H)",
        "Phôi được làm từ lõi siêu năng lực(H) nóng chảy"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_REGENERATION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_REGENERATION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Phôi lõi siêu năng lực(R)",
        "Phôi được làm từ lõi siêu năng lực(R) nóng chảy"
    );

    // endregion

    // endregion

    private static final ItemStack[] RECIPE_GROUT = new ItemStack[]{
        new ItemStack(Material.CLAY), new ItemStack(Material.SAND), new ItemStack(Material.SAND),
        new ItemStack(Material.SAND), new ItemStack(Material.SAND), new ItemStack(Material.GRAVEL),
        new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL)
    };

    private static final ItemStack[] RECIPE_SEARED_BRICK = new ItemStack[]{
        Materials.GROUT, null, null,
        null, null, null,
        null, null, null
    };

    private static final ItemStack[] RECIPE_SEARED_BRICK_BLOCK = new ItemStack[]{
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
        null, null, null
    };

    private static final ItemStack[] RECIPE_SMELTERY_CONTROLLER = new ItemStack[]{
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_SMELTERY_SPOUT = new ItemStack[]{
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_SMELTERY_TANK = new ItemStack[]{
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_REINFORCED_PLATE = new ItemStack[]{
        Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED,
        Materials.BLOCK_CAST_REINFORCED, new ItemStack(Material.OBSIDIAN), Materials.BLOCK_CAST_REINFORCED,
        Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED
    };

    public static void set(SlimeTinker p) {

        // Vanilla + Core SF + Tinker's General
        new UnplaceableBlock(ItemGroups.MATERIALS, GROUT, Workbench.TYPE, RECIPE_GROUT).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, SEARED_BRICK, RecipeType.SMELTERY, RECIPE_SEARED_BRICK).register(p);
        new TinkersSmeltery(ItemGroups.MATERIALS, SMELTERY_CONTROLLER, Workbench.TYPE, RECIPE_SMELTERY_CONTROLLER).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SEARED_TANK, Workbench.TYPE, RECIPE_SMELTERY_TANK).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SPOUT, Workbench.TYPE, RECIPE_SMELTERY_SPOUT).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SEARED_BRICK_BLOCK, Workbench.TYPE, RECIPE_SEARED_BRICK_BLOCK).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, MOD_PLATE, Workbench.TYPE, RECIPE_REINFORCED_PLATE).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COPPER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COPPER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_LEAD, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_LEAD, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SILVER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SILVER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALUMINUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALUMINUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGNESIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGNESIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ZINC, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ZINC, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_TIN, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_TIN, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DURALIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_DURALIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALU_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALU_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_HARD_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_HARD_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COR_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COR_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SOLDER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SOLDER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BILLON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BILLON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALU_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALU_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_NICKEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_NICKEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COBALT, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COBALT, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_FERROSILICON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_FERROSILICON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REDSTONE_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REDSTONE_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_FONDNESS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_FONDNESS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DEVOTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DEVOTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_PASSION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_PASSION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);

        // Infinity Expansion
        if (SupportedPluginsManager.INFINITY_EXPANSION) {
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_VOID, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_INFINITY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_INFINITY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_TITANIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_TITANIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MYTHRIL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MYTHRIL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ADAMANTITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ADAMANTITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGNONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGNONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // SFWarfare
        if (SupportedPluginsManager.SLIMEFUN_WARFARE) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_OSMIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_OSMIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_OSMIUM_SUPER_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_OSMIUM_SUPER_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_UNPATENTABILUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_UNPATENTABILUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // DynaTech
        if (SupportedPluginsManager.DYNATECH) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_STAINLESSSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_STAINLESSSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // LiteXpansion
        if (SupportedPluginsManager.LITEXPANSION) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REFINED_IRON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REFINED_IRON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MIXED_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MIXED_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ADVANCED_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ADVANCED_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAG_THOR, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAG_THOR, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SCRAP, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SCRAP, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_IRIDIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_IRIDIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // TranscEndence
        if (SupportedPluginsManager.TRANSCENDENCE) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_STRENGTH, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_STRENGTH, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_ABSORPTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_ABSORPTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_FORTITUDE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_FORTITUDE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_SATURATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_SATURATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_REGENERATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_REGENERATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        }
    }
}
