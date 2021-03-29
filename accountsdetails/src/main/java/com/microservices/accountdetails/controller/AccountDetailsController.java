package com.microservices.accountdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.accountdetails.service.AccountDetailsService;
import com.microservices.accountdetails.vo.Accounts;

@RestController
@RequestMapping("/accountDetails/v1")
public class AccountDetailsController {

	@Autowired
	private AccountDetailsService accountDetailsService;

	@GetMapping("/accountsData")
	public ResponseEntity<List<Accounts>> getAccountsData() {

		List<Accounts> customersList = accountDetailsService.getAccountsDetails();

		return ResponseEntity.ok().body(customersList);
	}

	@GetMapping("/customerAccounts/{custId}")
	public ResponseEntity<List<Accounts>> getCustomerAddressById(@PathVariable int custId) {

		List<Accounts> addressList = accountDetailsService.getCustomerAccountsById(custId);

		return ResponseEntity.ok().body(addressList);
	}

}
