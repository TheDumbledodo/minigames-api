package dev.dumble.minigames.redis.packet;

@FunctionalInterface
public interface PacketListener<T extends AbstractPacket> {

    void onPacketReceive(T packet);
}