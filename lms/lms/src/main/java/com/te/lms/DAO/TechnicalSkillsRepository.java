package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.TechnicalSkills;

@Repository
public interface TechnicalSkillsRepository extends JpaRepository<TechnicalSkills, Integer>{

}
