package com.armo;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions.add(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
