package com.ciandt.services;

import com.ciandt.beans.Account;
import com.ciandt.dao.DAOMock;

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
