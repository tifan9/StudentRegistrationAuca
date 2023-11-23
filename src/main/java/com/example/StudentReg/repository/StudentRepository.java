package com.example.StudentReg.repository;

import com.example.StudentReg.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
