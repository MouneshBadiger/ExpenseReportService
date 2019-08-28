package com.ibm.gbs.ems.bo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document
@Data
public class User  implements Serializable{
	@Id
	private String id;
	
	private String userName;
	
	@PositiveOrZero(message = "Mobile Number can not be empty")
	private int mobileNo;
	@NotEmpty(message = "Mobile Number can not be empty")
	private String emailId;
	
	@CreatedDate
	private LocalDate createdDate;

	@LastModifiedDate
	private LocalDate  lastModifiedDate;
	
	
	
}
