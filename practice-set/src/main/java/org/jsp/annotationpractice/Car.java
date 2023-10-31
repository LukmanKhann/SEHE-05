package org.jsp.annotationpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
  private Engine e ;

public Engine getE() {
	return e;
}

public void setE(Engine e) {
	this.e = e;
}
  
//	@Value(value = "BMW")
//	String name ;
//	@Value(value = "x7")
//	String model;
//public String getName() {
//		return name;
//	}
////@Value(value = "Tesla")
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getModel() {
//		return model;
//	}
////	@Value(value = "M5")
//	public void setModel(String model) {
//		this.model = model;
//	}
//public void start() {
//	System.out.println("car has been started");
//}
}
