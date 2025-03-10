package org.example.skiapp.services.impl;

import org.example.skiapp.entities.Instructor;
import org.example.skiapp.repositories.InstructorRepository;
import org.example.skiapp.services.IInstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements IInstructorService {

    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instructor> retrieveAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor addOrUpdateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void removeInstructor(Instructor instructor) {
        instructorRepository.delete(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        Optional<Instructor> instructor = instructorRepository.findById(numInstructor);
        return instructor.orElse(null);
    }
}