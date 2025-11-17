package dev.dumble.minigames.model;

import lombok.*;

import java.util.Set;

@Getter @Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class MinigameSettings {

    private int maxPlayers;
    private int startingPlayers;
    private int teamSize;

    private Set<String> maps;

    public MinigameSettings(int maxPlayers, int startingPlayers, int teamSize, String... maps) {
        this(maxPlayers, startingPlayers, teamSize, Set.of(maps));
    }
}