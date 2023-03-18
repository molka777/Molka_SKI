package tn.esprit.Molka_ski.services;

import org.springframework.stereotype.Service;
import tn.esprit.Molka_ski.entities.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.Molka_ski.repositories.PisteRepository;

import java.util.List;

@Service
public class IPisteServiceImp implements IPisteService {
    @Autowired
    PisteRepository pisteRepository;


    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Integer numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }
}
