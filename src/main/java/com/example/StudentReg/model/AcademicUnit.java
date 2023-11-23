package com.example.StudentReg.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "academic_unit")
public class AcademicUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String name;
    @Enumerated(EnumType.STRING)
    private UnityType unityType;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "parent_id", referencedColumnName = "id",nullable = true)
    private AcademicUnit parentUnit;
    @OneToMany(mappedBy = "unit")
    private List<StudentRegistration> students;
    @OneToMany(mappedBy = "academic")
    private List<Course> courses = new ArrayList<>();
    @Override
    public String toString() {
        return "AcademicUnit{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", unityType=" + unityType +
                ", parentUnit=" + parentUnit +
                ", students=" + students +
                ", courses=" + courses +
                '}';
    }

    public enum UnityType {
        PROGRAMME,
        FACULTY,
        DEPARTMENT
    }
}
