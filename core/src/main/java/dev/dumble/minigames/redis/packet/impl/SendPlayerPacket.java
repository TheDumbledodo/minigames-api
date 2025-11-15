package dev.dumble.minigames.redis.packet.impl;

import dev.dumble.minigames.redis.packet.AbstractPacket;
import dev.dumble.minigames.redis.packet.annotation.Packet;
import lombok.Getter;

import java.util.UUID;

@Getter
@Packet(name = "send_player")
public class SendPlayerPacket extends AbstractPacket {

    private final UUID uuid;
    private final String server;

    public SendPlayerPacket(UUID uuid, String server) {
        super("send_player");

        this.uuid = uuid;
        this.server = server;
    }
}