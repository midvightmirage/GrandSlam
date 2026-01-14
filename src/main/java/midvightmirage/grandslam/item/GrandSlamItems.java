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
    public static int BASE_HALBERD_DAMAGE = 4;
    public static int DURABILITY_WOOD = 128;
    public static int DURABILITY_GOLD = 128;
    public static int DURABILITY_STONE = 256;
    public static int DURABILITY_COPPER = 512;
    public static int DURABILITY_IRON = 1024;
    public static int DURABILITY_DIAMOND = 2048;
    public static int DURABILITY_NETHERITE = 3072;
    public static String TOOLTIP_HALBERD_DESC = "item.grandslam.halberd.desc";
    public static String TOOLTIP_HALBERD_SHIFT = "item.grandslam.halberd.shift";
    public static String TOOLTIP_GRAND_DESC = "item.grandslam.grand.desc";
    public static String TOOLTIP_GRAND_SHIFT = "item.grandslam.grand.shift";

    public static Item WOODEN_HALBERD;
    public static Item STONE_HALBERD;
    public static Item COPPER_HALBERD;
    public static Item IRON_HALBERD;
    public static Item GOLDEN_HALBERD;
    public static Item DIAMOND_HALBERD;
    public static Item NETHERITE_HALBERD;

    public static Item WOODEN_GRAND_HALBERD;
    public static Item STONE_GRAND_HALBERD;
    public static Item COPPER_GRAND_HALBERD;
    public static Item IRON_GRAND_HALBERD;
    public static Item GOLDEN_GRAND_HALBERD;
    public static Item DIAMOND_GRAND_HALBERD;
    public static Item NETHERITE_GRAND_HALBERD;

    public static void initialize() {
        GrandSlam.LOGGER.info("Registering Items for" + GrandSlam.MOD_ID);
        WOODEN_HALBERD = registerHalberd("wooden_halberd", ToolMaterial.WOOD, DURABILITY_WOOD, SPEED_REGULAR, false);
        STONE_HALBERD = registerHalberd("stone_halberd", ToolMaterial.STONE, DURABILITY_STONE, SPEED_REGULAR, false);
        COPPER_HALBERD = registerHalberd("copper_halberd", ToolMaterial.COPPER, DURABILITY_COPPER, SPEED_REGULAR, false);
        IRON_HALBERD = registerHalberd("iron_halberd", ToolMaterial.IRON, DURABILITY_IRON, SPEED_REGULAR, false);
        GOLDEN_HALBERD = registerHalberd("golden_halberd", ToolMaterial.GOLD, DURABILITY_GOLD, SPEED_REGULAR, false);
        DIAMOND_HALBERD = registerHalberd("diamond_halberd", ToolMaterial.DIAMOND, DURABILITY_DIAMOND, SPEED_REGULAR, false);
        NETHERITE_HALBERD = registerHalberd("netherite_halberd", ToolMaterial.NETHERITE, DURABILITY_NETHERITE, SPEED_REGULAR, true);

        WOODEN_GRAND_HALBERD = registerHalberd("wooden_grand_halberd", ToolMaterial.WOOD, DURABILITY_WOOD, SPEED_GRAND, false);
        STONE_GRAND_HALBERD = registerHalberd("stone_grand_halberd", ToolMaterial.STONE, DURABILITY_STONE, SPEED_GRAND, false);
        COPPER_GRAND_HALBERD = registerHalberd("copper_grand_halberd", ToolMaterial.COPPER, DURABILITY_COPPER, SPEED_GRAND, false);
        IRON_GRAND_HALBERD = registerHalberd("iron_grand_halberd", ToolMaterial.IRON, DURABILITY_IRON, SPEED_GRAND, false);
        GOLDEN_GRAND_HALBERD = registerHalberd("golden_grand_halberd", ToolMaterial.GOLD, DURABILITY_GOLD, SPEED_GRAND, false);
        DIAMOND_GRAND_HALBERD = registerHalberd("diamond_grand_halberd", ToolMaterial.DIAMOND, DURABILITY_DIAMOND, SPEED_GRAND, false);
        NETHERITE_GRAND_HALBERD = registerHalberd("netherite_grand_halberd", ToolMaterial.NETHERITE, DURABILITY_NETHERITE, SPEED_GRAND, true);
        GrandSlam.LOGGER.info("Registered Items for" + GrandSlam.MOD_ID);

    }

    private static Item registerHalberd(String name, ToolMaterial material, int durability, float attackSpeed, boolean fireResistant) {

        boolean isGrand = name.contains("grand");

        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrandSlam.MOD_ID, name));

        Item.Properties properties = new Item.Properties()
                .rarity(isGrand ? Rarity.RARE : Rarity.COMMON)
                .sword(material, material.attackDamageBonus() + BASE_HALBERD_DAMAGE + (isGrand ? 4 : 0), attackSpeed)
                .durability(durability)
                .setId(key);

        if (fireResistant) {
            properties.fireResistant();
        }

        Item item = new Item(properties);
        return net.minecraft.core.Registry.register(BuiltInRegistries.ITEM, key, item);
    }
}


