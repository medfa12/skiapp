package org.example.skiapp.services.impl;

import org.example.skiapp.entities.Registration;
import org.example.skiapp.repositories.RegistrationRepository;
import org.example.skiapp.services.IRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationServiceImpl implements IRegistrationService {

    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public List<Registration> retrieveAllRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration addOrUpdateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void removeRegistration(Registration registration) {
        registrationRepository.delete(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        Optional<Registration> registration = registrationRepository.findById(numRegistration);
        return registration.orElse(null);
    }
}