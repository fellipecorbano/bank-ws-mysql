package com.ciandt.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciandt.beans.Account;
import com.ciandt.interfaces.IAccount;
import com.ciandt.services.AccountService;

@WebService(endpointInterface="com.ciandt.interfaces.IAccount")
@Service
public class AccountImpl implements IAccount {	
	
	@Autowired
	public AccountService accountService;
			
	public Account getAccountByCPF(long cpf) {		
		return accountService.getAccountByCPF(cpf);	
	}

	public Account addAccount(Account account) {
		return accountService.addAccount(account);
	}

	public boolean removeAccountByCPF(long cpf) {
		return accountService.removeAccountByCPF(cpf);
	}

}
