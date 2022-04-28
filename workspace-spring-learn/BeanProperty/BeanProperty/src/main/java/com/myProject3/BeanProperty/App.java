package com.myProject3.BeanProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Laptop l = (Laptop) context.getBean("laptop");		// if new keyword was used it would have created new object and we don't want that
		System.out.println(l);
		
    }
}
