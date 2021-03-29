package com.microservices.accountdetails.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "AccountsDetails")
@Getter
@Setter
public class AccountDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "custId")
	private String custId;

	@Column(name = "accountNo")
	private String accountNo;

	@Column(name = "accountType")
	private String accountType;

	@Column(name = "balence")
	private int balence;

	@Column(name = "accountStatus")
	private String accountStatus;

}
