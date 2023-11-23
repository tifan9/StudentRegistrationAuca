package com.example.StudentReg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codes;
    private String names;
    @Enumerated(EnumType.STRING)
    private Qualification qualification;
    @Enumerated(EnumType.STRING)
    private Role role;
    @ManyToOne
    @JoinColumn(name = "courseid")
    private Course courses;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", codes='" + codes + '\'' +
                ", names='" + names + '\'' +
                ", qualification=" + qualification +
                ", role=" + role +
                ", courses=" + courses +
                '}';
    }

    public enum Qualification {
        Masters,
        PHD,
        PROFESSOR
    }
    public enum Role{
        Lecturer,
        Assistant
    }

}
