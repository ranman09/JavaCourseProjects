package com.armo;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void  setBalance(int balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(int funds){
        balance += funds;
        System.out.println("Successfully deposited " + funds + " into account "
        + this.accountNumber + ".\n" + "The new balance is: " + this.balance + "\n");
    }

    public void withdrawFunds(int funds){
        if (!(funds > this.balance)){
            this.balance -= funds;
            System.out.println("Successfully withdrawn " + funds + " into account "
                    + this.accountNumber + ".\n" + "The new balance is: " + this.balance + "\n");
        } else {
            System.out.println("Insufficient balance. Current balance is: " + this.balance + "\n");
        }
    }



}
