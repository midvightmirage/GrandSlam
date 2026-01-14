package midvightmirage.grandslam.client.data;

import midvightmirage.grandslam.item.GrandSlamItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

import java.util.List;

public class GrandSlamHaldberdItemProvider extends FabricModelProvider {

    private static final List<ItemEntry> HALBERDS = List.of(
            new ItemEntry("wooden_halberd", GrandSlamItems.WOODEN_HALBERD),
            new ItemEntry("stone_halberd", GrandSlamItems.STONE_HALBERD),
            new ItemEntry("copper_halberd", GrandSlamItems.COPPER_HALBERD),
            new ItemEntry("iron_halberd", GrandSlamItems.IRON_HALBERD),
            new ItemEntry("golden_halberd", GrandSlamItems.GOLDEN_HALBERD),
            new ItemEntry("diamond_halberd", GrandSlamItems.DIAMOND_HALBERD),
            new ItemEntry("netherite_halberd", GrandSlamItems.NETHERITE_HALBERD),
            new ItemEntry("wooden_grand_halberd", GrandSlamItems.WOODEN_GRAND_HALBERD),
            new ItemEntry("stone_grand_halberd", GrandSlamItems.STONE_GRAND_HALBERD),
            new ItemEntry("copper_grand_halberd", GrandSlamItems.COPPER_GRAND_HALBERD),
            new ItemEntry("iron_grand_halberd", GrandSlamItems.IRON_GRAND_HALBERD),
            new ItemEntry("golden_grand_halberd", GrandSlamItems.GOLDEN_GRAND_HALBERD),
            new ItemEntry("diamond_grand_halberd", GrandSlamItems.DIAMOND_GRAND_HALBERD),
            new ItemEntry("netherite_grand_halberd", GrandSlamItems.NETHERITE_GRAND_HALBERD)
    );

    public GrandSlamHaldberdItemProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        // No block models needed for halberds
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        // Regular halberds
        itemModelGenerators.createFlatItemModel(GrandSlamItems.WOODEN_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.STONE_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.COPPER_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.IRON_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.GOLDEN_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.DIAMOND_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.NETHERITE_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);

        // Grand halberds
        itemModelGenerators.createFlatItemModel(GrandSlamItems.WOODEN_GRAND_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.STONE_GRAND_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.COPPER_GRAND_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.IRON_GRAND_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.GOLDEN_GRAND_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.DIAMOND_GRAND_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.createFlatItemModel(GrandSlamItems.NETHERITE_GRAND_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    private record ItemEntry(String name, net.minecraft.world.item.Item item) {}
}
