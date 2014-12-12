package com.ciandt.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.ciandt.beans.Account;

@Repository
public class AccountDAO extends DAO {

	public Account addAccount(Account account){
		
		//SessionFactory session = getSessionFactory();
		

		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(account);
		session.getTransaction().commit();
		
		System.out.println("ADDING ACCOUNT...");
		
		return null;
	}
	
}
