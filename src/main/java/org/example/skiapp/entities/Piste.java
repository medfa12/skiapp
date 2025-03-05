package org.example.skiapp.entities;

import java.util.Set;
import org.example.skiapp.enums.Color;

import jakarta.persistence.*;

@Entity

public class Piste {

    @Id
    private Long numPiste;
    private String name;

    @Enumerated(EnumType.STRING)
    private Color color;

    private int length;
    private int slope;

    public Piste() {
    }
    @ManyToMany(mappedBy = "Pistes")
    Set<Skier> skiers;
    // Getters and setters
    public Long getNumPiste() {
        return numPiste;
    }

    public void setNumPiste(Long numPiste) {
        this.numPiste = numPiste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSlope() {
        return slope;
    }

    public void setSlope(int slope) {
        this.slope = slope;
    }
}
