package com.te.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Contact {
	
	@Id
	private Long contactNumber;
	@NotNull
	private String contactType;
	

}
