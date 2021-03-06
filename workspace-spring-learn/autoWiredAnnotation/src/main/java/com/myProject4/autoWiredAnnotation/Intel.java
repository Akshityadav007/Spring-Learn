package com.myProject4.autoWiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Intel implements Cpu {
	
	@Autowired
	private Laptop laptop;
	
	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	@Override
	public void whichCpu() {
		System.out.println("This is Intel " + laptop);
	}
}
