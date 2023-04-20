package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.MentorList;

@Repository
public interface MentorListRepository extends JpaRepository<MentorList, Integer> {

}
