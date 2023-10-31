package org.jsp.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jsp.config")
public class MyConfig {
	@Bean
	public List<String> getList (){
		return new ArrayList<String>(Arrays.asList("Lukmna","Saif","Kaif"));
	}
	@Bean
	public Set<Integer> geSet(){
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(3);
		s.add(6);
		return s;
	}

}
