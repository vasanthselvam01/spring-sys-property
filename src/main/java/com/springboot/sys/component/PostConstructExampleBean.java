package com.springboot.sys.component;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

//@Component
public class PostConstructExampleBean {
	
	@Autowired
    private Environment env;

	@PostConstruct
    public void init() {
        System.out.println(Arrays.asList(env.getDefaultProfiles()));
    }

}
