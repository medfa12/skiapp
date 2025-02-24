package org.example.skiapp.entities;


import org.example.skiapp.enums.TypeSubscription;

import jakarta.persistence.*;
import java.util.Date;

@Entity

public class Skier {

    @Id
    private Long numSkier;
    private String firstName;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String city;

    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSubscription;

    public Skier() {
    }

    // Getters and setters
    public Long getNumSkier() {
        return numSkier;
    }

    public void setNumSkier(Long numSkier) {
        this.numSkier = numSkier;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TypeSubscription getTypeSubscription() {
        return typeSubscription;
    }

    public void setTypeSubscription(TypeSubscription typeSubscription) {
        this.typeSubscription = typeSubscription;
    }
}
