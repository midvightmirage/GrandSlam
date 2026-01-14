package midvightmirage.grandslam.client;

import midvightmirage.grandslam.GrandSlam;
import net.fabricmc.api.ClientModInitializer;

public class GrandSlamClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        GrandSlam.LOGGER.info("Initializing Client: " + GrandSlam.MOD_ID);

    }
}
