package org.jsp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCar {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("car.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Car c = (Car)factory.getBean(Car.class);
		c.start();
	}

}
