package org.jsp.practicd;

public class Person {
String name;
int age;
public void display() {
	System.out.println("name "+name);
	System.out.println("age" + age);
}
public Person(){
	System.out.println("no argument constructor");
}

public Person(String name,int age) {
	this.name = name;
	this.age = age;
	System.out.println("iam argument constructor");
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
