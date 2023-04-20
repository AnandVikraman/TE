package com.te.lms.DTO;

import lombok.Data;

@Data
public class BankDetailsUpdateDTO {
	
	private String bankName;

	private String accountType;

	private String ifscCode;

	private String branch;

	private String state;

}
