package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRide {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("ride.xml");
		Ride r = c.getBean("ride",Ride.class);
		r.getV().start();
	}

}
