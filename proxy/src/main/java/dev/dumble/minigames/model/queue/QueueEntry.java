package dev.dumble.minigames.model.queue;

import lombok.Getter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Getter
@ToString
public class QueueEntry implements Comparable<QueueEntry> {

    private final List<UUID> members;

    public QueueEntry(List<UUID> members) {
        this.members = new ArrayList<>(members);
    }

    public boolean remove(UUID uuid) {
        return members.remove(uuid);
    }

    public int size() {
        return members.size();
    }

    public boolean contains(UUID uuid) {
        return members.contains(uuid);
    }

    public static QueueEntry of(@NotNull UUID... members) {
        return new QueueEntry(Arrays.asList(members));
    }

    public static QueueEntry of(@NotNull List<UUID> members) {
        return new QueueEntry(members);
    }

    public static QueueEntry empty() {
        return new QueueEntry(List.of());
    }

    @Override
    public int compareTo(@NotNull QueueEntry entry) {
        return Integer.compare(entry.size(), size());
    }
}