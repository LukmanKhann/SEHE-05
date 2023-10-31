package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("dept.xml");
		Department d = c.getBean("dept",Department.class);
		System.out.println(d.getNames());
		System.out.println(d.getIds());
		System.out.println(d.getDetails());
	}

}
