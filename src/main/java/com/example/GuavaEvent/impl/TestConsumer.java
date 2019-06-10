package com.example.GuavaEvent.impl;

import com.example.GuavaEvent.ASyncConsumer;
import com.example.GuavaEvent.SyncConsumer;
import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer extends ASyncConsumer {
    @Subscribe
    public boolean processExpiringEvent(TestEvent event) {

        //TODO process code
        System.out.println("event.a:" + event.getA());
        return true;
    }

    @Subscribe
    public boolean processExpiringEvent1(String event) {

        //TODO process code
        System.out.println("event.a:" + event);
        System.out.println("Process Thread:"+Thread.currentThread().getId());
        return true;
    }
}
