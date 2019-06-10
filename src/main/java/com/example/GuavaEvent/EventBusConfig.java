package com.example.GuavaEvent;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

@Configuration
public class EventBusConfig {
    @Bean("sync")
    public EventBus createSyncBus()
    {
        return new EventBus();
    }

    @Bean("async")
    public EventBus createASyncBus()
    {
        return new AsyncEventBus(Executors.newCachedThreadPool());
    }
}
