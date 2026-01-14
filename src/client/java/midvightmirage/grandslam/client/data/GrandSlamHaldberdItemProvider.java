import midvightmirage.grandslam.item.GrandSlamItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import java.util.List;

public class GrandSlamHaldberdItemProvider extends FabricModelProvider {

    private static final List<ItemEntry> HALBERDS = List.of(
            new ItemEntry("wooden_haldberd", GrandSlamItems.WOODEN_HALBERD),
            new ItemEntry("stone_haldberd", GrandSlamItems.STONE_HALBERD),
            new ItemEntry("copper_haldberd", GrandSlamItems.COPPER_HALBERD),
            new ItemEntry("iron_haldberd", GrandSlamItems.IRON_HALBERD),
            new ItemEntry("golden_haldberd", GrandSlamItems.GOLDEN_HALBERD),
            new ItemEntry("diamond_haldberd", GrandSlamItems.DIAMOND_HALBERD),
            new ItemEntry("netherite_haldberd", GrandSlamItems.NETHERITE_HALBERD),
            new ItemEntry("wooden_grand_haldberd", GrandSlamItems.WOODEN_GRAND_HALBERD),
            new ItemEntry("stone_grand_haldberd", GrandSlamItems.STONE_GRAND_HALBERD),
            new ItemEntry("copper_grand_haldberd", GrandSlamItems.COPPER_GRAND_HALBERD),
            new ItemEntry("iron_grand_haldberd", GrandSlamItems.IRON_GRAND_HALBERD),
            new ItemEntry("golden_grand_haldberd", GrandSlamItems.GOLDEN_GRAND_HALBERD),
            new ItemEntry("diamond_grand_haldberd", GrandSlamItems.DIAMOND_GRAND_HALBERD),
            new ItemEntry("netherite_grand_haldberd", GrandSlamItems.NETHERITE_GRAND_HALBERD)
    );

    public GrandSlamHaldberdItemProvider(FabricDataOutput output) {
        super(output);
    }
}