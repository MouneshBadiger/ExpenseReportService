package com.ibm.gbs.ems.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.gbs.ems.bo.User;

public interface UserRepo extends MongoRepository<User, String>{

}
