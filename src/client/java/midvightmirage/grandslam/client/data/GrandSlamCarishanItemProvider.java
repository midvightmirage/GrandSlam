package midvightmirage.grandslam.client.data;

import midvightmirage.grandslam.item.GrandSlamItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;


public class GrandSlamCarishanItemProvider extends FabricModelProvider {

    public GrandSlamCarishanItemProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        // No block models needed for halberds
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        // Regular halberds
        itemModelGenerators.generateFlatItem(GrandSlamItems.WOODEN_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.STONE_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.COPPER_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.IRON_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.GOLDEN_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.DIAMOND_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.NETHERITE_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);

        // Grand halberds
        itemModelGenerators.generateFlatItem(GrandSlamItems.WOODEN_GRAND_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.STONE_GRAND_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.COPPER_GRAND_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.IRON_GRAND_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.GOLDEN_GRAND_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.DIAMOND_GRAND_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(GrandSlamItems.NETHERITE_GRAND_CARISHAN, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    private record ItemEntry(String name, net.minecraft.world.item.Item item) {}
}
