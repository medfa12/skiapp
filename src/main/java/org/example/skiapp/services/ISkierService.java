package org.example.skiapp.services;

import org.example.skiapp.entities.Skier;
import java.util.List;

public interface ISkierService {
    List<Skier> retrieveAllSkiers();
    Skier addOrUpdateSkier(Skier skier);
    void removeSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
}