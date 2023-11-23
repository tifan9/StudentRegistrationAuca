package com.example.StudentReg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_registration")
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regid;
    private LocalDate regDate;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Student student;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="semid")
    private Semester sem;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="acaid")
    private AcademicUnit unit;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "student_course",joinColumns = @JoinColumn(name="id")
            ,inverseJoinColumns =@JoinColumn(name="courseid"))

    private List<Course> courses=new ArrayList<>();

    @Override
    public String toString() {
        return "StudentRegistration{" +
                "regid=" + regid +
                ", regDate=" + regDate +
                ", student=" + student +
                ", sem=" + sem +
                ", unit=" + unit +
                ", courses=" + courses +
                '}';
    }
}
