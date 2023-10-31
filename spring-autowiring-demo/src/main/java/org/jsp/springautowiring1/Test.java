package org.jsp.springautowiring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("baby.xml");
	Baby b = context.getBean("baby",Baby.class);
	b.getIcecream().eat();
}
}
