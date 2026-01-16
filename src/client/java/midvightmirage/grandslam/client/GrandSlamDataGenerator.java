package midvightmirage.grandslam.client;

// import midvightmirage.grandslam.client.data.GrandSlamCarishanItemProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
public class GrandSlamDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        // pack.addProvider(GrandSlamCarishanItemProvider::new);
        // pack.addProvider(GrandSlamRecipeProvider::new); TODO: Add Recipes
        // pack.addProvider(GrandSlamLanguageProvider::new); TODO: Add Language
    }
}
