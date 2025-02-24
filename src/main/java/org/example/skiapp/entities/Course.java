package org.example.skiapp.entities;


import org.example.skiapp.enums.Support;
import org.example.skiapp.enums.TypeCourse;

import jakarta.persistence.*;


@Entity

public class Course {

    // Getters and setters
    @Id
    private Long numCourse;
    private int day;
    private float price;

    @Enumerated(EnumType.STRING)
    private Support support;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;

    @ManyToOne
    private Instructor instructor;

    public Course() {
    }

}
