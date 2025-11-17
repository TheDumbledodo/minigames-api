package dev.dumble.minigames.event;

import dev.dumble.minigames.model.MinigameInstance;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@Getter
@RequiredArgsConstructor
public class MinigameInstanceDeleteEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final MinigameInstance instance;

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
