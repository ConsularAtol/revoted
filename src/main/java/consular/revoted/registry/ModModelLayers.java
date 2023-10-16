package consular.revoted.registry;

import consular.revoted.Revoted;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer CRAB =
            new EntityModelLayer(new Identifier(Revoted.MODID, "crab"), "main");
}
