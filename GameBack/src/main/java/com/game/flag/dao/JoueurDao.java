package com.game.flag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.flag.models.Joueur;


@Repository
public interface JoueurDao extends JpaRepository<Joueur,Long> {

}
