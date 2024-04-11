package com.game.flag.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.game.flag.dao.PlayerDao;
import com.game.flag.models.PlayerEntity;


@Service
public class PlayerService {
    
    private PlayerDao playerDao;
    private ModelMapper modelMapper;

    public PlayerService(PlayerDao playerDao,ModelMapper modelMapper){
        this.modelMapper = modelMapper ;
        this.playerDao = playerDao;
    }


    public PlayerEntity save(PlayerEntity playerEntity){


        PlayerEntity pla = findById(playerEntity.getId());

        if(pla==null){
            return playerDao.save(playerEntity);
        }
        else{
            return pla;
        }

        

    }

    public PlayerEntity findById(String id){
        return playerDao.findById(id).orElse(null);
    }


    public Integer updateAndGetScore(String id){
        PlayerEntity pla = findById(id);

        
        pla.setSore(pla.getSore() + 1);
        PlayerEntity saved = playerDao.save(pla);
        return saved.getSore();

        
    }

    

    
}
