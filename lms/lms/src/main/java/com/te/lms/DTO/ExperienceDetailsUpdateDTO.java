package com.te.lms.DTO;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ExperienceDetailsUpdateDTO {

	private String companyName;

	private String yearOfExperience;

	private LocalDate dateOfJoining;

	private LocalDate dateOfRelieving;

	private String designation;

	private String location;
}
