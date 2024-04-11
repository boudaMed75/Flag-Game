package com.game.flag.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.flag.models.Joueur;
import com.game.flag.models.Partie;


@Repository
public interface PartieDao extends JpaRepository<Partie,Long>{

    List<Partie> findByJoueur(Joueur joueur);
    
}
