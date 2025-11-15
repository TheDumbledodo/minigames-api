package dev.dumble.minigames.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@AllArgsConstructor
public class MinigameSettings {

    private int maxPlayers;
    private int startingPlayers;
    private int teamSize;
}