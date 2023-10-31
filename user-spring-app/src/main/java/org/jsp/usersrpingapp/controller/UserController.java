package org.jsp.usersrpingapp.controller;

import java.util.Scanner;

import org.jsp.usersrpingapp.UserConfig;
import org.jsp.usersrpingapp.dao.UserDao;
import org.jsp.usersrpingapp.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {
       static Scanner sc = new Scanner(System.in);
       static UserDao dao ;
       
       static {
    	   ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
    	  dao =  context.getBean(UserDao.class);
       }
       public static void main(String[] args) {
		System.out.println("1. Registration");
		System.out.println("2. Update");
		System.out.println("3. Find by Id");
		System.out.println("4. Delete User");
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


			
			
		}
	}
       public static void save() {
    	   System.out.println("enter your name,phone,email and password");
    	   String name = sc.next();
    	   long phone = sc.nextLong();
    	   String email = sc.next();
    	   String password = sc.next();
    	   User u = new User();
    	   u.setName(name);
    	   u.setPhone(phone);
    	   u.setEmail(email);
    	   u.setPassword(password);
    	   u = dao.saveuser(u);
    	   System.out.println("User is saved with id :"+u.getId());
       }
       public static void update() {
    	   System.out.println("Enter your id to update the record");
    	   int id = sc.nextInt();
    	   System.out.println("Enter yout name,phone,email and password");
    	   String name = sc.next();
    	   long phone = sc.nextLong();
    	   String email = sc.next();
    	   String password = sc.next();
    	   User u = new User();
    	   u.setId(id);
    	   u.setName(name);
    	   u.setPassword(password);
    	   u.setPhone(phone);
    	   u.setEmail(email);
    	   u = dao.updateuser(u);
    	   System.out.println("User Updated");
       }
       public static void find() {
    	   System.out.println("Enter your id to find the user");
    	   int id = sc.nextInt();
    	   User u = new User();
    	   u = dao.finduser(id);
       }
       public static void delete() {
    	   System.out.println("enter your id to delete the user");
    	   int id = sc.nextInt();
    	   User u = new User();
    	       dao.deleteuser(id);
    	       System.out.println("Record deleted successfull");
       }
       public static void findall() {
    
       }
}
