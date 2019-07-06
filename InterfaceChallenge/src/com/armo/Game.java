package com.armo;

import java.util.ArrayList;

public class Game implements Saveable{
    private ArrayList<String> playerArrayList;

    public Game() {
        this.playerArrayList = new ArrayList<>();
    }

    public ArrayList<String> getPlayerArrayList() {
        return playerArrayList;
    }

    @Override
    public int save(ArrayList<String> readValues) {

        if(readValues.size() > 0){
            this.playerArrayList.addAll(readValues);
            System.out.println(this.playerArrayList.size());
            return 1;
        }

        return 0;
    }

    @Override
    public void printValues() {
        for (String playerName: this.playerArrayList){
            System.out.println(playerName);
            System.out.println("----------------------");
        }
    }

    @Override
    public String getPlayer(String name) {

        for (int i = 0; i <= this.playerArrayList.size(); i++){
            if(this.playerArrayList.get(i).equals(name)){
                return i+1 + "." + name;
            }
        }

        return null;
    }
}
