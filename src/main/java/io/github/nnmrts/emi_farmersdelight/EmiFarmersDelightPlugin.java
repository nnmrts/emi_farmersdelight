package io.github.nnmrts.emi_farmersdelight;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import io.github.nnmrts.emi_farmersdelight.farmersdelight.FarmersDelightPlugin;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmiFarmersDelightPlugin implements EmiPlugin {
    public static final Logger LOGGER = LoggerFactory.getLogger("emi_farmersdelight");

    @Override
    public void register(EmiRegistry emi) {
        FabricLoader loader = FabricLoader.getInstance();
        if (loader.isModLoaded("farmersdelight"))
            new FarmersDelightPlugin().register(emi);
    }
}
