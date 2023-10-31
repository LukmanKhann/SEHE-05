package org.jsp.springannotationdemo;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void start() {
		System.out.println("car has been started");
	}

}
