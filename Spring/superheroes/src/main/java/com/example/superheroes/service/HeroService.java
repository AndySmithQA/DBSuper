package com.example.superheroes.service;

import com.example.superheroes.model.Hero;
import com.example.superheroes.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public List<Hero> getHeroesStartingWithLetter(String letter){
        String letterParam = letter +"%";
        List<Hero> heroes = heroRepository.findHeroesNamesStartingWithLetter(letterParam);
        return heroes;
    }

    public List<Hero> getAllHeroes(){
        return heroRepository.findAll();
    }

    public List<Hero> getLast3HeroesByName(){
        return heroRepository.findTop3ByOrderByNameDesc();
    }

    public Hero saveHero(Hero hero){
        return heroRepository.save(hero);
    }

}
