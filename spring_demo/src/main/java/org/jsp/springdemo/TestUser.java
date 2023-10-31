package org.jsp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestUser {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("car.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		User u = factory.getBean("myuser",User.class);
		u.display();
	}

}
