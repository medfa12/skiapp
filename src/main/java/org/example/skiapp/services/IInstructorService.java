package org.example.skiapp.services;

import org.example.skiapp.entities.Instructor;
import java.util.List;

public interface IInstructorService {
    List<Instructor> retrieveAllInstructors();
    Instructor addOrUpdateInstructor(Instructor instructor);
    void removeInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
}