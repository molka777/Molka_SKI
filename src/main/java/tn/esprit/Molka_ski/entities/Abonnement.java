package tn.esprit.Molka_ski.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    int id;
    Long numAbon;
    LocalDate dateDebut;
    LocalDate dateFin;
    Float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbon;
}
