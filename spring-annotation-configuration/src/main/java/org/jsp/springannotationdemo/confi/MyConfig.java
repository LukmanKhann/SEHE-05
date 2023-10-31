package org.jsp.springannotationdemo.confi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "org.jsp.springannotationdemo")
public class MyConfig {
     @Bean
	public List<String> getList(){
		return new ArrayList<String>(Arrays.asList("Lukman","Saif","Kaif"));
	}
     @Bean
     public Set<Integer> getSet(){
    	 Set<Integer>  set = new HashSet<Integer>();
    	 set.add(1);
    	 set.add(2);
    	 set.add(3);
    	 return set;
     }
}
