package org.jsp.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SaveUser {
public static void main(String[] args) {
	ApplicationContext c = new ClassPathXmlApplicationContext("spring-demo.xml");
	JdbcTemplate t = c.getBean("jdbcTemplate",JdbcTemplate.class);
	t.execute("insert into user values(1,4569,'khan@gmail.com','abc123')");
	System.out.println("User saved");
}

}
