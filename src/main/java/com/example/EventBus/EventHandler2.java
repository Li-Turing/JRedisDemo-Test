package com.example.EventBus;

import com.google.common.eventbus.AsyncEventBus;
import io.lettuce.core.event.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.Reactor;
import reactor.event.Event;
import reactor.spring.annotation.Consumer;
import reactor.spring.annotation.Selector;

@Consumer
public class EventHandler2 {
    //必须注入eventBus
    @Autowired
    private Reactor reactor;

    //@Selector注解的value属性填写消息名称
    @Selector(value = "myevent")
    public void processMrPrepare5Mi(Event ev) {
        //ev.getData()方法用于获取传入参数
    }
}
