package dev.dumble.minigames;

import dev.dumble.minigames.controller.IMinigameQueueController;
import dev.dumble.minigames.registry.IMinigameRegistry;
import dev.dumble.minigames.service.IMinigameQueueService;

public interface IMinigamesVelocity {

    IMinigameQueueController getQueueController();

    IMinigameQueueService getQueueService();

    IMinigameRegistry getRegistry();
}