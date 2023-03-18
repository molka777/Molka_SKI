package tn.esprit.Molka_ski.entities;

import javax.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    int id;
    Long numInscription;
    int numSemaine;
    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Cours cours;
}
