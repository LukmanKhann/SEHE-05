package org.jsp.foodorder.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String fooditem;
private double price;
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@CreationTimestamp
private LocalDate order_time;
@UpdateTimestamp
private LocalDate delivery_time;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn
private Public pub;
public Public getPub() {
	return pub;
}
public void setPub(Public pub) {
	this.pub = pub;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFooditem() {
	return fooditem;
}
public void setFooditem(String fooditem) {
	this.fooditem = fooditem;
}
public LocalDate getOrder_time() {
	return order_time;
}
public void setOrder_time(LocalDate order_time) {
	this.order_time = order_time;
}
public LocalDate getDelivery_time() {
	return delivery_time;
}
public void setDelivery_time(LocalDate delivery_time) {
	this.delivery_time = delivery_time;
}
@Override
public String toString() {
	return "FoodOrder [id=" + id + ", fooditem=" + fooditem + ", price=" + price + ", order_time=" + order_time
			+ ", delivery_time=" + delivery_time + "]";
}



}
