package dev.dumble.minigames;

import dev.dumble.minigames.redis.IRedisPacketService;
import dev.dumble.minigames.redis.packet.handler.IPacketHandler;
import dev.dumble.minigames.redis.packet.registry.IPacketRegistry;

public interface IMinigames {

    IRedisPacketService getRedisPacketService();

    IPacketHandler getPacketHandler();

    IPacketRegistry getPacketRegistry();
}