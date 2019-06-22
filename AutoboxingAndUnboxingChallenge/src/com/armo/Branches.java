package com.armo;

import java.util.ArrayList;

public class Branches {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branches(String branchName) {
        this.branchName = branchName;
    }

    private int findCustomer(String name){
        for (int i = 0; i < customers.size(); i++){
            if(name.equals(customers.get(i).getName())){
                return i;
            }
        }

        return -1;
    }

    public int queryCustomer(String name){
        return findCustomer(name);
    }

    public boolean createNewCustomer(String name, double initAmount){

        if(findCustomer(name) > -1){
            return false;
        }

        Customer customer = new Customer(name,initAmount);
        customers.add(customer);
        return true;
    }

    public boolean addNewTransaction(String name, double amount){

        if(findCustomer(name) == -1){
            return false;
        }

        int index = findCustomer(name);
        customers.get(index).addTransaction(amount);
        return true;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
