package dev.dumble.minigames.model.minigame.setting;

import java.util.List;

/**
 * Contains the default settings for a minigame.
 * <p>
 * These are core, predefined settings that every minigame can use.
 * Plugins can extend with additional {@link MinigameSetting}s if needed.
 */
public final class MinigameSettings {

    /**
     * The maximum number of players allowed in this minigame.
     * <p>
     * This represents the upper limit of participants.
     */
    public static final MinigameSetting<Integer> MAX_PLAYERS = new MinigameSetting<>("max_players");

    /**
     * The number of players that start the minigame initially.
     * <p>
     * This must be lower than {@link #MAX_PLAYERS}
     */
    public static final MinigameSetting<Integer> STARTING_PLAYERS = new MinigameSetting<>("starting_players");

    /**
     * The number of players per team.
     * <p>
     * If this is 1, the minigame is free-for-all. Values greater than 1 indicate team-based gameplay.
     */
    public static final MinigameSetting<Integer> PLAYERS_PER_TEAM = new MinigameSetting<>("players_per_team");

    /**
     * The set of available map names for this minigame.
     * <p>
     * Maps are represented by unique string identifiers. This can be used to randomize maps.
     */
    public static final MinigameSetting<List<String>> MAPS = new MinigameSetting<>("maps");
}