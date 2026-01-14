package midvightmirage.grandslam.client.data;

import midvightmirage.grandslam.item.GrandSlamItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class GrandSlamHalberdModelProvider extends FabricModelProvider {
    public GrandSlamHalberdModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.createFlatItemModel(GrandSlamItems.STONE_HALBERD, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
