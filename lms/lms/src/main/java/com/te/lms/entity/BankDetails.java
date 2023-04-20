package com.te.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class BankDetails {
	
	@Id
	private Long accountNo;
	@NotNull
	private String bankName;
	@NotNull
	private String accountType;
	@NotNull
	private String ifscCode;
	@NotNull
	private String branch;
	@NotNull
	private String state;
	

}
