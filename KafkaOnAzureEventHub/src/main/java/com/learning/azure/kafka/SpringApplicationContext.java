package com.learning.azure.kafka;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//import org.springframework.security.web.header.writers.frameoptions.StaticAllowFromStrategy;

public class SpringApplicationContext implements ApplicationContextAware {

	private static ApplicationContext CONTEXT;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		CONTEXT = applicationContext;
	}

	public static Object getbean(String beanName) {
		return CONTEXT.getBean(beanName);
	}
}
