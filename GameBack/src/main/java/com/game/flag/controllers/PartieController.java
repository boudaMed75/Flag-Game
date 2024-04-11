package com.game.flag.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.flag.DTO.PartieResDTO;
import com.game.flag.DTO.PartiesDTO;
import com.game.flag.models.Partie;
import com.game.flag.service.PartieService;

@RestController
@RequestMapping("/parties")
public class PartieController {

    @Autowired
    private PartieService partieService;

    @GetMapping("/")
    public List<Partie> getAllParties() {
        return partieService.findAll();
    }

    @GetMapping("/{id}")
    public Partie getPartieById(@PathVariable Long id) {
        return partieService.findById(id);
    }

    @PostMapping("/")
    public Partie createPartie(@RequestBody PartiesDTO partie) {
        return partieService.save(partie);
    }

    @DeleteMapping("/{id}")
    public void deletePartie(@PathVariable Long id) {
        partieService.delete(id);
    }

    @GetMapping("/joueur/{idJoueur}")
    public List<PartieResDTO> getPartiesByJoueur(@PathVariable Long idJoueur) {
        return partieService.findPartiesByJoueur(idJoueur);
    }

}
