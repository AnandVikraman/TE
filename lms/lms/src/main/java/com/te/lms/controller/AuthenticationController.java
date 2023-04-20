package com.te.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.DTO.AuthenticationRequest;
import com.te.lms.DTO.AuthenticationResponse;
import com.te.lms.entity.Authentication;
import com.te.lms.response.SuccessResponse;
import com.te.lms.service.AuthenticationService;
import com.te.lms.springsecurityandjwtutil.AuthenticationJwtUtil;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager manager;
	@Autowired
	private AuthenticationJwtUtil jwtUtil;
	@Autowired
	private UserDetailsService detailsService;
	@Autowired
	private AuthenticationService authenticationService;

	@PostMapping("/getAuthenticate")
	public ResponseEntity<AuthenticationResponse> getAuthenticate(@RequestBody AuthenticationRequest request) {
		manager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmployeeId(), request.getPassword()));
		UserDetails userDetails = detailsService.loadUserByUsername(request.getEmployeeId());
		String generateToken = jwtUtil.generateToken(userDetails);
		return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse(generateToken), HttpStatus.OK);

	}

	@PostMapping("/add")
	public ResponseEntity<SuccessResponse> saveAuthentication(@RequestBody Authentication authentication) {

		Authentication addAuthentication = authenticationService.addAuthentication(authentication);
		if (addAuthentication != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addAuthentication).error(false)
					.message("Thanks for your registration").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addAuthentication).error(true).message("Data not register").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/get/{employeeId}")
	public ResponseEntity<?> getEmployee(@PathVariable String employeeId) {

		Authentication employee = authenticationService.getEmployee(employeeId);
		if (employee != null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(employee).error(false)
					.message("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(employee).error(true).message("No data").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

}
