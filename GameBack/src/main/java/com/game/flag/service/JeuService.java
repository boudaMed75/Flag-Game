package com.game.flag.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.flag.dao.JeuDao;
import com.game.flag.models.Jeu;


@Service
public class JeuService {

    @Autowired
    private JeuDao jeuDao;

    public List<Jeu> findAll() {
        return jeuDao.findAll();
    }

    public Jeu findById(Long id) {
        return jeuDao.findById(id).orElse(null);
    }

    public Jeu save(Jeu jeu) {
        return jeuDao.save(jeu);
    }

    public void delete(Long id) {
        jeuDao.deleteById(id);
    }

}
