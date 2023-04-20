package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.Authentication;

@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, String> {

	Authentication findByEmployeeId(String employeeId);

}
