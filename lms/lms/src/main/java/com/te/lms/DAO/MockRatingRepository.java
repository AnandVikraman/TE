package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.MockRating;

@Repository
public interface MockRatingRepository extends JpaRepository<MockRating, Integer> {

	
}
