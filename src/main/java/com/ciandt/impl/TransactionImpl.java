package com.ciandt.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciandt.beans.Transaction;
import com.ciandt.interfaces.ITransaction;
import com.ciandt.services.TransactionService;

@WebService(endpointInterface="com.ciandt.interfaces.ITransaction")
@Service
public class TransactionImpl implements ITransaction {	
	
	@Autowired
	public TransactionService transactionService;
			
	public boolean addTransaction(long cpf, Transaction transaction) {
		return transactionService.addTransaction(cpf, transaction);
	}

	public List<Transaction> listTransactions(long cpf) {
		return transactionService.listTransaction(cpf);
	}

}
