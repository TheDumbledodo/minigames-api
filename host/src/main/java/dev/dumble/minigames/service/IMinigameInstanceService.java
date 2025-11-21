package dev.dumble.minigames.service;

import dev.dumble.minigames.model.minigame.MinigameInstance;
import org.bukkit.World;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface IMinigameInstanceService {

    CompletableFuture<World> create(MinigameInstance instance);

    CompletableFuture<Void> close(MinigameInstance instance);

    Optional<MinigameInstance> getInstanceByPlayer(UUID playerId);

    Optional<UUID> getInstanceIdByPlayer(UUID playerId);

    Optional<MinigameInstance> getInstance(UUID uuid);

    Optional<World> getWorldByMinigameId(UUID minigameId);
}