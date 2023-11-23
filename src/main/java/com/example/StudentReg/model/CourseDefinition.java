package com.example.StudentReg.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "course_definition")
public class CourseDefinition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String name;
    private String descriptions;
    @OneToOne(mappedBy = "coursd")
    private Course cours;
    @Override
    public String toString() {
        return "CourseDefinition{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", cours=" + cours +
                '}';
    }
}
