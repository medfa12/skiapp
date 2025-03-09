package org.example.skiapp.repositories;

import org.example.skiapp.entities.Skier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface SkierRepository extends JpaRepository<Skier, Long> {

    // Find all skiers with a particular last name.
    List<Skier> findAllByLastName(String lastName);

    // Find skiers born before the specified date.
    List<Skier> findByDateOfBirthBefore(Date date);

    // Find skiers born after the specified date.
    List<Skier> findByDateOfBirthAfter(Date date);

    // Find skiers whose first name or last name contains a substring (ignore case).
    List<Skier> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(
            String firstName, String lastName
    );

    // Count skiers by last name.
    long countByLastName(String lastName);
}