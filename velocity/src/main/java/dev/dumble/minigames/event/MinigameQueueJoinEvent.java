package dev.dumble.minigames.event;

import dev.dumble.minigames.model.queue.IMinigameQueue;
import dev.dumble.minigames.model.queue.QueueEntry;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public final class MinigameQueueJoinEvent {

    private final QueueEntry entry;
    private final IMinigameQueue queue;
}