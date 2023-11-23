package com.example.StudentReg.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "semesters")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int semid;
    private String name;
    private LocalDate startdate;
    private LocalDate enddate;
    @OneToMany(mappedBy = "sem")
    private List<StudentRegistration> reg;
    @OneToMany(mappedBy = "sems")
    private List<Course> course;
    @Override
    public String toString() {
        return "Semester{" +
                "semid=" + semid +
                ", name='" + name + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", reg=" + reg +
                ", course=" + course +
                '}';
    }
}
