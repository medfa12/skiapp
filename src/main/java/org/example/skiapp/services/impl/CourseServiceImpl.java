package org.example.skiapp.services.impl;

import org.example.skiapp.entities.Course;
import org.example.skiapp.repositories.CourseRepository;
import org.example.skiapp.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements ICourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> retrieveAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course addOrUpdateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseRepository.delete(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        Optional<Course> course = courseRepository.findById(numCourse);
        return course.orElse(null);
    }
}