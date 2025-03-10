package org.example.skiapp.services.impl;

import org.example.skiapp.entities.Piste;
import org.example.skiapp.repositories.PisteRepository;
import org.example.skiapp.services.IPisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PisteServiceImpl implements IPisteService {

    private final PisteRepository pisteRepository;

    @Autowired
    public PisteServiceImpl(PisteRepository pisteRepository) {
        this.pisteRepository = pisteRepository;
    }

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addOrUpdatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void removePiste(Piste piste) {
        pisteRepository.delete(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        Optional<Piste> piste = pisteRepository.findById(numPiste);
        return piste.orElse(null);
    }
}