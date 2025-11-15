package dev.dumble.minigames.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public final class MinigameData {

    private final MinigameKey key;
    private final MinigameSettings settings;
}