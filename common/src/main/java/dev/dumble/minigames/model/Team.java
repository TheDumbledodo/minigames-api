package dev.dumble.minigames.model;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public record Team(List<UUID> members) implements Comparable<Team> {

    public Team(@NotNull List<UUID> members) {
        this.members = new ArrayList<>(members);
    }

    public int size() { return members.size(); }

    public static Team of(@NotNull List<UUID> members) {
        return new Team(members);
    }

    public static Team empty() {
        return new Team(new ArrayList<>());
    }

    @Override
    public int compareTo(@NotNull Team team) {
        return Integer.compare(team.size(), size());
    }
}