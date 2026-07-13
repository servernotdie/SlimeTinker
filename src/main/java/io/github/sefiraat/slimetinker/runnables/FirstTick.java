package io.github.sefiraat.slimetinker.runnables;

import io.github.sefiraat.slimetinker.SlimeTinker;

public class FirstTick implements Runnable {

    @Override
    public void run() {
        SlimeTinker.getInstance().getWorkbench().setupRecipes();
    }
}
