package dev.dumble.minigames.service;

import dev.dumble.minigames.model.*;
import dev.dumble.minigames.model.queue.IMinigameQueue;
import dev.dumble.minigames.model.queue.QueueEntry;
import dev.dumble.minigames.model.queue.QueueJoinResult;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IMinigameQueueService {

    QueueJoinResult join(QueueEntry entry, MinigameData data);

    boolean leave(UUID uuid);

    void beginMatch(IMinigameQueue queue);

    List<IMinigameQueue> getQueues(MinigameData data);

    List<IMinigameQueue> getQueues();

    Optional<IMinigameQueue> getQueue(UUID queueId);

    Optional<IMinigameQueue> getQueueByPlayer(UUID playerId);

    boolean isInQueue(UUID playerId);

    void remove(UUID id);
}