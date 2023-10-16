package consular.revoted;

import consular.revoted.entity.client.CrabModel;
import consular.revoted.entity.client.CrabRenderer;
import consular.revoted.registry.ModEntities;
import consular.revoted.registry.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RevotedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		entityRenderers();
	}

	private void entityRenderers(){
        EntityRendererRegistry.register(ModEntities.CRAB, CrabRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CRAB, CrabModel::getTexturedModelData);
    }
}