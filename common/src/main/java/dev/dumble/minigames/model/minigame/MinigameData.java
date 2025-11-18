package dev.dumble.minigames.model.minigame;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.dumble.minigames.model.minigame.setting.MinigameSetting;
import dev.dumble.minigames.model.minigame.setting.MinigameSettings;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.checkerframework.checker.index.qual.NonNegative;

import java.util.*;

@Getter
@ToString
@EqualsAndHashCode
public final class MinigameData {

    private final String key;
    private final Map<String, Object> settings;

    @JsonCreator
    public MinigameData(
            @JsonProperty("key") String key,
            @JsonProperty("settings") Map<String, Object> settings
    ) {
        this.key = key;
        this.settings = Map.copyOf(settings);
    }

    public <T> T get(MinigameSetting<T> property) {
        return (T) settings.get(property.key());
    }

    @JsonIgnore
    public Integer getMaxPlayers() {
        return get(MinigameSettings.MAX_PLAYERS);
    }

    @JsonIgnore
    public Integer getStartingPlayers() {
        return get(MinigameSettings.STARTING_PLAYERS);
    }

    @JsonIgnore
    public Integer getPlayersPerTeam() {
        return get(MinigameSettings.PLAYERS_PER_TEAM);
    }

    @JsonIgnore
    public List<String> getMaps() {
        return get(MinigameSettings.MAPS);
    }

    public static Builder builder(String key) {
        return new Builder(key);
    }

    public static final class Builder {

        private final String key;
        private final Map<String, Object> settings = new HashMap<>();

        private Builder(String key) {
            this.key = key;
        }

        public Builder players(
                @NonNegative int maxPlayers,
                @NonNegative int startingPlayers,
                @NonNegative int playersPerTeam
        ) {

            if (startingPlayers > maxPlayers) {
                throw new IllegalArgumentException("starting players cannot exceed max players");
            }

            if (playersPerTeam > maxPlayers) {
                throw new IllegalArgumentException("players per team cannot exceed max players");
            }

            settings.put(MinigameSettings.MAX_PLAYERS.key(), maxPlayers);
            settings.put(MinigameSettings.STARTING_PLAYERS.key(), startingPlayers);
            settings.put(MinigameSettings.PLAYERS_PER_TEAM.key(), playersPerTeam);

            return this;
        }

        public Builder maps(Collection<String> maps) {
            settings.put(MinigameSettings.MAPS.key(), new ArrayList<>(maps));
            return this;
        }

        public Builder maps(String... maps) {
            return maps(List.of(maps));
        }

        public <T> Builder setting(MinigameSetting<T> minigameSetting, T value) {
            settings.put(minigameSetting.key(), value);
            return this;
        }

        public MinigameData build() {
            return new MinigameData(key, settings);
        }
    }
}