package tn.esprit.Molka_ski.services;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Molka_ski.entities.Skieur;
import tn.esprit.Molka_ski.repositories.SkieurRepository;

import java.util.List;
@Service
public class ISkieurServiceImp implements ISkieurService {
    @Autowired
    SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Integer numSkieur) {
        skieurRepository.deleteById(numSkieur);

    }

    @Override
    public Skieur retrieveSkieur(Integer numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }
}
