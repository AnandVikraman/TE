package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.PrimaryInfo;

@Repository
public interface PrimaryInfoRepository extends JpaRepository<PrimaryInfo, String> {


}
