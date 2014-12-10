package com.ciandt.services;

import java.util.List;

import com.ciandt.beans.Transaction;
import com.ciandt.dao.DAOMock;

public class TransactionService {	
	
	public boolean addTransaction(long cpf, Transaction transaction) {
		return DAOMock.addTransaction(cpf, transaction);	
	}

	public List<Transaction> listTransaction(long cpf) {
		return DAOMock.listTransactions(cpf);
	}

}
