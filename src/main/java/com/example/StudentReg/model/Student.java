package com.example.StudentReg.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String regNo;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dob;
    private String password;
    @OneToMany(mappedBy="student")
    private List<StudentRegistration> students;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", regNo='" + regNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dob='" + dob + '\'' +
                ", password='" + password + '\'' +
                ", students=" + students +
                '}';
    }
}
