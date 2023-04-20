package com.te.lms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
