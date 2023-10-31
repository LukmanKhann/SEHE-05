package org.jsp.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.springannotationdemo");
	Person p = context.getBean(Person.class);
	p.display();
	Hospital h = context.getBean(Hospital.class);
	h.display();
}

}
