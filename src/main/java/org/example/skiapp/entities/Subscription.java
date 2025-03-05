package org.example.skiapp.entities;

import jakarta.persistence.*;
import org.example.skiapp.enums.TypeSubscription;

import java.util.Date;

@Entity
public class Subscription {

    @Id
    private Long numSub;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private Float price;

    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;

    @ManyToOne
    @JoinColumn(name = "numSkier", nullable = false)
    private Skier skier;

    // Constructors
    public Subscription() {
    }

    public Subscription(Long numSub, Date startDate, Date endDate, Float price, TypeSubscription typeSub, Skier skier) {
        this.numSub = numSub;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.typeSub = typeSub;
        this.skier = skier;
    }

    // Getters and setters
    public Long getNumSub() {
        return numSub;
    }

    public void setNumSub(Long numSub) {
        this.numSub = numSub;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public TypeSubscription getTypeSub() {
        return typeSub;
    }

    public void setTypeSub(TypeSubscription typeSub) {
        this.typeSub = typeSub;
    }

    public Skier getSkier() {
        return skier;
    }

    public void setSkier(Skier skier) {
        this.skier = skier;
    }
}
