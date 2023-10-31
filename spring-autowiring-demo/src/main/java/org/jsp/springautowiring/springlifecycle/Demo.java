package org.jsp.springautowiring.springlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean,DisposableBean {
	static {
		System.out.println("Demo class is loaded to JVM memory");
	}
	Demo(){
		System.out.println("Demo object has been created");
	}
	public void destroy() throws Exception {
		System.out.println("Demo object is destroyed");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Demo method is initialized");
	}
	
	

}
