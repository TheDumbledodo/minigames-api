package dev.dumble.minigames;

import dev.dumble.minigames.service.IMinigameQueueService;

public interface IMinigamesHub {

    IMinigameQueueService getQueueService();
}