package com.myProject3.BeanProperty;

import org.springframework.stereotype.Component;

@Component											
public class Intel implements Cpu {
	
	@Override
	public void whichCpu() {
		System.out.println("This is Intel");
	}
}