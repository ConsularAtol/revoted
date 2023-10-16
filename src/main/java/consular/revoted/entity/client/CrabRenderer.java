package consular.revoted.entity.client;

import consular.revoted.Revoted;
import consular.revoted.entity.CrabEntity;
import consular.revoted.registry.ModModelLayers;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class CrabRenderer extends MobEntityRenderer<CrabEntity, CrabModel<CrabEntity>> {

    private static final Identifier TEXTURE = new Identifier(Revoted.MODID, "textures/entity/crab.png");

    public CrabRenderer(EntityRendererFactory.Context context) {
        super(context, new CrabModel<>(context.getPart(ModModelLayers.CRAB)), 0.6f);
    }

    @Override
    public Identifier getTexture(CrabEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CrabEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
