package tn.esprit.Molka_ski.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Molka_ski.entities.Cours;
import tn.esprit.Molka_ski.repositories.CoursRepository;

import java.util.List;
@Service
public class ICoursServiceImp implements ICoursService {
    @Autowired
    CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours retrieveCours(Integer numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }
}
