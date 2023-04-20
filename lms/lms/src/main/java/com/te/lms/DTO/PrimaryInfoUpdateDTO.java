package com.te.lms.DTO;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PrimaryInfoUpdateDTO {

	private String employeeName;

	private LocalDate dateOfJoining;

	private LocalDate dateOfBirth;

	private String emailId;

	private String bloodGroup;

	private String designation;

	private String gender;

	private String nationality;

	private String employeeStatus;
}
