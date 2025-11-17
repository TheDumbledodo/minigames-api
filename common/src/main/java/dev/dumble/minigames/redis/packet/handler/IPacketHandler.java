package dev.dumble.minigames.redis.packet.handler;

import dev.dumble.minigames.redis.packet.AbstractPacket;
import dev.dumble.minigames.redis.packet.PacketListener;

import java.util.Set;

public interface IPacketHandler {

    <T extends AbstractPacket> void registerListener(Class<T> clazz, PacketListener<T> listener);

    Set<PacketListener<? extends AbstractPacket>> getSubscribers(Class<? extends AbstractPacket> clazz);
}
