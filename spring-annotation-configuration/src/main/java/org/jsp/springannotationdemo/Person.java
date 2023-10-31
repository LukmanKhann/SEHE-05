package org.jsp.springannotationdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Person {
     private String name;
     @Value(value = "20")
     private int age;
    public void display() {
    	System.out.println("Name :"+name);
    	System.out.println("Age :"+age);
    }
	public String getName() {
		return name;
	}
	@Value(value = "Lukman")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
    
}
