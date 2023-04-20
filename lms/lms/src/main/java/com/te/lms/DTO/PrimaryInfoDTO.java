package com.te.lms.DTO;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.te.lms.entity.AddressDetails;
import com.te.lms.entity.BankDetails;
import com.te.lms.entity.BatchDetails;
import com.te.lms.entity.Contact;
import com.te.lms.entity.EducationDetails;
import com.te.lms.entity.Experience;
import com.te.lms.entity.SecondaryInfo;
import com.te.lms.entity.TechnicalSkills;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrimaryInfoDTO {

	private String employeeId;

	private String employeeName;

	private LocalDate dateOfJoining;

	private LocalDate dateOfBirth;

	private String emailId;

	private String bloodGroup;

	private String designation;

	private String gender;

	private String nationality;

	private String employeeStatus;

	private SecondaryInfo secondaryInfo;

	private List<EducationDetails> educationDetails;

	private List<AddressDetails> addressDetails;

	private BankDetails bankDetails;

	private List<TechnicalSkills> technicalSkills;

	private List<Experience> experience;

	private List<Contact> contact;

	private List<BatchDetails> batchDetails;
}
