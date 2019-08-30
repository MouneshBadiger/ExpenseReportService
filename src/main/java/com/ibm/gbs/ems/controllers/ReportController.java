package com.ibm.gbs.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gbs.ems.bo.ExpenseClaim;
import com.ibm.gbs.ems.bo.User;
import com.ibm.gbs.ems.service.RegisterClaimService;
import com.ibm.gbs.ems.service.UserService;

@RestController
public class ReportController {
	
	@Autowired
	UserService userService;
	@Autowired
	RegisterClaimService registerClaimService;
	@GetMapping("/")
	public String helloWorld() {
		return "hello-report";
	}
	
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getUsers(){
		try {
				List<User> list=userService.getUesers();
					return ResponseEntity.ok(list);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.notFound().build();
		
	}
	@GetMapping("/expenseClaim/registered/{userId}")
	public ResponseEntity<List<ExpenseClaim>> expenseClaimRegistered( @PathVariable  String userId){
		try {
				List<ExpenseClaim> list=registerClaimService.expenseClaimRegistered(userId);
					return ResponseEntity.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.notFound().build();
		
	}
	@GetMapping("/expenseClaim/approved/{userId}")
	public ResponseEntity<List<ExpenseClaim>> expenseClaimApproved( @PathVariable  String userId){
		try {
				List<ExpenseClaim> list=registerClaimService.getExpenseClaimApproved(userId);
					return ResponseEntity.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.notFound().build();
		
	}
	@GetMapping("/expenseClaim/manager/approved/{userId}")
	public ResponseEntity<List<ExpenseClaim>> expenseClaimPendingManager( @PathVariable  String userId){
		try {
				List<ExpenseClaim> list=registerClaimService.expenseClaimApprovedManager(userId);
					return ResponseEntity.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.notFound().build();
		
	}
	@GetMapping("/expenseClaim/manager/pending/{userId}")
	public ResponseEntity<List<ExpenseClaim>> expenseClaimApprovedManager( @PathVariable  String userId){
		try {
				List<ExpenseClaim> list=registerClaimService.expenseClaimPendingManager(userId);
					return ResponseEntity.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.notFound().build();
		
	}
	
	

}
