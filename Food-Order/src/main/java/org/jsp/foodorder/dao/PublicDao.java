package org.jsp.foodorder.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jsp.foodorder.dto.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PublicDao {
    @Autowired
	private EntityManager manager;
    
    public Public savePublic(Public pub) {
    	manager.persist(pub);
    	EntityTransaction transaction = manager.getTransaction();
    	transaction.begin();
    	transaction.commit();
    	return pub;
    }
    
    public Public updatePublic(Public pub) {
    	manager.merge(pub);
    	EntityTransaction transaction = manager.getTransaction();
    	transaction.begin();
    	transaction.commit();
    	return pub;
    }
    public Public findpublicbyfoodname(String foodname) {
    	String qry = "select p.pub from FoodOrder p where p.fooditem = ?1";
    	Query q = manager.createQuery(qry);
    	q.setParameter(1, foodname);
    	List<Public> pub=  q.getResultList();
    	for(Public p:pub) {
    		System.out.println(p);
    	}
    	return  null;
    }
    public Public findpublicbyfoodid(int id) {
    	String qry = "select p.pub from FoodOrder p where p.id = ?1";
    	Query q = manager.createQuery(qry);
    	q.setParameter(1, id);
    	
    	try {
    		Public p = (Public) q.getSingleResult();
    		System.out.println(p);
    		
		} catch (NoResultException e) {
			System.out.println("Something is wrong");
		}
		return null;
    }
}
