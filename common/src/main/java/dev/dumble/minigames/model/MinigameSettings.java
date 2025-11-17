package dev.dumble.minigames.model;

import lombok.*;
import lombok.EqualsAndHashCode.Exclude;

import java.util.Set;

@Getter @Setter
@ToString
@Builder
@EqualsAndHashCode
public class MinigameSettings {

    private int maxPlayers;
    private int startingPlayers;
    private int teamSize;

    @Exclude
    private Set<String> maps;
}