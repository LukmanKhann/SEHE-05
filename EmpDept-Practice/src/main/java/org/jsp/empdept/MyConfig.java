package org.jsp.empdept;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jsp.empdept")
public class MyConfig {
      @Bean
	public EntityManager geEntityManager() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
}
