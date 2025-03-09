package org.example.skiapp.repositories;

import org.example.skiapp.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    // Find instructors by exact last name.
    List<Instructor> findByLastName(String lastName);

    // Find instructors hired before a certain date.
    List<Instructor> findByDateOfHireBefore(Date date);

    // Find instructors hired after a certain date.
    List<Instructor> findByDateOfHireAfter(Date date);

    // Find instructors by partial match on first/last name (case-insensitive).
    List<Instructor> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(
            String firstName, String lastName
    );
}