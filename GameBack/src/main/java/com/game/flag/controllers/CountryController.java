package com.game.flag.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.flag.models.Country;
import com.game.flag.service.CountryService;

@RestController
@RequestMapping("")
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService){
        this.countryService = countryService;
    }

    @CrossOrigin(origins = "http://localhost:8100/")
    @GetMapping("/contry")
    public List<Country> getContry(@RequestParam("id") Integer id){
        System.out.println(countryService.ResponseContry(id));
        return countryService.ResponseContry(id);

    }
    
}
