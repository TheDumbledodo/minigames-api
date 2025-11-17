package dev.dumble.minigames.event;

import dev.dumble.minigames.model.queue.IMinigameQueue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public final class MinigameQueueLeaveEvent {

    private final UUID uuid;
    private final IMinigameQueue queue;
}