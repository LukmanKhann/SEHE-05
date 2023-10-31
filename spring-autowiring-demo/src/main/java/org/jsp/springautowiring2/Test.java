package org.jsp.springautowiring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("engine.xml");
		Engine e = context.getBean("engine",Engine.class);
		e.getV().start();
	}

}
