package com.myProject2.AnnotationBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Cpu obj = (Cpu) context.getBean("amd");
		obj.whichCpu();
		
	}
}
