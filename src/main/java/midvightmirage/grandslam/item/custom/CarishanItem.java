package midvightmirage.grandslam.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class CarishanItem {
    private static class RegularCarishan extends Item {
        public RegularCarishan(ToolMaterial material, Properties properties) {
            super(properties.spear(
                    material,
                    0.8F,  // swingDuration (seconds)
                    1.0F,  // baseDamage
                    0.5F,  // kineticThreshold1
                    0.5F,  // kineticValue1
                    1.5F,  // kineticDamage1
                    1.0F,  // kineticThreshold2
                    2.0F,  // kineticDamage2
                    0.3F,  // relativeSpeedThreshold
                    1.0F   // relativeSpeedDamage
            ));
        }
    }

    private static class GrandCarishan extends Item {
        public GrandCarishan(ToolMaterial material, Properties properties) {
            super(properties.spear(
                    material,
                    0.7F,  // swingDuration (seconds)
                    1.0F,  // baseDamage
                    0.5F,  // kineticThreshold1
                    0.5F,  // kineticValue1
                    1.5F,  // kineticDamage1
                    1.0F,  // kineticThreshold2
                    2.0F,  // kineticDamage2
                    0.3F,  // relativeSpeedThreshold
                    1.0F   // relativeSpeedDamage
            ));
        }
    }

    public static void initialize() { }
}


    // TODO: Always crit on right click anim attack
    // TODO: Armor piere enchant