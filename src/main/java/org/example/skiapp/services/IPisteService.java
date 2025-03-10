package org.example.skiapp.services;

import org.example.skiapp.entities.Piste;
import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addOrUpdatePiste(Piste piste);
    void removePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
}