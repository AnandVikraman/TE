package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {

}
