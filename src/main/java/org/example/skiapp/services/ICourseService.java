package org.example.skiapp.services;

import org.example.skiapp.entities.Course;
import java.util.List;

public interface ICourseService {
    List<Course> retrieveAllCourses();
    Course addOrUpdateCourse(Course course);
    void removeCourse(Course course);
    Course retrieveCourse(Long numCourse);
}