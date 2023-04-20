package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.MockAddDetails;

@Repository
public interface MockAddDetailsRepository extends JpaRepository<MockAddDetails, Integer> {

}