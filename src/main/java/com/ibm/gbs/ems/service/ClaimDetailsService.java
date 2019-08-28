package com.ibm.gbs.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.gbs.ems.bo.ExpenseClaimDetails;
import com.ibm.gbs.ems.repo.ExpenseClaimDetailsRepo;

@Service
public class ClaimDetailsService {
	
	@Autowired
	ExpenseClaimDetailsRepo expenseClaimDetailsRepo;
	

	public List<ExpenseClaimDetails> getAllExpenseClaimDetails() {
		return expenseClaimDetailsRepo.findAll();
	}

}
