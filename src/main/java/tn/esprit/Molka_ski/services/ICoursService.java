package tn.esprit.Molka_ski.services;
import tn.esprit.Molka_ski.entities.Cours;

import java.util.List;
public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Integer numCours);
}
