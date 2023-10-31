package org.jsp.annotationpractice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "scooty")
@Primary
public class Scooty implements Vehicle {

	public void start() {
 System.out.println("Scooty started");		
	}

}
