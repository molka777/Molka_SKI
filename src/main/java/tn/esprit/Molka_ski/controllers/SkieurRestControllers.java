package tn.esprit.Molka_ski.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Molka_ski.entities.Skieur;
import tn.esprit.Molka_ski.services.ISkieurService;
@RestController
@RequestMapping("/skieur")
public class SkieurRestControllers {
    @Autowired
    ISkieurService iSkieurService;
    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return iSkieurService.addSkieur(skieur);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return iSkieurService.updateSkieur(skieur);
    }

        @GetMapping("/{numSkieur}")
    public Skieur retrieveSkieur(@PathVariable Integer numSkieur) {
        return iSkieurService.retrieveSkieur(numSkieur);
    }
}
