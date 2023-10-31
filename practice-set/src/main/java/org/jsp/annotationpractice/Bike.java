package org.jsp.annotationpractice;

import org.springframework.stereotype.Component;

@Component(value = "bike")
public class Bike implements Vehicle {

	public void start() {
System.out.println("Bike has been started");		
	}

}
