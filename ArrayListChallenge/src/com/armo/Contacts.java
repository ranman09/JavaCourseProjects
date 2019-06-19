package com.armo;

public class Contacts {
    private String name;
    private String number;

    public Contacts (String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }
}
