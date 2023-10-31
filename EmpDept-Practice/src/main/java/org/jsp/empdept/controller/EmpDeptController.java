package org.jsp.empdept.controller;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.jsp.empdept.MyConfig;
import org.jsp.empdept.dao.DepartmentDao;
import org.jsp.empdept.dao.EmployeeDao;
import org.jsp.empdept.dto.Department;
import org.jsp.empdept.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class EmpDeptController {
static Scanner sc  = new Scanner(System.in);

static EmployeeDao edao;
static DepartmentDao ddao;
 
@Autowired
  private EntityManager manager;

static {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	edao = context.getBean(EmployeeDao.class);
}
static {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	ddao = context.getBean(DepartmentDao.class);
}

public static void main(String[] args) {
	System.out.println("1 - Register Employee");
	System.out.println("2 - Update Employee");
	System.out.println("3 - find Employee");
	System.out.println("4 - delete Employee");
	System.out.println("5 - register Department");
	System.out.println("6 - update Department");
	int choice = sc.nextInt();
	 
	switch (choice) {
	case 1:{
		saveEmployee();
		break;
	}
	case 2:{
		updateEmployee();
		break;
	}
	case 3:{
		findEmp();
		break;
	}
	case 4:{
		deleteEmp();
		break;
	}
	case 5:{
		saveDept();
		break;
	}
	case 6:{
		updateDept();
		break;
	}
	}	
	
}

public static void saveEmployee() {
	System.out.println("Enter dept id to save the employee");
	int did = sc.nextInt();
	System.out.println("Enter your name,email,age and phone");
	String name = sc.next();
	String email = sc.next();
	int age = sc.nextInt();
	long phone = sc.nextLong();
	
	Employee e = new Employee();
	e.setName(name);
	e.setEmail(email);
	e.setAge(age);
	e.setPhone(phone);
	e = edao.saveEmp(e, did);
	System.out.println("employee save successfully");
	
}
	public static void updateEmployee() {
		System.out.println("Enter dept id to update employee");
		int did = sc.nextInt();
		System.out.println("Enter employee id ");
		int eid = sc.nextInt();
		System.out.println("Enter your name,email,age and phone");
		
		String name = sc.next();
		String email = sc.next();
		int age = sc.nextInt();
		long phone = sc.nextLong();
		Employee e = new  Employee();
		e.setOrdertime(LocalDate.now());
		e.setId(eid);
		e.setName(name);
		e.setEmail(email);
		e.setAge(age);
		e.setPhone(phone);
		e = edao.updateEmp(e, eid);
		System.out.println("emplyee updated successfully");
		
	}
public static void findEmp() {
	System.out.println("Enter dept id to find the employee details");
	int did = sc.nextInt();
	System.out.println("Enter employee id to find employee");
	int eid = sc.nextInt();
	Employee e = new Employee();
	e = edao.findEmp(did,eid);
	System.out.println(e);
}
public static void deleteEmp() {
	System.out.println("enter Dept id to delete the employee");
	int did = sc.nextInt();
	System.out.println("Enter you employee id to delete employee");
	int eid = sc.nextInt();
	Employee e = new Employee();
	edao.deleteEmp(did,eid);
	System.out.println("Employee deleted successfully");
}

public static void saveDept() {
	System.out.println("Enter your location and depcode");
	String location = sc.next();
	String depcode = sc.next();
      Department d = new Department();
      d.setLocation(location);
      d.setDepcode(depcode);
      d = ddao.saveDept(d);
      System.out.println("Department registered");
}
public static void updateDept() {
	System.out.println("enter dept id to update the department");
	int did = sc.nextInt();
	System.out.println("enter your location and depcode");
	String location = sc.next();
	String depcode = sc.next();
        Department d  = new Department();
        d.setId(did);
        d.setLocation(location);
        d.setDepcode(depcode);
        d = ddao.updateDept(d);
        System.out.println("Department updated successfull");
}
}
