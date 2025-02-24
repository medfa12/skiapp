package org.example.skiapp.repositories;

import org.example.skiapp.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}
