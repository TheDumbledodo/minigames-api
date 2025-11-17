package dev.dumble.minigames.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public final class MinigameData {

    private final String key;
    private final MinigameSettings settings;
}