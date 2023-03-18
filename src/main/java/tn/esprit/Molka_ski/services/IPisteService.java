package tn.esprit.Molka_ski.services;

import tn.esprit.Molka_ski.entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Integer numPiste);
}
