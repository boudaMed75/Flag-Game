package com.game.flag.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.flag.dao.PlayerDao;
import com.game.flag.models.PlayerEntity;
import com.game.flag.service.PlayerService;

@RestController
@RequestMapping("/Player")
public class MainController {
    private PlayerService playerService;

    public MainController(PlayerService playerService){
        this.playerService = playerService ;
    }

    @CrossOrigin(origins = "http://localhost:8100/")
    @PostMapping("")
    public PlayerEntity save(@RequestBody PlayerEntity playerEntity){
        return playerService.save(playerEntity);
    }


    @CrossOrigin(origins = "http://localhost:8100/")
    @GetMapping("/sore")
    public ResponseEntity<PlayerEntity> getPlayer(@RequestParam("playerId") String playerId){
        PlayerEntity playerEntity = playerService.findById(playerId);

        if(playerEntity == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(playerEntity, HttpStatus.OK);

    }
    @CrossOrigin(origins = "http://localhost:8100/")
    @GetMapping("UpdateAndGet")
    public Integer getScore(@RequestParam("playerId") String id){
        return playerService.updateAndGetScore(id);
    }



}
