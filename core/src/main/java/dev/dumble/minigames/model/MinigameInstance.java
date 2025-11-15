package dev.dumble.minigames.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class MinigameInstance {

    @Include
    private final UUID uuid;

    private final MinigameData data;
    private final String map;

    private final List<Team> teams = new ArrayList<>();

    public void addTeam(Team team) {
        teams.add(team);
    }
}