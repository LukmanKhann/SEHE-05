package org.jsp.practicd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
     ApplicationContext con = new ClassPathXmlApplicationContext("car.xml");
     Engine e = con.getBean("myengine",Engine.class);
     e.getV().start();
     
     
//     Car c = con.getBean("mycar",Car.class);
//     c.start();
//     Person p = con.getBean("myperson",Person.class);
//     Bus b = con.getBean("mybus ",Bus.class);
//     b.getE().start();
//     p.display();    
//     System.out.println(p.getAge());
//     System.out.println(p.getName());
//     p.display();
     
     
}
}
