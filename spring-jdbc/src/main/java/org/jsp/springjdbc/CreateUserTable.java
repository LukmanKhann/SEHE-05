package org.jsp.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateUserTable {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-demo.xml");
	JdbcTemplate t = context.getBean("jdbcTemplate",JdbcTemplate.class);
	t.execute("create table user (id int not null, phone bigint(30) not null, email varchar(40) not null, password varchar(20) not null, primary key(id))");
	System.out.println("Tabel Created Successfully");
}
}
