package io.github.sefiraat.slimetinker.scheduler;

import com.tcoded.folialib.FoliaLib;
import com.tcoded.folialib.enums.EntityTaskResult;
import com.tcoded.folialib.wrapper.task.WrappedTask;
import io.github.sefiraat.slimetinker.SlimeTinker;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public final class SlimeScheduler {

    private static FoliaLib foliaLib;

    private SlimeScheduler() {
    }

    public static void init(@Nonnull SlimeTinker plugin) {
        foliaLib = new FoliaLib(plugin);
    }

    public static void shutdown() {
        if (foliaLib != null) {
            foliaLib.getScheduler().cancelAllTasks();
        }
        foliaLib = null;
    }

    @Nonnull
    public static FoliaLib lib() {
        return foliaLib;
    }

    public static boolean isFolia() {
        return foliaLib != null && foliaLib.isFolia();
    }

    public static CompletableFuture<Void> runGlobal(@Nonnull Runnable runnable) {
        return foliaLib.getScheduler().runNextTick(task -> runnable.run());
    }

    public static WrappedTask runGlobalLater(@Nonnull Runnable runnable, long delayTicks) {
        return foliaLib.getScheduler().runLater(runnable, delayTicks);
    }

    public static WrappedTask runGlobalTimer(@Nonnull Runnable runnable, long delayTicks, long periodTicks) {
        return foliaLib.getScheduler().runTimer(runnable, delayTicks, periodTicks);
    }

    public static CompletableFuture<Void> runAsync(@Nonnull Runnable runnable) {
        return foliaLib.getScheduler().runAsync(task -> runnable.run());
    }

    public static WrappedTask runAsyncLater(@Nonnull Runnable runnable, long delayTicks) {
        return foliaLib.getScheduler().runLaterAsync(runnable, delayTicks);
    }

    public static WrappedTask runAsyncTimer(@Nonnull Runnable runnable, long delayTicks, long periodTicks) {
        return foliaLib.getScheduler().runTimerAsync(runnable, delayTicks, periodTicks);
    }

    public static CompletableFuture<EntityTaskResult> runAtEntity(@Nonnull Entity entity, @Nonnull Runnable runnable) {
        return foliaLib.getScheduler().runAtEntity(entity, task -> runnable.run());
    }

    public static WrappedTask runAtEntityLater(@Nonnull Entity entity, @Nonnull Runnable runnable, long delayTicks) {
        return foliaLib.getScheduler().runAtEntityLater(entity, runnable, delayTicks);
    }

    public static WrappedTask runAtEntityTimer(@Nonnull Entity entity, @Nonnull Runnable runnable, long delayTicks, long periodTicks) {
        return foliaLib.getScheduler().runAtEntityTimer(entity, runnable, delayTicks, periodTicks);
    }

    public static CompletableFuture<Void> runAtLocation(@Nonnull Location location, @Nonnull Runnable runnable) {
        return foliaLib.getScheduler().runAtLocation(location, task -> runnable.run());
    }

    public static WrappedTask runAtLocationLater(@Nonnull Location location, @Nonnull Runnable runnable, long delayTicks) {
        return foliaLib.getScheduler().runAtLocationLater(location, runnable, delayTicks);
    }

    public static WrappedTask runAtLocationTimer(@Nonnull Location location, @Nonnull Runnable runnable, long delayTicks, long periodTicks) {
        return foliaLib.getScheduler().runAtLocationTimer(location, runnable, delayTicks, periodTicks);
    }

}
