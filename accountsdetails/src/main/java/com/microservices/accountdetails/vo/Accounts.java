package com.microservices.accountdetails.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Accounts {

	public Accounts() {

	}

	public Accounts(String accountNo, String accountType, int balence, String accountStatus) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balence = balence;
		this.accountStatus = accountStatus;
	}

	private String accountNo;
	private String accountType;
	private int balence;
	private String accountStatus;

}
