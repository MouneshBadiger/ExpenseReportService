package com.ibm.gbs.ems.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.gbs.ems.bo.ExpenseClaim;
import com.ibm.gbs.ems.bo.User;

public interface ExpenseClaimRepo extends MongoRepository<ExpenseClaim, String> {
	
	List<ExpenseClaim> findByUserId_Id(String userId);
}
