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
	@GetMapping("/expenseClaim/{userId}")
	public ResponseEntity<List<ExpenseClaim>> expenseClaim( @PathVariable  String userId){
		try {
				List<ExpenseClaim> list=registerClaimService.getExpenseClaimAll(userId);
					return ResponseEntity.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.notFound().build();
		
	}
	

}
