package dev.dumble.minigames.redis;

import dev.dumble.minigames.redis.packet.AbstractPacket;
import org.jetbrains.annotations.NotNull;

public interface IRedisPacketService {

    void connect();

    void send(@NotNull AbstractPacket packet);

    void close();
}