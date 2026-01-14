package midvightmirage.grandslam.client.data;

import midvightmirage.grandslam.item.GrandSlamItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;


public class GrandSlamHaldberdModelProvider extends FabricModelProvider {

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
