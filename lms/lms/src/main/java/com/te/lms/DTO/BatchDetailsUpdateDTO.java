package com.te.lms.DTO;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BatchDetailsUpdateDTO {
	
	
	private String batchId;

	private String batchName;

	private String technologies;

	private LocalDate startDate;

	private LocalDate endDate;

	private String status;

	private String batchStrength;
}
