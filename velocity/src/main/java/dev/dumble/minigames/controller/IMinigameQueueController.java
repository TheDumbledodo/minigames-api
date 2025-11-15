package dev.dumble.minigames.controller;

import com.velocitypowered.api.proxy.Player;
import dev.dumble.minigames.model.MinigameKey;

public interface IMinigameQueueController {

    void join(Player player, MinigameKey key);

    void leave(Player player);
}