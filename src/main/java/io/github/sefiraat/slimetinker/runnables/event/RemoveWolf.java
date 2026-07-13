package io.github.sefiraat.slimetinker.runnables.event;

import org.bukkit.entity.Wolf;

public class RemoveWolf implements Runnable {

    private final Wolf wolf;

    public RemoveWolf(Wolf wolf) {
        this.wolf = wolf;
    }

    @Override
    public void run() {
        if (wolf.isValid()) {
            wolf.remove();
        }
    }
}
