package org.example.skiapp.repositories;

import org.example.skiapp.entities.Skier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkierRepository extends JpaRepository<Skier, Long> {
}
