package com.te.lms.service;

import java.util.Map;

import com.te.lms.DTO.AddressDetailsUpdateDTO;
import com.te.lms.DTO.BankDetailsUpdateDTO;
import com.te.lms.DTO.BatchDetailsUpdateDTO;
import com.te.lms.DTO.ContactUpdateDTO;
import com.te.lms.DTO.EducationDetailsUpdateDTO;
import com.te.lms.DTO.ExperienceDetailsUpdateDTO;
import com.te.lms.DTO.PrimaryInfoDTO;
import com.te.lms.DTO.PrimaryInfoUpdateDTO;
import com.te.lms.DTO.SecondaryInfoUpdateDTO;
import com.te.lms.DTO.TechnicalSkillsUpdateDTO;
import com.te.lms.entity.PrimaryInfo;

public interface EmployeeService  {
	
	//register API
	public PrimaryInfo register(PrimaryInfoDTO primaryInfoDTO);
	
	//update API employee module
	public PrimaryInfoUpdateDTO  updatePrimaryInfo(Map<String, String> map,String employeeId);
	public SecondaryInfoUpdateDTO updateSecondaryInfo(Map<String, String> map, String panNo);
	public EducationDetailsUpdateDTO updateEducationDetailsInfo(Map<String, String> map, Integer sNo);
	public AddressDetailsUpdateDTO addressDetailsUpdateDTO(Map<String, String> map, Integer sNo);
	public BankDetailsUpdateDTO bankDetailsUpdateDTO(Map<String, String> map, Long accountNo);
	public TechnicalSkillsUpdateDTO technicalSkillsUpdateDTO(Map<String, String> map, Integer sNo);
	public ExperienceDetailsUpdateDTO experienceDetailsUpdateDTO(Map<String, String> map, Integer sNo);
	public ContactUpdateDTO contactUpdateDTO(Map<String, String> map, Long contactNumber);
	
	
}
