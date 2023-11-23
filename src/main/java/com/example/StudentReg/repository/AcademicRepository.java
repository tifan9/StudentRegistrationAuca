package com.example.StudentReg.repository;

import com.example.StudentReg.model.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicRepository extends JpaRepository<AcademicUnit,Integer> {
}
