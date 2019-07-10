package com.armo;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private String name;
    private ArrayList<T> team;

    public League(String name) {
        this.name = name;
        team = new ArrayList<>();
    }

    public ArrayList<T> getTeam() {
        return team;
    }

    public boolean addTeam(T team){
        this.team.add(team);
        return true;
    }

    public void printTeams(){
        System.out.println("Teams for League" + this.name);
        for(T team: team){
            System.out.println(team.getName() + " Team");
        }
    }

    public void printRanking(){
        Collections.sort(team);
        for(T t: team){
            System.out.println(t.ranking() + " " + t.getName());
        }
    }








}
