package dev.dumble.minigames.redis.packet;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public abstract class AbstractPacket {

    private final String key;
    private String sender;
}