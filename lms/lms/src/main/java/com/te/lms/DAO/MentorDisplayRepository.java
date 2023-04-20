package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.MentorDisplay;

@Repository
public interface MentorDisplayRepository extends JpaRepository<MentorDisplay, String> {

}
