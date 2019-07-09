package com.armo;

public class Main {

    public static void main(String[] args) {

        BasketballPlayer ryan = new BasketballPlayer("Ryan");
        BasketballPlayer randel = new BasketballPlayer("Randel");
        BasketballPlayer rodel = new BasketballPlayer("Rodel");

        Team<Basketball> basketballTeam = new Team<>("Basket Ball Team");
        basketballTeam.addMembers(ryan);
        basketballTeam.addMembers(randel);
        basketballTeam.addMembers(rodel);

        basketballTeam.printMembers();


    }
}
