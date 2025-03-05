package org.example.skiapp.entities;



import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity

public class Instructor {

    // Getters and setters
    @Id
    private Long numInstructor;
    private String firstName;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dateOfHire;

    @OneToMany
    Set<Course> courses;
    public Instructor() {
    }

}
