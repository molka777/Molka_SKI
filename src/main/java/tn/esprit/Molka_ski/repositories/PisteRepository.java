package tn.esprit.Molka_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Molka_ski.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Integer> {
}
