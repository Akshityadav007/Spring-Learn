package com.myProject4.autoWiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Intel obj = (Intel) context.getBean("intel");
		obj.whichCpu();
	}

}
