package org.jsp.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
	Department d = con.getBean(Department.class);
	System.out.println(d.getNames());
	System.out.println(d.getIds());
	
}
}
