package dev.dumble.minigames.redis.packet.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.dumble.minigames.redis.packet.AbstractPacket;
import dev.dumble.minigames.redis.packet.annotation.Packet;
import lombok.Getter;

import java.util.UUID;

@Getter
@Packet(name = "send_player")
public class SendPlayerPacket extends AbstractPacket {

    private final UUID uuid;
    private final String server;

    @JsonCreator
    public SendPlayerPacket(
            @JsonProperty("uuid") UUID uuid,
            @JsonProperty("server") String server
    ) {
        super("send_player");

        this.uuid = uuid;
        this.server = server;
    }
}