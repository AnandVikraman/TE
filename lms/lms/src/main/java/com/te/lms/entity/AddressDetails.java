package com.te.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class AddressDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sNo;
	@NotNull
	private String addressType;
	@NotNull
	private String doorNo;
	@NotNull
	private String street;
	@NotNull
	private String locality;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@NotNull
	private Integer pinCode;
	@NotNull
	private String landMark;

}
