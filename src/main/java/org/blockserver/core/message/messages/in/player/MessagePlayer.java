package org.blockserver.core.message.messages.in.player;

import lombok.Getter;
import org.blockserver.core.message.Message;
import org.blockserver.core.module.modules.player.Player;

/**
 * Written by Exerosis!
 */
public class MessagePlayer extends Message {
    @Getter private Player player;

    public MessagePlayer(Player player) {
        super(player.getAddress());
        this.player = player;
    }

    public void setPlayer(Player player) {
        this.player = player;
        setAddress(player.getAddress());
    }
}
