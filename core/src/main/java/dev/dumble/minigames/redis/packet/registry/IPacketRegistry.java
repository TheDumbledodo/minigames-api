package dev.dumble.minigames.redis.packet.registry;

import dev.dumble.minigames.redis.packet.AbstractPacket;

public interface IPacketRegistry {

    void registerPacket(String key, Class<? extends AbstractPacket> clazz);

    <T extends AbstractPacket> Class<T> getPacketClass(String key);
}
