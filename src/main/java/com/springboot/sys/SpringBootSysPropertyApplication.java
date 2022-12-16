package com.springboot.sys;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSysPropertyApplication {

	public static void main(String[] args) {
		System.setProperty("app.title", "My Spring Application with system properties Hello World --");
		
		String filepath = System.getProperty("PropertiesFilePath");
					
		
		System.out.println("filepath = "+filepath);
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream(filepath));
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		System.setProperty("person.name", "john");
		
		SpringApplication.run(SpringBootSysPropertyApplication.class, args);
	}
	
	@EventListener(classes = {ApplicationFailedEvent.class})
	public void getSignal() {
		System.out.println("This is controller event listerner");
	}

}
