package com.armo;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branches> branches =  new ArrayList<Branches>();

    public Bank(String name) {
        this.name = name;
    }

    private int findBranch(String name){
        for (int i = 0; i < branches.size(); i++){
            if(name.equals(branches.get(i).getBranchName())){
                return i;
            }
        }

        return -1;
    }

    public int queryBranch(String name){
        return findBranch(name);
    }


    public boolean createNewBranch(String name){
        if (findBranch(name) > -1){
            return false;
        }

        Branches branch = new Branches(name);
        branches.add(branch);
        return true;
    }

    public boolean newCustomerToBranch(String branchName, String name, double initAmount){
        if (findBranch(branchName) == -1){
            return false;
        }

        int index = findBranch(branchName);
        if(branches.get(index).createNewCustomer(name,initAmount)){
            return true;
        }

        return false;

    }

    public boolean newTransactionToBranch(String branchName, String name, double amount){
        if (findBranch(branchName) == -1){
            return false;
        }

        int index = findBranch(branchName);
        if(branches.get(index).addNewTransaction(name,amount)){
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branches> getBranches() {
        return branches;
    }
}
