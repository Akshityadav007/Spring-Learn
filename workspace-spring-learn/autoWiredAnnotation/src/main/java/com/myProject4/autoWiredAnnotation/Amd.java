package com.myProject4.autoWiredAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Amd implements Cpu {
	@Override
	public void whichCpu() {
		System.out.println("This is Amd");
	}
}
