package org.example.skiapp.services;

import org.example.skiapp.entities.Registration;
import java.util.List;

public interface IRegistrationService {
    List<Registration> retrieveAllRegistrations();
    Registration addOrUpdateRegistration(Registration registration);
    void removeRegistration(Registration registration);
    Registration retrieveRegistration(Long numRegistration);
}