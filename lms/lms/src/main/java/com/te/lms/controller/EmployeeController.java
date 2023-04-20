package com.te.lms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.DTO.AddressDetailsUpdateDTO;
import com.te.lms.DTO.BankDetailsUpdateDTO;
import com.te.lms.DTO.ContactUpdateDTO;
import com.te.lms.DTO.EducationDetailsUpdateDTO;
import com.te.lms.DTO.ExperienceDetailsUpdateDTO;
import com.te.lms.DTO.PrimaryInfoDTO;
import com.te.lms.DTO.PrimaryInfoUpdateDTO;
import com.te.lms.DTO.SecondaryInfoUpdateDTO;
import com.te.lms.DTO.TechnicalSkillsUpdateDTO;
import com.te.lms.entity.PrimaryInfo;
import com.te.lms.response.SuccessResponse;
import com.te.lms.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public ResponseEntity<SuccessResponse> addEmployeeDetails(@RequestBody PrimaryInfoDTO primaryInfoDTO) {
		PrimaryInfo register = employeeService.register(primaryInfoDTO);
		if (register != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(register).error(false)
					.message("Thanks for your registration").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(register).error(true).message("Data not register").build(),
					HttpStatus.BAD_REQUEST);
		}

	}

	@PutMapping("/updatePrimaryInfo/{employeeId}")
	public ResponseEntity<SuccessResponse> editPrimaryInfo(@RequestBody Map<String, String> map,
			@PathVariable String employeeId) {
		PrimaryInfoUpdateDTO updatePrimaryInfo = employeeService.updatePrimaryInfo(map, employeeId);
		if (updatePrimaryInfo != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(updatePrimaryInfo).error(false).message("Update success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(updatePrimaryInfo).error(true).message("Update not success").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateSecondaryInfo/{panNo}")
	public ResponseEntity<SuccessResponse> editSecondaryInfo(@RequestBody Map<String, String> map,
			@PathVariable String panNo) {
		SecondaryInfoUpdateDTO updateSecondaryInfo = employeeService.updateSecondaryInfo(map, panNo);
		if (updateSecondaryInfo != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(updateSecondaryInfo).error(false).message("Update success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(updateSecondaryInfo).error(true)
					.message("Update not success").build(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateEducationDetails/{sNo}")
	public ResponseEntity<SuccessResponse> editEducationDtails(@RequestBody Map<String, String> map,
			@PathVariable Integer sNo) {
		EducationDetailsUpdateDTO updateEducationDetailsInfo = employeeService.updateEducationDetailsInfo(map, sNo);
		if (updateEducationDetailsInfo != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(updateEducationDetailsInfo)
					.error(false).message("Update success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(updateEducationDetailsInfo)
					.error(true).message("Update not success").build(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateAddressDetails/{sNo}")
	public ResponseEntity<SuccessResponse> editAddressDtails(@RequestBody Map<String, String> map,
			@PathVariable Integer sNo) {
		AddressDetailsUpdateDTO addressDetailsUpdateDTO = employeeService.addressDetailsUpdateDTO(map, sNo);
		if (addressDetailsUpdateDTO != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addressDetailsUpdateDTO)
					.error(false).message("Update success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addressDetailsUpdateDTO)
					.error(true).message("Update not success").build(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateBankDetails/{accountNo}")
	public ResponseEntity<SuccessResponse> editBankDtails(@RequestBody Map<String, String> map,
			@PathVariable Long accountNo) {
		BankDetailsUpdateDTO bankDetailsUpdateDTO = employeeService.bankDetailsUpdateDTO(map, accountNo);
		if (bankDetailsUpdateDTO != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(bankDetailsUpdateDTO).error(false).message("Update success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(bankDetailsUpdateDTO).error(true)
					.message("Update not success").build(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateTechnicalDetails/{sNo}")
	public ResponseEntity<SuccessResponse> editTechnicalDtails(@RequestBody Map<String, String> map,
			@PathVariable Integer sNo) {
		TechnicalSkillsUpdateDTO technicalSkillsUpdateDTO = employeeService.technicalSkillsUpdateDTO(map, sNo);
		if (technicalSkillsUpdateDTO != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(technicalSkillsUpdateDTO)
					.error(false).message("Update success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(technicalSkillsUpdateDTO)
					.error(true).message("Update not success").build(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateExperienceDetails/{sNo}")
	public ResponseEntity<SuccessResponse> editExperienceDtails(@RequestBody Map<String, String> map,
			@PathVariable Integer sNo) {
		ExperienceDetailsUpdateDTO experienceDetailsUpdateDTO = employeeService.experienceDetailsUpdateDTO(map, sNo);
		if (experienceDetailsUpdateDTO != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(experienceDetailsUpdateDTO)
					.error(false).message("Update success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(experienceDetailsUpdateDTO)
					.error(true).message("Update not success").build(), HttpStatus.BAD_REQUEST);
		}
	}
	@PutMapping("/updateContactDetails/{contactNumber}")
	public ResponseEntity<SuccessResponse> editContactDtails(@RequestBody Map<String, String> map,
			@PathVariable Long contactNumber) {
		ContactUpdateDTO contactUpdateDTO = employeeService.contactUpdateDTO(map, contactNumber);
		if (contactUpdateDTO != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(contactUpdateDTO)
					.error(false).message("Update success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(contactUpdateDTO)
					.error(true).message("Update not success").build(), HttpStatus.BAD_REQUEST);
		}
	}
}
