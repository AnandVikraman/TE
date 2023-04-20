package com.te.lms.service;

import java.util.List;
import java.util.Map;

import com.te.lms.DTO.BatchDetailsUpdateDTO;
import com.te.lms.DTO.MentorListDTO;
import com.te.lms.entity.BatchDetails;
import com.te.lms.entity.MentorList;
import com.te.lms.entity.PrimaryInfo;

public interface AdminService {

	// addBatchDetails
	public PrimaryInfo addBatchDetails(List<BatchDetailsUpdateDTO> batchDetails, String employeeId);

	// update API Admin module
	public BatchDetailsUpdateDTO batchDetailsUpdateDTO(Map<String, String> map, Integer sNo);

	// delete Api
	public Boolean deleteBatchDetails(String employeeId, Integer sNo);

	// search Api module
	public BatchDetailsUpdateDTO getDataBatchDetails(Integer sNo);

	// SearchAll Api module
	public List<BatchDetailsUpdateDTO> getAllBatchDeatils();

	// add MentorList
	public MentorListDTO addMentorList(MentorListDTO mentorListDTO);

	// update api mentorList
	public MentorListDTO updateMentorList(MentorListDTO mentorListDTO, Integer sNo);

	// delete api mentorList
	public Boolean deleteMentorList(Integer sNo);

	// search Api mentorlist
	public MentorListDTO getMentorListDetails(Integer sNo);
	
	// SearchAll Api mentorlist
	public List<MentorListDTO> getAllMentorListDetails();
}
