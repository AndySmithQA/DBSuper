package com.example.superheroes.model;

import jakarta.persistence.*;

@Entity
@Table(name="heroes")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String alias;

    private String superpower;

    private int teamID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamId) {
        this.teamID = teamId;
    }

    public String toString(){
        return "Hero" + id + name + alias + superpower + teamID;
    }
}
