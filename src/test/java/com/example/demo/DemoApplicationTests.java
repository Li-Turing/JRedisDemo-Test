package com.example.demo;

import com.example.EventBus.AppListener;
import com.example.GuavaEvent.impl.TestEvent;
import com.google.common.eventbus.EventBus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.Reactor;
import reactor.event.Event;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	@Qualifier("sync")
	private EventBus eventbus;

	@Test
	public void contextLoads() {

	}

	@Autowired
	private Reactor reactor;

	@Test
	public void sendEvent()
	{
		//reactor.notify(Event.wrap("123"));
		//reactor.notify("myevent",Event.wrap("123"));
		eventbus.post(new TestEvent("obj"));
		eventbus.post("stirng");
	}
}
