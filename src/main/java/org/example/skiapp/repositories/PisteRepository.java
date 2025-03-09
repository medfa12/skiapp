package org.example.skiapp.repositories;

import org.example.skiapp.entities.Piste;
import org.example.skiapp.enums.Color;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PisteRepository extends JpaRepository<Piste, Long> {
    // Find pistes by color.
    List<Piste> findByColor(Color color);

    // Find pistes whose name matches (case-sensitive or case-insensitive).
    List<Piste> findByNameContainingIgnoreCase(String name);

    // Find pistes by slope value.
    List<Piste> findBySlope(int slope);

    // Find pistes within a specified length range.
    List<Piste> findByLengthBetween(int minLength, int maxLength);
}