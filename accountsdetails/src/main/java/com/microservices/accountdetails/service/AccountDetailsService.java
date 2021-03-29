package com.microservices.accountdetails.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.accountdetails.Entity.AccountDetailsEntity;
import com.microservices.accountdetails.Repository.AccountDetailsRepository;
import com.microservices.accountdetails.vo.Accounts;

@Service
public class AccountDetailsService {

	@Autowired
	private AccountDetailsRepository accountDetailsRepository;

	public List<Accounts> getAccountsDetails() {

		List<Accounts> accountsList = new ArrayList<Accounts>();

		List<AccountDetailsEntity> accountsDetailsEntity = accountDetailsRepository.findAll();

		if (!accountsDetailsEntity.isEmpty()) {

			accountsList = accountsDetailsEntity.stream()
					.map(accountsEntity -> new Accounts(accountsEntity.getAccountNo(), accountsEntity.getAccountType(),
							accountsEntity.getBalence(), accountsEntity.getAccountStatus()))
					.collect(Collectors.toList());
		}

		return accountsList;
	}

	public List<Accounts> getCustomerAccountsById(int id) {

		List<Accounts> accountsList = new ArrayList<Accounts>();

		List<AccountDetailsEntity> accountsDetailsEntity = accountDetailsRepository.findAccountsByCustId(id);

		if (!accountsDetailsEntity.isEmpty()) {

			accountsList = accountsDetailsEntity.stream()
					.map(accountsEntity -> new Accounts(accountsEntity.getAccountNo(), accountsEntity.getAccountType(),
							accountsEntity.getBalence(), accountsEntity.getAccountStatus()))
					.collect(Collectors.toList());
		}

		return accountsList;
	}

}
