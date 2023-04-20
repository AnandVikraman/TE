package com.te.lms.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.DTO.BatchDetailsUpdateDTO;
import com.te.lms.DTO.MentorListDTO;
import com.te.lms.DTO.PrimaryInfoDTO;
import com.te.lms.entity.BatchDetails;
import com.te.lms.entity.MentorList;
import com.te.lms.entity.PrimaryInfo;
import com.te.lms.response.SuccessResponse;
import com.te.lms.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	// update batch details
	@PutMapping("/updateBatchDetails/{sNo}")
	public ResponseEntity<SuccessResponse> editBatchDetails(@RequestBody Map<String, String> map,
			@PathVariable Integer sNo) {
		BatchDetailsUpdateDTO batchDetailsUpdateDTO = adminService.batchDetailsUpdateDTO(map, sNo);
		if (batchDetailsUpdateDTO != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(batchDetailsUpdateDTO)
					.error(false).message("Update success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(batchDetailsUpdateDTO).error(true)
					.message("Update not success").build(), HttpStatus.BAD_REQUEST);
		}
	}

	// addBatchDetails
	@PostMapping("/addBatchDetails/{employeeId}")
	public ResponseEntity<SuccessResponse> addBatchDetails(
			@RequestBody List<BatchDetailsUpdateDTO> batchDetailsUpdateDTO, @PathVariable String employeeId) {

		PrimaryInfo addBatchDetails = adminService.addBatchDetails(batchDetailsUpdateDTO, employeeId);
		if (addBatchDetails != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addBatchDetails).error(false).message(" success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addBatchDetails).error(true).message("not success").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	// deleteBatchDetails
	@GetMapping("/deleteBatchDetails/{employeeId}/{sNo}")
	public ResponseEntity<SuccessResponse> deleteBatchDetails(@PathVariable String employeeId,
			@PathVariable Integer sNo) {

		Boolean deleteBatchDetails = adminService.deleteBatchDetails(employeeId, sNo);
		if (deleteBatchDetails != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(deleteBatchDetails).error(false)
					.message("Data Deleted success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(deleteBatchDetails).error(true).message("Data not Deleted").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	// searchBatchDetails
	@GetMapping("/searchBatchDetails/{sNo}")
	public ResponseEntity<SuccessResponse> searchBatchDetails(@PathVariable Integer sNo) {

		BatchDetailsUpdateDTO dataBatchDetails = adminService.getDataBatchDetails(sNo);
		if (dataBatchDetails != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(dataBatchDetails).error(false).message("success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(dataBatchDetails).error(true).message("Not success").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	// searchAllBatchDetails
	@GetMapping("/searchAllBatchDetails")
	public ResponseEntity<SuccessResponse> searchAllBatchDetails() {

		List<BatchDetailsUpdateDTO> allBatchDeatils = adminService.getAllBatchDeatils();
		if (allBatchDeatils != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(allBatchDeatils).error(false).message("success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(allBatchDeatils).error(true).message("Not success").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

//mentor list register
	@PostMapping("/addMentorList")
	public ResponseEntity<SuccessResponse> registerMentorList(@RequestBody MentorListDTO mentorListDTO) {
		MentorListDTO addMentorList = adminService.addMentorList(mentorListDTO);
		if (addMentorList != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addMentorList).error(false)
					.message("Thanks for your registration").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addMentorList).error(true).message("Data not register").build(),
					HttpStatus.BAD_REQUEST);
		}

	}

	// mentor list update

	@PutMapping("/updateMentorList/{sNo}")
	public ResponseEntity<SuccessResponse> editMentorList(@RequestBody MentorListDTO dto, @PathVariable Integer sNo) {
		MentorListDTO updateMentorList = adminService.updateMentorList(dto, sNo);
		if (updateMentorList != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(updateMentorList).error(false).message("Update success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(updateMentorList).error(true).message("Update not success").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	// deleteMentorDetails
	@GetMapping("/deleteMentorList/{sNo}")
	public ResponseEntity<SuccessResponse> deleteMentordertails(@PathVariable Integer sNo) {
		Boolean deleteMentorList = adminService.deleteMentorList(sNo);
		if (deleteMentorList != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(deleteMentorList).error(false)
					.message("Data Deleted success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(deleteMentorList).error(true).message("Data not Deleted").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	// searchMentorListDetails
	@GetMapping("/searchMentorListDetails/{sNo}")
	public ResponseEntity<SuccessResponse> searchMentorListDetails(@PathVariable Integer sNo) {

		MentorListDTO mentorListDetails = adminService.getMentorListDetails(sNo);
		if (mentorListDetails != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(mentorListDetails).error(false).message("success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(mentorListDetails).error(true).message("Not success").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	// searchAllMentorDetails
	@GetMapping("/searchAllMentorDetails")
	public ResponseEntity<SuccessResponse> searchAllMentorDetails() {

		List<MentorListDTO> allMentorListDetails = adminService.getAllMentorListDetails();
		if (allMentorListDetails != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(allMentorListDetails).error(false).message("success").build(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(allMentorListDetails).error(true).message("Not success").build(),
					HttpStatus.BAD_REQUEST);
		}
	}
}
