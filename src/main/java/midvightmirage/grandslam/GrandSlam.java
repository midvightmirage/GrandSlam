package midvightmirage.grandslam;

import midvightmirage.grandslam.item.GrandSlamItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrandSlam implements ModInitializer {
    public static final String MOD_ID = "grandslam";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        GrandSlamItems.initialize();
        // TODO: Add Custom Item Features
        // TODO: Add Textures & Sounds
        // TODO: Item Model & Icon like Spear and Trident
        // TODO: Item Animations
    }
}