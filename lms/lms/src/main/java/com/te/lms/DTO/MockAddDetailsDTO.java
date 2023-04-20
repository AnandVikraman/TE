package com.te.lms.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MockAddDetailsDTO {
	
	private String batchId;

	private String mockNo;

	private String technology;

	private String panel;

	private LocalDateTime dateAndTime;

}
