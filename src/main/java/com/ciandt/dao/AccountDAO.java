package com.ciandt.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ciandt.beans.Account;

@Repository
public class AccountDAO {
	//@Autowired
	SessionFactory sessionFactory;
	
	@Resource
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory=sf;
	}
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	public Account addAccount(Account account){
		
		//SessionFactory session = getSessionFactory();		

		//Session session = getSessionFactory().openSession();
		//session.beginTransaction();
		getSession().save(account);
		//session.getTransaction().commit();
		
		System.out.println("ADDING ACCOUNT...");
		
		return null;
	}
	
}
