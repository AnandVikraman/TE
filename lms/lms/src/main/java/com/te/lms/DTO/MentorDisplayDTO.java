package com.te.lms.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MentorDisplayDTO {

	private String employeeId;

	private String employeeName;

	private String mocksTaken;

	private String mockRatings;

	private String attendance;

	private String status;

}
