package com.te.lms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class SecondaryInfo {
	
	@Id
	@Column(unique = true)
	private String panNo;
	@Column(unique = true, length = 12)
	@NotNull
	private Long aadharNo;
	@NotNull
	private String fatherName;
	@NotNull
	private String motherName;
	@NotNull
	private String spouseName;
	@NotNull
	private String passportNo;
	@NotNull
	private String maritalStatus;
	
	

}
