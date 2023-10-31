package org.jsp.annotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRide {
public static void main(String[] args) {
	ApplicationContext con = new AnnotationConfigApplicationContext("org.jsp.annotationpractice");
	Ride r = con.getBean(Ride.class);
	r.getV().start();
}
}
