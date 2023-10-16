package consular.revoted.registry;

import consular.revoted.entity.CrabEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerEverything(){
        ModItems.registerItems();

        registerMobAttributes();
    }

    private static void registerMobAttributes(){
        FabricDefaultAttributeRegistry.register(ModEntities.CRAB, CrabEntity.setAttributes());
    }
}
