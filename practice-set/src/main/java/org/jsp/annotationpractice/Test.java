package org.jsp.annotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext con = new AnnotationConfigApplicationContext("org.jsp.annotationpractice");
	Car c = con.getBean(Car.class);
	c.getE().start();
	
//	Car c = con.getBean(Car.class);
//	c.start();
//	System.out.println(c.getName());
//	System.out.println(c.getModel());
}
}
