package org.example.skiapp.entities;



import jakarta.persistence.*;

@Entity

public class Registration {

    @Id
    private Long numRegistration;
    private int numWeek;

    @ManyToOne
    private Skier skier;

    @ManyToOne
    private Course course;

    public Registration() {
    }

    // Getters and setters
    public Long getNumRegistration() {
        return numRegistration;
    }

    public void setNumRegistration(Long numRegistration) {
        this.numRegistration = numRegistration;
    }

    public int getNumWeek() {
        return numWeek;
    }

    public void setNumWeek(int numWeek) {
        this.numWeek = numWeek;
    }

    public Skier getSkier() {
        return skier;
    }

    public void setSkier(Skier skier) {
        this.skier = skier;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
