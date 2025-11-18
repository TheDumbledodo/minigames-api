package dev.dumble.minigames.model.minigame.setting;

import java.util.Objects;

public record MinigameSetting<T>(String key, T defaultValue) {

    public MinigameSetting {
        Objects.requireNonNull(key);
    }

    public MinigameSetting(String key) {
        this(key, null);
    }
}