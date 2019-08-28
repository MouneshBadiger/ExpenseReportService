package com.ibm.gbs.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.gbs.ems.bo.ExpenseClaim;
import com.ibm.gbs.ems.repo.ExpenseClaimRepo;

@Service
public class RegisterClaimService {
	
	@Autowired
	ExpenseClaimRepo expenseClaimRepo;
	
	public List<ExpenseClaim> getExpenseClaimAll(String userId) {
		return expenseClaimRepo.findByUserId_Id(userId);
	}

}
