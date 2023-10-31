package org.jsp.springjdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class SaveUser2 {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("spring-demo.xml");
		JdbcTemplate t = c.getBean("jdbcTemplate",JdbcTemplate.class);
		String qry = "insert into user values (?,?,?,?)";
		int r = t.execute(qry, new MyPreparedStatementCallBack());
		System.out.println(r + " row are inserted");
	}
}

class MyPreparedStatementCallBack implements PreparedStatementCallback<Integer>{

	public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		ps.setInt(1,5);
		ps.setLong(2, 87878787L);
		ps.setString(3,"Yatish@gmail.com");
		ps.setString(4, "yatish1233");
		return ps.executeUpdate();

	}
	
}
