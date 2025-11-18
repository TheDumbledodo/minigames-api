package dev.dumble.minigames.model.minigame.setting;

import java.util.Objects;

public record MinigameSetting<T>(String key) {

    public MinigameSetting {
        Objects.requireNonNull(key);
    }
}