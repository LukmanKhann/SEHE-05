package org.jsp.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
 public void start() {
	 System.out.println("Engine started");
 }
}
