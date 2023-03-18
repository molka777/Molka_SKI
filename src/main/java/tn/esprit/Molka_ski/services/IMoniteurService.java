package tn.esprit.Molka_ski.services;

import tn.esprit.Molka_ski.entities.Moniteur;
import java.util.List;
public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Integer numMoniteur);
}
