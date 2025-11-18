package dev.dumble.minigames.service;

import dev.dumble.minigames.model.minigame.MinigameData;

import java.util.UUID;

public interface IMinigameQueueService {

    void join(UUID uuid, MinigameData data);
}
