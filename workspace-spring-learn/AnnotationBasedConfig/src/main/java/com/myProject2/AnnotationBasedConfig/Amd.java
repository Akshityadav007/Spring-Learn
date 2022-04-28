package com.myProject2.AnnotationBasedConfig;

import org.springframework.stereotype.Component;

@Component													// 4)
public class Amd implements Cpu {
	
	@Override
	public void whichCpu() {
		System.out.println("This is Amd");
	}

}
