package com.ciandt.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ciandt.beans.Account;
import com.ciandt.dao.DAOMock;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class AccountService {		
		
	public Account getAccountByCPF(Long cpf) {		
		return DAOMock.getAccountsMock().get(cpf);
	}

	public Account addAccount(Account c) {		
		return DAOMock.addAccount(c);
	}

	public boolean removeAccountByCPF(long cpf) {
		return DAOMock.removeAccount(cpf);
	}

}
