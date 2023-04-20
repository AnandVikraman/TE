package com.te.lms.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class MockAddDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sNo;
	@NotNull
	private String batchId;
	@NotNull
	private String mockNo;
	@NotNull
	private String technology;
	@NotNull
	private String panel;
	@NotNull
	private LocalDateTime dateAndTime;
	

}
