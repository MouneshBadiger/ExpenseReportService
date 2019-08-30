package com.ibm.gbs.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.gbs.ems.bo.ExpenseClaim;
import com.ibm.gbs.ems.bo.User;
import com.ibm.gbs.ems.repo.ExpenseClaimRepo;
import com.ibm.gbs.ems.repo.UserRepo;

@Service
public class RegisterClaimService {
	
	@Autowired
	ExpenseClaimRepo expenseClaimRepo;
	@Autowired
	UserRepo userRepo;
	
	
	public List<ExpenseClaim> expenseClaimRegistered(String userId) {
		return expenseClaimRepo.findByUserId_IdAndStatus(userId,"");
	}
	public List<ExpenseClaim> getExpenseClaimApproved(String userId) {
		return expenseClaimRepo.findByUserId_IdAndStatus(userId,"approved");
	}
	
	
	public List<ExpenseClaim> expenseClaimApprovedManager(String userId) {
		User user=userRepo.findById(userId).get();
		if(user!=null) {
			return expenseClaimRepo.findByApproverEmailAndStatus(user.getEmailId(), "approved");
		}else {
			return null;
		}
		
	}
	public List<ExpenseClaim> expenseClaimPendingManager(String userId) {
		User user=userRepo.findById(userId).get();
		if(user!=null) {
			return expenseClaimRepo.findByApproverEmailAndStatus(user.getEmailId(),"");
		}else {
			return null;
		}
		
	}

}
