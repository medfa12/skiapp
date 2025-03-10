package org.example.skiapp.services.impl;

import org.example.skiapp.entities.Skier;
import org.example.skiapp.repositories.SkierRepository;
import org.example.skiapp.services.ISkierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkierServiceImpl implements ISkierService {

    private final SkierRepository skierRepository;

    @Autowired
    public SkierServiceImpl(SkierRepository skierRepository) {
        this.skierRepository = skierRepository;
    }

    @Override
    public List<Skier> retrieveAllSkiers() {
        return skierRepository.findAll();
    }

    @Override
    public Skier addOrUpdateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public void removeSkier(Skier skier) {
        skierRepository.delete(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        Optional<Skier> skier = skierRepository.findById(numSkier);
        return skier.orElse(null);
    }
}