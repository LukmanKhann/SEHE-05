package org.jsp.foodorder.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jsp.foodorder.dto.FoodOrder;
import org.jsp.foodorder.dto.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class FoodDao {

	@Autowired
	private EntityManager manager;
	
	public FoodOrder saveFood(FoodOrder food,int id) {
		Public p = manager.find(Public.class, id);
		if(p!=null) {
			p.getOrders().add(food);
			food.setPub(p);
		manager.persist(food);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		}
		return null;
	}
	public FoodOrder updateFood(FoodOrder food,int id) {
		Public p = manager.find(Public.class, id);
		if(p!=null) {
			p.getOrders().add(food);
			food.setPub(p);
			manager.merge(food);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			transaction.commit();
			
		}
		return null;
		
	}
	public FoodOrder findOrder (int pid,int fid) {
		Public p = manager.find(Public.class, pid);
		if(p!=null) {
		 FoodOrder o = manager.find(FoodOrder.class, pid);
		 System.out.println(o);
		}
		return null;
		
	}
	public boolean deleteOrder(int pid,int fid) {
		Public p = manager.find(Public.class, pid);
		if(p!=null) {
			FoodOrder o = manager.find(FoodOrder.class, fid);
			if(o!=null) {
				o.setPub(null);
				manager.remove(o);
				EntityTransaction transaction = manager.getTransaction();
				transaction.begin();
				transaction.commit();
				return true;
			}
			
		}
		return false;
	}
	public FoodOrder verifyfoodbypublicnameandlocation(String name,String location) {
		String qry = "select f.orders from Public f where f.name = ?1 and f.location = ?2";
		Query q = manager.createQuery(qry);
		q.setParameter(1,name);
		q.setParameter(2, location);
	    List<FoodOrder> food = q.getResultList();
	    for(FoodOrder f:food) {
	    	System.out.println(f);
	    }
	    return null;
	
	}
public FoodOrder verifybypublicid(int id) {
	String qry = "select f.orders from Public f where f.id=?1";
	Query q = manager.createQuery(qry);
	q.setParameter(1, id);
	List<FoodOrder> food = q.getResultList();
	for(FoodOrder f:food) {
		System.out.println(f);
	}
	return null;
}
		
}
