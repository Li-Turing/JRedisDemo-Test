package com.example.GuavaEvent.impl;

import lombok.Data;

@Data
public class TestEvent {
    private String a;

    public TestEvent(String aa) {
        this.a = aa;
    }
}
