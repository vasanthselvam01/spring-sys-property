package com.springboot.sys.component;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerExampleBean {
	
	public static int counter;
	
	@EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Increment counter");
        counter++;
    }

}
