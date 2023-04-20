package com.te.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.DTO.MentorDisplayDTO;
import com.te.lms.DTO.MentorListDTO;
import com.te.lms.DTO.MockAddDetailsDTO;
import com.te.lms.DTO.MockRatingDTO;
import com.te.lms.response.SuccessResponse;
import com.te.lms.service.MentorService;

@RestController
@RequestMapping("/mentor")
public class MentorController {

	@Autowired
	private MentorService mentorService;

	// mentorDisplay register
	@PostMapping("/addMentorDisplay")
	public ResponseEntity<SuccessResponse> registerMentorDisplay(@RequestBody MentorDisplayDTO mentorDisplayDTO) {
		MentorDisplayDTO addMentorDisplayDetails = mentorService.addMentorDisplayDetails(mentorDisplayDTO);
		if (addMentorDisplayDetails != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addMentorDisplayDetails)
					.error(false).message("Thanks for your registration").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addMentorDisplayDetails)
					.error(true).message("Data not register").build(), HttpStatus.BAD_REQUEST);
		}

	}

	// mockRating register
	@PostMapping("/addMockRating")
	public ResponseEntity<SuccessResponse> registerMockRating(@RequestBody MockRatingDTO mockRatingDTO) {
		MockRatingDTO addMockratingDetails = mentorService.addMockratingDetails(mockRatingDTO);
		if (addMockratingDetails != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addMockratingDetails).error(false)
					.message("Thanks for your registration").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addMockratingDetails).error(true)
					.message("Data not register").build(), HttpStatus.BAD_REQUEST);
		}

	}

	// mockAddDetails register
	@PostMapping("/addMockAddDetails")
	public ResponseEntity<SuccessResponse> registerMockAddDetails(@RequestBody MockAddDetailsDTO mockAddDetailsDTO) {
		MockAddDetailsDTO addMockAddDetailsDTO = mentorService.addMockAddDetailsDTO(mockAddDetailsDTO);
		if (addMockAddDetailsDTO != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addMockAddDetailsDTO).error(false)
					.message("Thanks for your registration").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addMockAddDetailsDTO).error(true)
					.message("Data not register").build(), HttpStatus.BAD_REQUEST);
		}

	}

}