package info.xiantang.consumer.channel.impl;

import info.xiantang.consumer.channel.Channel;
import info.xiantang.consumer.event.MessageEvent;

public class JavaChannelImpl implements Channel {
    private String name = "java";


    @Override
    public void send(MessageEvent event) {
        System.out.println(event.getMessage());
    }

    @Override
    public String getName() {
        return name;
    }

}
