package com.ibm.gbs.ems.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.gbs.ems.bo.ExpenseClaim;

public interface ExpenseClaimRepo extends MongoRepository<ExpenseClaim, String> {
	
	List<ExpenseClaim> findByUserId_Id(String userId);
	List<ExpenseClaim> findByUserId_IdAndStatus(String userId,String status);
	List<ExpenseClaim> findByApproverEmailAndStatus(String emailId,String status);
	
}
