package tn.esprit.Molka_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Molka_ski.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Integer> {
}
