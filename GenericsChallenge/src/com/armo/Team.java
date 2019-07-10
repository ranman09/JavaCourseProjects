package com.armo;

import java.util.ArrayList;

public class Team<T extends Sport> implements Comparable<Team<T>>{

    private String name;
    private int wins;
    private int loses;
    private int draws;
    private int plays;

    private ArrayList<T> members;

    public Team(String name) {
        this.name = name;
        wins = 0;
        loses = 0;
        draws = 0;
        members = new ArrayList<>();
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public int getPlays() {
        return plays;
    }

    public boolean addMembers(T member){
        members.add(member);
        return true;
    }

    public void printMembers(){
        System.out.println("Players for team " + this.name);
        for(T member: members){
            System.out.println(member.getName());
        }
    }

    public void matchWith(Team<T> opponentTeam, int ourScore, int theirScore){
        String message;

        if(ourScore > theirScore){
            this.wins++;
            message = " Wins ";
        } else if (theirScore > ourScore){
            loses++;
            message = " Loss ";
        } else {
            draws++;
            message = " Draws ";
        }
        plays++;

        if(opponentTeam != null) {
            opponentTeam.matchWith(null, theirScore, ourScore);
            System.out.println(this.name + message + " in the match with " + opponentTeam.getName());
        }


    }

    public int ranking(){
        return (this.wins * 2) + draws;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.ranking() > o.ranking()){
            return -1;
        } else if (this.ranking() < o.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
