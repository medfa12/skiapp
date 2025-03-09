package org.example.skiapp.repositories;

import org.example.skiapp.entities.Course;
import org.example.skiapp.enums.Support;
import org.example.skiapp.enums.TypeCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // Find courses by support type (SKI/SNOWBOARD).
    List<Course> findBySupport(Support support);

    // Find courses by course type (COLLECTIVE_CHILDREN, etc.).
    List<Course> findByTypeCourse(TypeCourse typeCourse);

    // Find courses for a specific instructor by numInstructor.
    List<Course> findByInstructor_NumInstructor(Long numInstructor);

    // Find courses with a price less than a certain value.
    List<Course> findByPriceLessThan(Double price);
}