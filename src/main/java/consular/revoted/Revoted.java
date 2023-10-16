package consular.revoted;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import consular.revoted.registry.ModRegistries;

public class Revoted implements ModInitializer {
	
	public static final String MODID = "revoted";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModRegistries.registerEverything();
	}
}