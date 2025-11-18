package dev.dumble.minigames.model.minigame;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.dumble.minigames.model.Team;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
public class MinigameInstance {

    @Include
    private final UUID id;

    private final MinigameData data;
    private final String map;

    private final List<Team> teams;

    @JsonCreator
    public MinigameInstance(
            @JsonProperty("id") UUID id,
            @JsonProperty("data") MinigameData data,
            @JsonProperty("map") String map,
            @JsonProperty("teams") List<Team> teams
    ) {
        this.id = id;
        this.data = data;
        this.map = map;
        this.teams = teams != null ? new ArrayList<>(teams) : new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }
}