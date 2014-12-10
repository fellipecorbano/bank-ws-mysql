package com.ciandt.impl;

import javax.jws.WebService;

import com.ciandt.beans.Account;
import com.ciandt.interfaces.IAccount;
import com.ciandt.services.AccountService;

@WebService(endpointInterface="com.ciandt.interfaces.IAccount")
public class AccountImpl implements IAccount {	
	
	public AccountService accountService;
		
	public AccountImpl(){
		accountService = new AccountService();
	}
	
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
