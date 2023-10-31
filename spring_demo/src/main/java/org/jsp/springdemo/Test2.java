package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("pancard.xml");
		PanCardHolder h = c.getBean("mypersoncard",PanCardHolder.class);
		h.getCard().display();
	}

}
