package dev.dumble.minigames.registry;

import dev.dumble.minigames.model.MinigameData;
import dev.dumble.minigames.model.MinigameKey;

import java.util.NavigableSet;
import java.util.Optional;
import java.util.Set;

public interface IMinigameRegistry {

    void registerMinigame(MinigameData data);

    Optional<MinigameData> getMinigame(String minigame, String mode);

    Optional<MinigameData> getMinigame(MinigameKey key);

    Optional<MinigameData> getMinigame(String minigame);

    NavigableSet<String> getMinigameModes(String minigame);

    Optional<String> getDefaultMode(String minigame);

    Set<String> getMinigames();
}