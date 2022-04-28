package com.myProject4.autoWiredAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop";
	}
}
