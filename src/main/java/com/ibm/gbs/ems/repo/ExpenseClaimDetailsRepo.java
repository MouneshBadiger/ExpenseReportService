package com.ibm.gbs.ems.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.gbs.ems.bo.ExpenseClaimDetails;

public interface ExpenseClaimDetailsRepo extends MongoRepository<ExpenseClaimDetails, String> {

}
