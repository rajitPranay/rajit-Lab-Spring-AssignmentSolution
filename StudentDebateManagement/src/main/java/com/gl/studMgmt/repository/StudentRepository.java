package com.gl.studMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.studMgmt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
