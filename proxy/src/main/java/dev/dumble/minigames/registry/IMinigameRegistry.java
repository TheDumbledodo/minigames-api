package dev.dumble.minigames.registry;

import java.util.Set;

public interface IMinigameRegistry {

    void registerMinigame(String minigame);

    boolean hasMinigame(String minigame);

    Set<String> getMinigames();
}