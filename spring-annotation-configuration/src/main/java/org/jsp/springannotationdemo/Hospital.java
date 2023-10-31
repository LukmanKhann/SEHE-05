package org.jsp.springannotationdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	private String name;
	private String founder;
	
	public Hospital(@Value(value = "JaydevaHospital") String name,@Value(value ="elon musk") String founder) {
		this.name = name;
		this.founder = founder;
	}
	public void display() {
		System.out.println("--------------------");
		System.out.println("Name :s"+ name);
		System.out.println("Founder :" + founder);
	}

}
