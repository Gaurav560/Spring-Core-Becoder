package com.ineuron.ai.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ineuron.ai.sms.model.Student;

public interface StudentRepository extends  JpaRepository<Student,Long> {

}
