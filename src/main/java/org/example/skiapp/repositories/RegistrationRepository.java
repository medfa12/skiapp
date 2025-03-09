package org.example.skiapp.repositories;

import org.example.skiapp.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    // Find registrations for a specific skier by the skier’s numSkier.
    List<Registration> findBySkier_NumSkier(Long numSkier);

    // Find registrations for a specific course by the course’s numCourse.
    List<Registration> findByCourse_NumCourse(Long numCourse);

    // Find registrations by the week number.
    List<Registration> findByNumWeek(int numWeek);

    // Count how many registrations exist for a given course.
    long countByCourse_NumCourse(Long numCourse);

    // Find registrations in a range of week numbers.
    List<Registration> findByNumWeekBetween(int startWeek, int endWeek);
}