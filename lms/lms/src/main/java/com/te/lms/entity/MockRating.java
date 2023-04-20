package com.te.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class MockRating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sNo;
	@NotNull
	private String mockType;
	@NotNull
	private String mocktakenBy;
	@NotNull
	private String technology;
	@NotNull
	private Double practicalKnowledge;
	@NotNull
	private Double theoreticalKnowledge;
	@NotNull
	private String overAllFeedback;
	@NotNull
	private String detailedFeedback;

}
