package tn.esprit.Molka_ski.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Molka_ski.entities.Moniteur;
import tn.esprit.Molka_ski.repositories.MoniteurRepository;

import java.util.List;
@Service
public class IMoniteurServiceImp implements IMoniteurService{
    @Autowired
    MoniteurRepository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Integer numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }
}
