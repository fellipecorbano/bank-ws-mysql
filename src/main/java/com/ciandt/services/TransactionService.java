package com.ciandt.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ciandt.beans.Transaction;
import com.ciandt.dao.DAOMock;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class TransactionService {	
	
	public boolean addTransaction(long cpf, Transaction transaction) {
		return DAOMock.addTransaction(cpf, transaction);	
	}

	public List<Transaction> listTransaction(long cpf) {
		return DAOMock.listTransactions(cpf);
	}

}
