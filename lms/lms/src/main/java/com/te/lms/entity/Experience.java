package com.te.lms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sNo;
	@NotNull
	private String companyName;
	@NotNull
	private String yearOfExperience;
	@NotNull
	private LocalDate dateOfJoining;
	@NotNull
	private LocalDate dateOfRelieving;
	@NotNull
	private String designation;
	@NotNull
	private String location;
}
