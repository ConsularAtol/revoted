package consular.revoted.registry;

import consular.revoted.Revoted;
import consular.revoted.entity.CrabEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModEntities {
    public static final EntityType<CrabEntity> CRAB = Registry.register(
	   Registries.ENTITY_TYPE,
	   new Identifier(Revoted.MODID, "crab"),
           FabricEntityTypeBuilder.<CrabEntity>create(SpawnGroup.CREATURE, CrabEntity::new).dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build() 
    );
}
    

