package org.jsp.lombokdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {

	private int id;
	private String name;
	private long phone ;
	private String email;
	private String password;
}
