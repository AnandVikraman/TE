package com.te.lms.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@GenericGenerator(
		name = "sequenceGenerator",
		strategy = "com.te.lms.customsequencegenerator.CustomSequenceGeneratorMentor",
		parameters = {
				@Parameter(name = "increment_size", value = "1")
		})
public class MentorDisplay {
	
	@Id
	@GeneratedValue(generator = "sequenceGenerator")
	private String sNo;
	@NotNull
	private String employeeId;
	@NotNull
	private String employeeName;
	@NotNull
	private String mocksTaken;
	@NotNull
	private String mockRatings;
	@NotNull
	private String attendance;
	@NotNull
	private String status;
	

}
