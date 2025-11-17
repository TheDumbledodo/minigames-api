package dev.dumble.minigames.event;

import dev.dumble.minigames.model.MinigameInstance;
import lombok.Getter;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@Getter
public class MinigameInstanceJoinEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final World world;
    private final MinigameInstance instance;

    public MinigameInstanceJoinEvent(Player player, World world, MinigameInstance instance) {
        this.player = player;
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
