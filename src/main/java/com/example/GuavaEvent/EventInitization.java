package com.example.GuavaEvent;


import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EventInitization implements InitializingBean {

    @Autowired
    @Qualifier("sync")
 	private EventBus syncEventbus;

    @Autowired
    @Qualifier("async")
    private EventBus asyncEventbus;


    @Autowired
    private ApplicationContext context;

    @Override
    public void afterPropertiesSet() throws Exception {

        Map<String, SyncConsumer> syncComsumers= context.getBeansOfType(SyncConsumer.class);
        syncComsumers.forEach((a,b)->{
            syncEventbus.register(b);
        });

        Map<String, ASyncConsumer> asyncComsumers= context.getBeansOfType(ASyncConsumer.class);
        asyncComsumers.forEach((a,b)->{
            asyncEventbus.register(b);
        });
    }
}
