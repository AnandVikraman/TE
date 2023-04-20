package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.EducationDetails;

@Repository
public interface EducationDetailsRepository extends JpaRepository<EducationDetails, Integer> {

}
