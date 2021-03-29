package com.microservices.accountdetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservices.accountdetails.Entity.AccountDetailsEntity;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetailsEntity, Integer> {

	@Query(value = "select * from Accounts_Details where cust_id =?1 ", nativeQuery = true)
	public List<AccountDetailsEntity> findAccountsByCustId(int custId);

}
