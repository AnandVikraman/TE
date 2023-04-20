package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.SecondaryInfo;

@Repository
public interface SecondaryInfoRepository extends JpaRepository<SecondaryInfo, String> {

}
