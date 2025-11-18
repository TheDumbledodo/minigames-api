package dev.dumble.minigames.event;

import dev.dumble.minigames.model.minigame.MinigameInstance;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Getter @Setter
public class MinigameInstanceSpawnLocationEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final UUID uuid;
    private final World world;
    private final MinigameInstance instance;

    private Location location;

    public MinigameInstanceSpawnLocationEvent(UUID uuid, World world, MinigameInstance instance) {
        super(true);

        this.uuid = uuid;
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
