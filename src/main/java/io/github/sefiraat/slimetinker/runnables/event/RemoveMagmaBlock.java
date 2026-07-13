package io.github.sefiraat.slimetinker.runnables.event;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class RemoveMagmaBlock implements Runnable {

    private final Block block;

    public RemoveMagmaBlock(Block block) {
        this.block = block;
    }

    @Override
    public void run() {
        block.setType(Material.LAVA);
    }
}
