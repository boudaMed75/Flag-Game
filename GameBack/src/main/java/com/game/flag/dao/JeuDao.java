package com.game.flag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.flag.models.Jeu;

@Repository
public interface JeuDao extends JpaRepository<Jeu,Long>{

}
