package com.te.lms.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.lms.DAO.MentorDisplayRepository;
import com.te.lms.DAO.MockAddDetailsRepository;
import com.te.lms.DAO.MockRatingRepository;
import com.te.lms.DTO.MentorDisplayDTO;
import com.te.lms.DTO.MockAddDetailsDTO;
import com.te.lms.DTO.MockRatingDTO;
import com.te.lms.entity.MentorDisplay;
import com.te.lms.entity.MockAddDetails;
import com.te.lms.entity.MockRating;

@Service
public class MentorserviceImplementation implements MentorService {

	@Autowired
	private MentorDisplayRepository mentorDisplayRepository;
	@Autowired
	private MockRatingRepository mockRatingRepository;
	@Autowired
	private MockAddDetailsRepository mockAddDetailsRepository;
	@Autowired
	private ModelMapper mapper;

	@Override
	public MentorDisplayDTO addMentorDisplayDetails(MentorDisplayDTO mentorDisplayDTO) {
		MentorDisplay map = mapper.map(mentorDisplayDTO, MentorDisplay.class);
		mentorDisplayRepository.save(map);
		return mapper.map(map, MentorDisplayDTO.class);
	}

	@Override
	public MockRatingDTO addMockratingDetails(MockRatingDTO mockRatingDTO) {
		MockRating map = mapper.map(mockRatingDTO, MockRating.class);
		mockRatingRepository.save(map);
		return mapper.map(map, MockRatingDTO.class);
	}

	@Override
	public MockAddDetailsDTO addMockAddDetailsDTO(MockAddDetailsDTO mockAddDetailsDTO) {
		MockAddDetails map = mapper.map(mockAddDetailsDTO, MockAddDetails.class);
		mockAddDetailsRepository.save(map);
		return mapper.map(map, MockAddDetailsDTO.class);
	}

}
