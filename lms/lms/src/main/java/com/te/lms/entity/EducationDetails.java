package com.te.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class EducationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sNo;
	@NotNull
	private String educationType;
	@NotNull
	private Integer yearOfPassing;
	@NotNull
	private Double percentage;
	@NotNull
	private String universityname;
	@NotNull
	private String instituteName;
	@NotNull
	private String specialization;
	@NotNull
	private String state;
	

}
