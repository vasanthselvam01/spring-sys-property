package com.springboot.sys.component;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class StartUpInit {
	
	@PostConstruct
	  public void init(){
	     System.out.println("This is post construct");
	  }

}
