package tn.esprit.Molka_ski.services;

import tn.esprit.Molka_ski.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Integer numSkieur);
    Skieur retrieveSkieur (Integer numSkieur);
    Skieur updateSkieur (Skieur skieur);

}
