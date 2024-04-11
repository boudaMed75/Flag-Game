package com.game.flag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.flag.models.PlayerEntity;

@Repository
public interface PlayerDao extends JpaRepository<PlayerEntity,String> {
    
    
}
