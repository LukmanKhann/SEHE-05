package org.jsp.springannotationdemo.di;

import org.springframework.stereotype.Component;

@Component(value = "train")
public class Train implements Vehicle {

	public void start() {
System.out.println("Train is started");		
	}
	

}
