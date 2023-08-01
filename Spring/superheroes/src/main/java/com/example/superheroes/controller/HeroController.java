package com.example.superheroes.controller;

import com.example.superheroes.model.Hero;
import com.example.superheroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class HeroController {

    @Autowired
    HeroService heroservice;

    @GetMapping("/heroes")
    public List<Hero> getAllHeroes(){
        return heroservice.getAllHeroes();
    }

    @PostMapping("/heroes")

    public HttpStatus saveNewHero(@RequestBody Hero hero){
        Hero result = heroservice.saveHero(hero);

        if (result == null){
            return HttpStatus.PRECONDITION_FAILED;
        }else{
            return HttpStatus.CREATED;
        }
    }

    @GetMapping("/heroes/{letter}")
    public List<Hero> getHeroesStartingWithLetter(@PathVariable String letter){
        return heroservice.getHeroesStartingWithLetter(letter);
    }

}
