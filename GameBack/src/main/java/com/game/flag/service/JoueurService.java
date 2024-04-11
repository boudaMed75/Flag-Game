package com.game.flag.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.flag.dao.JoueurDao;
import com.game.flag.models.Joueur;

@Service
public class JoueurService {

    @Autowired
    private JoueurDao joueurDao;

    public java.util.List<Joueur> findAll() {
        return joueurDao.findAll();
    }

    public Joueur findById(Long id) {
        return joueurDao.findById(id).orElse(null);
    }

    public Joueur save(Joueur joueur) {
        return joueurDao.save(joueur);
    }

    public void delete(Long id) {
        joueurDao.deleteById(id);
    }

}
