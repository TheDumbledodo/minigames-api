package dev.dumble.minigames;

import dev.dumble.minigames.controller.IMinigameInstanceController;
import dev.dumble.minigames.registry.IMinigameRegistry;
import dev.dumble.minigames.service.IMinigameInstanceService;

public interface IMinigamesHost {

    IMinigameRegistry getMinigameRegistry();

    IMinigameInstanceController getMinigameInstanceController();

    IMinigameInstanceService getMinigameInstanceService();
}