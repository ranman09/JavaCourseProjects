package com.armo;

import java.util.ArrayList;

public class League<T extends Sport>{
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






}
