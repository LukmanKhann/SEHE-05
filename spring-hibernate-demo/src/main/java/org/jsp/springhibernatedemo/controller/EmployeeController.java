package org.jsp.springhibernatedemo.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.springhibernatedemo.dao.EmployeeDao;
import org.jsp.springhibernatedemo.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeController {
	static Scanner sc = new Scanner(System.in);
	static EmployeeDao dao;
	
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-template.xml");
		dao = context.getBean(EmployeeDao.class);
	}
          public static void main(String[] args) {
			System.out.println("1 - Registration");
			System.out.println("2 - Update");
			System.out.println("3 - Find");
			System.out.println("4 - Delete");
			System.out.println("5 - Find All");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:{
				save();
				break;
			}
			case 2:{
				update();
				break;
			}
			case 3:{
				find();
				break;
			}
			case 4:{
				delete(); 
				break;
			}
			case 5:{
				fetcall();
				break;
			}
				
			
		}
          }
          public static void save() {
        	  System.out.println("enter your name,designation and salary");
        	  String name = sc.next();
        	  String desg = sc.next();
        	  double salary = sc.nextDouble();
        	  Employee e = new Employee();
        	  e.setName(name);
        	  e.setDesg(desg);
        	  e.setSalary(salary);
        	  e = dao.save(e);
        	  System.out.println("Employee saved successfully");
          }
          public static void update() {
        	  System.out.println("Enter your id to update the record");
        	  int id = sc.nextInt();
        	  System.out.println("Enter your name,designation and salary");
        	  String name = sc.next();
        	  String desg = sc.next();
        	  double salary = sc.nextDouble();
        	  Employee e = new Employee();
        	  e.setId(id);
        	  e.setName(name);
        	  e.setDesg(desg);
        	  e.setSalary(salary);
        	  e = dao.update(e);
        	  System.out.println("Employee updated successfully");
        	  
          }
          public static void find() {
        	  System.out.println("Enter id to find the employee details");
        	  int id = sc.nextInt();
        	  Employee e = new Employee();
        	  e = dao.find(id);
        	  System.out.println(e);
        	  
          }
          public static void delete() {
        	  System.out.println("Enter your id to delete the record");
        	  int id = sc.nextInt();
        	  Employee e = new Employee();
        	  dao.delete(id);
        	  System.out.println("record deleted successfully");
          }
          public static void fetcall() {
        	  List<Employee> e = dao.findall();
        	  for(Employee emp:e) {
        		  System.out.println(emp);
        	  }
          }
          
}
