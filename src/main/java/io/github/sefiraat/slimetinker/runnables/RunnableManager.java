package io.github.sefiraat.slimetinker.runnables;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.scheduler.SlimeScheduler;

public class RunnableManager {

    public RunnableManager() {
        SlimeScheduler.runGlobalTimer(new EffectTick(), 0, SlimeTinker.RUNNABLE_TICK_RATE);
        SlimeScheduler.runGlobalTimer(new TrailTick(), 0, 5);
        SlimeScheduler.runGlobalTimer(new ArmourRemove(), 0, SlimeTinker.RUNNABLE_TICK_RATE);
        SlimeScheduler.runGlobalLater(new FirstTick(), 1);
    }
}
