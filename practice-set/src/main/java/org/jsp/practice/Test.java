package org.jsp.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("baby.xml");
	Baby b = con.getBean("mybaby",Baby.class);
	b.getIce().eat();
}
}
