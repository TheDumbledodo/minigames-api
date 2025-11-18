package dev.dumble.minigames.event;

import dev.dumble.minigames.model.minigame.MinigameInstance;
import lombok.Getter;
import org.bukkit.World;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@Getter
public class MinigameInstanceCreateEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final World world;
    private final MinigameInstance instance;

    public MinigameInstanceCreateEvent(World world, MinigameInstance instance) {
        super(true);

        this.world = world;
        this.instance = instance;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
