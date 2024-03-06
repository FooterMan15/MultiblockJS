package io.github.multiblockjs.kubejs;

import io.github.multiblockjs.MultiblockJS;
import dev.latvian.mods.kubejs.KubeJSPlugin;

public class MultiblockJSPlugin extends KubeJSPlugin {

    @Override
    public void init() {
        MultiblockJS.LOGGER.info("This is my KubeJS Plugin!");
    }
}

