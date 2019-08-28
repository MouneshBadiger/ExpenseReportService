package com.ibm.gbs.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ibm.gbs.ems.bo.User;
import com.ibm.gbs.ems.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	

	public List<User> getUesers() {
		return userRepo.findAll(Sort.by("mobileNo"));
	}
	

}
