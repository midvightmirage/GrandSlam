package midvightmirage.grandslam.item;

import midvightmirage.grandslam.GrandSlam;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;

public class GrandSlamItems {

    public static float SPEED_REGULAR = -2.16F;
    public static float SPEED_GRAND = -1.92F;
    public static int BASE_CARISHAN_DAMAGE = 4;
    public static int DURABILITY_WOOD = 128;
    public static int DURABILITY_GOLD = 128;
    public static int DURABILITY_STONE = 256;
    public static int DURABILITY_COPPER = 512;
    public static int DURABILITY_IRON = 1024;
    public static int DURABILITY_DIAMOND = 2048;
    public static int DURABILITY_NETHERITE = 3072;
    public static String TOOLTIP_CARISHAN_DESC = "item.grandslam.carishan.desc";
    public static String TOOLTIP_CARISHAN_SHIFT = "item.grandslam.carishan.shift";
    public static String TOOLTIP_GRAND_DESC = "item.grandslam.grand.desc";
    public static String TOOLTIP_GRAND_SHIFT = "item.grandslam.grand.shift";

    public static Item WOODEN_CARISHAN;
    public static Item STONE_CARISHAN;
    public static Item COPPER_CARISHAN;
    public static Item IRON_CARISHAN;
    public static Item GOLDEN_CARISHAN;
    public static Item DIAMOND_CARISHAN;
    public static Item NETHERITE_CARISHAN;

    public static Item WOODEN_GRAND_CARISHAN;
    public static Item STONE_GRAND_CARISHAN;
    public static Item COPPER_GRAND_CARISHAN;
    public static Item IRON_GRAND_CARISHAN;
    public static Item GOLDEN_GRAND_CARISHAN;
    public static Item DIAMOND_GRAND_CARISHAN;
    public static Item NETHERITE_GRAND_CARISHAN;

    public static void initialize() {
        GrandSlam.LOGGER.info("Registering Items for" + GrandSlam.MOD_ID);
        WOODEN_CARISHAN = registerCarishan("wooden_carishan", ToolMaterial.WOOD, DURABILITY_WOOD, SPEED_REGULAR, false);
        STONE_CARISHAN = registerCarishan("stone_carishan", ToolMaterial.STONE, DURABILITY_STONE, SPEED_REGULAR, false);
        COPPER_CARISHAN = registerCarishan("copper_carishan", ToolMaterial.COPPER, DURABILITY_COPPER, SPEED_REGULAR, false);
        IRON_CARISHAN = registerCarishan("iron_carishan", ToolMaterial.IRON, DURABILITY_IRON, SPEED_REGULAR, false);
        GOLDEN_CARISHAN = registerCarishan("golden_carishan", ToolMaterial.GOLD, DURABILITY_GOLD, SPEED_REGULAR, false);
        DIAMOND_CARISHAN = registerCarishan("diamond_carishan", ToolMaterial.DIAMOND, DURABILITY_DIAMOND, SPEED_REGULAR, false);
        NETHERITE_CARISHAN = registerCarishan("netherite_carishan", ToolMaterial.NETHERITE, DURABILITY_NETHERITE, SPEED_REGULAR, true);

        WOODEN_GRAND_CARISHAN = registerCarishan("wooden_grand_carishan", ToolMaterial.WOOD, DURABILITY_WOOD, SPEED_GRAND, false);
        STONE_GRAND_CARISHAN = registerCarishan("stone_grand_carishan", ToolMaterial.STONE, DURABILITY_STONE, SPEED_GRAND, false);
        COPPER_GRAND_CARISHAN = registerCarishan("copper_grand_carishan", ToolMaterial.COPPER, DURABILITY_COPPER, SPEED_GRAND, false);
        IRON_GRAND_CARISHAN = registerCarishan("iron_grand_carishan", ToolMaterial.IRON, DURABILITY_IRON, SPEED_GRAND, false);
        GOLDEN_GRAND_CARISHAN = registerCarishan("golden_grand_carishan", ToolMaterial.GOLD, DURABILITY_GOLD, SPEED_GRAND, false);
        DIAMOND_GRAND_CARISHAN = registerCarishan("diamond_grand_carishan", ToolMaterial.DIAMOND, DURABILITY_DIAMOND, SPEED_GRAND, false);
        NETHERITE_GRAND_CARISHAN = registerCarishan("netherite_grand_carishan", ToolMaterial.NETHERITE, DURABILITY_NETHERITE, SPEED_GRAND, true);
        GrandSlam.LOGGER.info("Registered Items for" + GrandSlam.MOD_ID);

    }

    private static Item registerCarishan(String name, ToolMaterial material, int durability, float attackSpeed, boolean fireResistant) {

        boolean isGrand = name.contains("grand");

        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrandSlam.MOD_ID, name));

        Item.Properties properties = new Item.Properties()
                .rarity(isGrand ? Rarity.RARE : Rarity.COMMON)
                .sword(material, material.attackDamageBonus() + BASE_CARISHAN_DAMAGE + (isGrand ? 4 : 0), attackSpeed)
                .durability(durability)
                .setId(key);

        if (fireResistant) {
            properties.fireResistant();
        }

        Item item = new Item(properties);
        return net.minecraft.core.Registry.register(BuiltInRegistries.ITEM, key, item);
    }
}


