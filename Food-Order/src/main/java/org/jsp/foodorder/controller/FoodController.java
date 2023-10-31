package org.jsp.foodorder.controller;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.jsp.foodorder.MyConfig;
import org.jsp.foodorder.dao.FoodDao;
import org.jsp.foodorder.dao.PublicDao;
import org.jsp.foodorder.dto.FoodOrder;
import org.jsp.foodorder.dto.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class FoodController {
     
	static Scanner sc = new Scanner(System.in);
	
	@Autowired
	private EntityManager manager;
	
	static FoodDao fdao;
	static PublicDao pdao;
	
	static {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		fdao = context.getBean(FoodDao.class);
	}
	static {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		pdao = context.getBean(PublicDao.class);
	}
	
	public static void main(String[] args) {
		System.out.println("1 - Register public");
		System.out.println("2 - update public");
		System.out.println("3 - add food order");
		System.out.println("4 - update food order");
		System.out.println("5 - find food order");
		System.out.println("6 - delete food order");
		System.out.println("7 - verify food order by name and location");
		System.out.println("8 - verify food order by public id");
		System.out.println("9 - verify public by food name");
		System.out.println("10 - verify by public food id");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:{
			savePublic();
			
			break;
		}
		case 2:{
			updatePublic();
			break;
		}
		case 3:{
			saveFood();
			break;
		}
		case 4:{
			updateFood();
			break;
		}
		case 5:{
			findFood();
			break;
		}
		case 6:{
			deleteFood();
			break;
		}
		case 7:{
			verifyfoodbynamelocation(); 
			break;
		}
		case 8:{
			verifyfoodbypublicid();
			break;
		}
		case 9:{
			verifypublicbyfoodname();
			break;
		}
		case 10:{
			verifypublicbyfoodid();
			
			break;
		}
		}
	}
	
	public static void savePublic() {
		System.out.println("enter your name and location");
		String name = sc.next();
		String location = sc.next();
		Public p = new Public();
		p.setName(name);
		p.setLocation(location);
		p = pdao.savePublic(p);
		System.out.println("Person save");
	}
	public static void updatePublic() {
		System.out.println("Enter your id to update the record");
		int id = sc.nextInt();
		System.out.println("enter your name and location");
		String name = sc.next();
		String location = sc.next();
		Public p = new Public();
		p.setId(id);
		p.setName(name);
		p.setLocation(location);
		p = pdao.updatePublic(p);
		System.out.println("Person updated successfully");
	}
	public static void saveFood() {
		System.out.println("Enter your public id to add food");
		int pid = sc.nextInt();
		System.out.println("enter your food item and price");
		String food = sc.next();
		double price = sc.nextDouble();
		FoodOrder f = new FoodOrder();
		f.setFooditem(food);
		f.setPrice(price);
		f = fdao.saveFood(f, pid);
		System.out.println("order added successfully");
	}
	public static void updateFood() {
		System.out.println("Enter your public id to update the food order");
		int pid = sc.nextInt();
		System.out.println("Now Enter your food id to update");
		int fid = sc.nextInt();
		System.out.println("enter your food item and price");
		String food = sc.next();
		double price = sc.nextDouble();
		FoodOrder f = new FoodOrder();
		f.setId(fid);
		f.setOrder_time(LocalDate.now());
		f.setFooditem(food);
		f.setPrice(price);
		f = fdao.updateFood(f, fid);
		System.out.println("Food order updated successfully");
	}
	public static void findFood() {
		System.out.println("Enter your public id to verify order");
		int pid = sc.nextInt();
		System.out.println("Enter your Food id now for verification");
		int fid = sc.nextInt();
		FoodOrder f = new FoodOrder();
		f = fdao.findOrder(pid, fid);
		
	}
	public static void deleteFood() {
		System.out.println("Enter your public id to delete food order");
		int pid = sc.nextInt();
		System.out.println("Now enter your food id to delete food order");
		int fid = sc.nextInt();
		FoodOrder f = new FoodOrder();
		fdao.deleteOrder(pid, fid);
		System.out.println("Food order deleted successfully");
	}
	public static void verifyfoodbynamelocation() {
		System.out.println("Enter your name and location to verify");
		String name = sc.next();
		String location = sc.next();
		FoodOrder f = new FoodOrder();
		f = fdao.verifyfoodbypublicnameandlocation(name, location);
		
	}
	public static void verifyfoodbypublicid() {
		System.out.println("Enter your public id to verify food order details");
		int id = sc.nextInt();
		FoodOrder f = new FoodOrder();
		f = fdao.verifybypublicid(id);
		
	}
	public static void verifypublicbyfoodname() {
		System.out.println("Enter food name to verify public details");
		String name = sc.next();
		Public p = new Public();
		p = pdao.findpublicbyfoodname(name);
	}
	public static void verifypublicbyfoodid() {
		System.out.println("Enter your food id to verify public");
		int id = sc.nextInt();
		Public p  = new Public();
		p = pdao.findpublicbyfoodid(id);
	}
}
