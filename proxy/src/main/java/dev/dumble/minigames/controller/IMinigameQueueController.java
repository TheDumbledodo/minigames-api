package dev.dumble.minigames.controller;

import com.velocitypowered.api.proxy.Player;
import dev.dumble.minigames.model.MinigameData;

public interface IMinigameQueueController {

    void join(Player player, MinigameData data);

    void leave(Player player);
}