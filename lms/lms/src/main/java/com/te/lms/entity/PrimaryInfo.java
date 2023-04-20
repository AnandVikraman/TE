package com.te.lms.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@GenericGenerator(
		name = "sequenceGenerator",
		strategy = "com.te.lms.customsequencegenerator.CustomSequenceGenerator",
		parameters = {
				@Parameter(name = "increment_size", value = "1")
		})

public class PrimaryInfo {
	
	@Id
	@GeneratedValue(generator = "sequenceGenerator")
	private String employeeId;
	@NotNull
	private String employeeName;
	@NotNull
	private LocalDate dateOfJoining;
	@NotNull
	private LocalDate dateOfBirth;
	@Email
	private String emailId;
	@NotNull
	private String bloodGroup;
	@NotNull
	private String designation;
	@NotNull
	private String gender;
	@NotNull
	private String nationality;
	@NotNull
	private String employeeStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	private SecondaryInfo secondaryInfo;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<EducationDetails> educationDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<AddressDetails> addressDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<TechnicalSkills> technicalSkills;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Experience> experience; 
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contact> contact;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<BatchDetails> batchDetails;

}
