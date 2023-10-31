package org.jsp.springautowiring.springlifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestLifeCycleByBeanFactory {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("lifecycle.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println(factory.getBean("demo"));
		System.out.println(factory.getBean("demo"));
		System.out.println(factory.getBean("demo"));
	}

}
