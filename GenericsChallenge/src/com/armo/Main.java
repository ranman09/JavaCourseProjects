package com.armo;

public class Main {

    public static void main(String[] args) {

        BasketballPlayer ryan = new BasketballPlayer("Ryan");
        BasketballPlayer randel = new BasketballPlayer("Randel");
        BasketballPlayer rodel = new BasketballPlayer("Rodel");

        Team<Basketball> basketballTeam = new Team<>("Basket Ball Team");
        basketballTeam.addMembers(ryan);

        Team<Basketball> basketballTeam1 = new Team<>("Basket Ball Team 1");
        basketballTeam1.addMembers(randel);

        Team<Basketball> basketballTeam2 = new Team<>("Basket Ball Team 2");
        basketballTeam2.addMembers(rodel);

        basketballTeam.matchWith(basketballTeam,1,0);
        basketballTeam.matchWith(basketballTeam1,0,1);
        basketballTeam.matchWith(basketballTeam2,1,0);

        League<Team<Basketball>> league = new League<>("Basketball League");

        league.addTeam(basketballTeam);
        league.addTeam(basketballTeam1);
        league.addTeam(basketballTeam2);

        league.printRanking();


    }
}
