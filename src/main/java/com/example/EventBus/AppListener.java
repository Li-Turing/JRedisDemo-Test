package com.example.EventBus;

import org.springframework.stereotype.Service;
import reactor.event.Event;
import reactor.function.Consumer;

@Service
public class AppListener implements Consumer<Event<String>> {


    public void accept(Event<String> event) {

    }
}