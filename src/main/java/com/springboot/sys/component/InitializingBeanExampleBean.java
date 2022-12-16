package com.springboot.sys.component;

import java.util.Arrays;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

//@Component
public class InitializingBeanExampleBean implements InitializingBean{

	@Autowired
    private Environment env;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println(Arrays.asList(env.getDefaultProfiles()));
		
	}
	
	

}
