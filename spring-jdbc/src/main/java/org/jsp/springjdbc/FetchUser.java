package org.jsp.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FetchUser {
public static void main(String[] args) {
	ApplicationContext c = new ClassPathXmlApplicationContext("spring-demo.xml");
	JdbcTemplate t = c.getBean("jdbcTemplate",JdbcTemplate.class);
	String res = t.query("select * from user", new MyResultSetExtractor());
}
}

class MyResultSetExtractor implements ResultSetExtractor<String>{

	public String extractData(ResultSet rs) throws SQLException, DataAccessException {
		while(rs.next())
		{
			System.out.println("ID:" + rs.getInt(1));
			System.out.println("Phone:" + rs.getLong(2));
			System.out.println("EmailId:" + rs.getString(3));
			System.out.println("Password:" + rs.getString(4));
			System.out.println("-----------------");
		}
		return "the data has been printed";

	}
	
}
