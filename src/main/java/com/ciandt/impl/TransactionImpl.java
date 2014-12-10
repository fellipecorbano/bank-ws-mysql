package com.ciandt.impl;

import java.util.List;

import javax.jws.WebService;

import com.ciandt.beans.Transaction;
import com.ciandt.interfaces.ITransaction;
import com.ciandt.services.TransactionService;

@WebService(endpointInterface="com.ciandt.interfaces.ITransaction")
public class TransactionImpl implements ITransaction {	
	
	public TransactionService transactionService;
	
	
	public TransactionImpl(){
		transactionService = new TransactionService();
	}
	
		
	public boolean addTransaction(long cpf, Transaction transaction) {
		return transactionService.addTransaction(cpf, transaction);
	}

	public List<Transaction> listTransactions(long cpf) {
		return transactionService.listTransaction(cpf);
	}

}
