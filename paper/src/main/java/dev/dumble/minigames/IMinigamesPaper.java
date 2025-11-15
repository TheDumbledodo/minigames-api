package dev.dumble.minigames;

import dev.dumble.minigames.registry.IMinigameRegistry;
import dev.dumble.minigames.service.IMinigameInstanceService;

public interface IMinigamesPaper {

    IMinigameRegistry getMinigameRegistry();

    IMinigameInstanceService getMinigameInstanceService();
}