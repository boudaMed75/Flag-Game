package com.game.flag.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.flag.models.Country;

public interface CountryDao extends JpaRepository<Country,Integer>{
    Country findById(int id);
}
