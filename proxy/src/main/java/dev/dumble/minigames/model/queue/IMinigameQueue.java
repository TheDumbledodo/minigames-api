package dev.dumble.minigames.model.queue;

import dev.dumble.minigames.model.MinigameData;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public interface IMinigameQueue {

    UUID getId();

    MinigameData getData();

    Set<QueueEntry> getEntries();

    int size();

    int getMaxTeams();

    boolean hasMinimumPlayers();

    void add(QueueEntry entry);

    void add(UUID uuid);

    void removeEntry(QueueEntry entry);

    void removePlayers(Collection<UUID> uuids);

    boolean leave(UUID uuid);

    void clear();

    boolean containsPlayer(UUID playerId);

    boolean isEmpty();
}
