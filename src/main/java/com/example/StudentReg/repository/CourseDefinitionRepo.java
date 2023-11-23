package com.example.StudentReg.repository;

import com.example.StudentReg.model.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDefinitionRepo extends JpaRepository<CourseDefinition,Integer> {
}
