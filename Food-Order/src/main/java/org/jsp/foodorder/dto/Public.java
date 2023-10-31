package org.jsp.foodorder.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Public {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String name;
   private String location;
   @OneToMany(cascade = CascadeType.ALL,mappedBy = "pub")
   private List<FoodOrder> orders;
@Override
public String toString() {
	return "Public [id=" + id + ", name=" + name + ", location=" + location + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<FoodOrder> getOrders() {
	return orders;
}
public void setOrders(List<FoodOrder> orders) {
	this.orders = orders;
}
   

}
