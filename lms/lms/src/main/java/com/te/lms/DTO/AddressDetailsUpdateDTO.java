package com.te.lms.DTO;

import lombok.Data;

@Data
public class AddressDetailsUpdateDTO {

	private String addressType;

	private String doorNo;

	private String street;

	private String locality;

	private String city;

	private String state;

	private Integer pinCode;

	private String landMark;

}
