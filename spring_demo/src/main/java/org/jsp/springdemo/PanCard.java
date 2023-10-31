package org.jsp.springdemo;

public class PanCard {
	private String name;
	private String number;
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("PanCard Number :"+number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
