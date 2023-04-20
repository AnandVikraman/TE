package com.te.lms.DTO;

import lombok.Data;

@Data
public class EducationDetailsUpdateDTO {

	private String educationType;

	private Integer yearOfPassing;

	private Double percentage;

	private String universityname;

	private String instituteName;

	private String specialization;

	private String state;
}
