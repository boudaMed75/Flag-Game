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

import com.game.flag.models.Jeu;
import com.game.flag.service.JeuService;

@RestController
@RequestMapping("/jeux")
public class JeuController {

    @Autowired
    private JeuService jeuService;

    @GetMapping("/")
    public List<Jeu> getAllJeux() {
        return jeuService.findAll();
    }

    @GetMapping("/{id}")
    public Jeu getJeuById(@PathVariable Long id) {
        return jeuService.findById(id);
    }

    @PostMapping("/")
    public Jeu createJeu(@RequestBody Jeu jeu) {
        return jeuService.save(jeu);
    }

    @DeleteMapping("/{id}")
    public void deleteJeu(@PathVariable Long id) {
        jeuService.delete(id);
    }

}
