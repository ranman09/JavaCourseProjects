package com.armo;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static Bank bank = new Bank("Banko!");

    public static void main(String[] args) {

        boolean quit = false;

        System.out.println("Banko System Loading..\nWelcome!");
        displaySelections();
        while(!quit){
            System.out.print("Please enter selection (7): ");
            int selection = s.nextInt();
            s.nextLine();

            switch (selection){
                case 1:
                    System.out.print("Enter branch name: ");
                    String branchName = s.nextLine();
                    addNewBranch(branchName);
                    break;
                case 2:
                    System.out.print("Enter branch name: ");
                    branchName = s.nextLine();
                    System.out.print("Enter new customer name: ");
                    String customerName = s.nextLine();
                    System.out.print("Enter initial amount: ");
                    double initAmount = s.nextDouble();
                    s.nextLine();

                    addCustomerToBranch(branchName,customerName,initAmount);
                    break;
                case 3:
                    System.out.print("Enter branch name: ");
                    branchName = s.nextLine();
                    System.out.print("Enter customer name: ");
                    customerName = s.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = s.nextDouble();

                    addCustomerTransaction(branchName,customerName,amount);
                    break;
                case 4:
                    listAllBranches();
                    break;
                case 5:
                    System.out.print("Enter branch name: ");
                    branchName = s.nextLine();
                    listBranchCustomers(branchName);
                    break;
                case 6:
                    System.out.print("Enter branch name: ");
                    branchName = s.nextLine();
                    System.out.print("Enter customer name: ");
                    customerName = s.nextLine();

                    listCustomerTransactions(branchName,customerName);
                    break;
                case 7:
                    displaySelections();
                    break;
                case 8:
                    System.out.println("System shutting down");
                    quit = true;
                    break;
            }
        }
    }

    public static void addNewBranch(String branchName){
        if(bank.createNewBranch(branchName)){
            System.out.println("- Successfully created a new Branch");
        } else {
            System.out.println("- Branch already exist");
        }
    }

    public static void addCustomerToBranch(String branchName, String name, double initAmount){
        if(bank.newCustomerToBranch(branchName,name,initAmount)){
            System.out.println("- Successfully added a customer");
        } else {
            System.out.println("- Branch does not exist or Customer already in branch");
        }
    }

    public static void addCustomerTransaction(String branchName, String name, double amount){

        if (bank.newTransactionToBranch(branchName, name, amount)){
            System.out.println("- Successfully added the transactions");
        } else {
            System.out.println("- Branch does not exist or Customer does not exist");
        }
    }

    public static void listBranchCustomers(String branchName){
        int index = bank.queryBranch(branchName);
        if (index >= 0){
            System.out.println("***********************************");
            System.out.println("List of customers in branch " + branchName + ": ");
            for (int i = 0; i < bank.getBranches().get(index).getCustomers().size(); i++){
                System.out.println((i+1) + ". " + bank.getBranches().get(index).getCustomers().get(i).getName());
            }
            System.out.println("***********************************");
        } else {
            System.out.println("- Branch not found.");
        }

    }

    public static void listCustomerTransactions(String branchName, String name){
        int index = bank.queryBranch(branchName);
        int index1 = bank.getBranches().get(index).queryCustomer(name);
        if (index > -1 && index1 > -1){
            System.out.println("***********************************");
            System.out.println("List of transactions in " + name + " on branch " + branchName + ": ");
            for (int i = 0; i < bank.getBranches().get(index).getCustomers().get(index1).getTransactions().size(); i++){
                System.out.println((i+1) + ". " + name
                        + ", " + bank.getBranches().get(index).getCustomers().get(index1).getTransactions().get(i));
            }
            System.out.println("***********************************");
        } else {
            System.out.println("- Branch does not exist or Customer does not exist");
        }
    }

    public static void displaySelections(){
        System.out.println("***********************************");
        System.out.println("1. Add a new Branch\n" +
                "2. Add customer to a branch\n" +
                "3. Add customer transaction\n" +
                "4. List all branches\n" +
                "5. List branch customers\n" +
                "6. List customer transactions\n" +
                "7. Display selection\n" +
                "8. Quit");
        System.out.println("***********************************");
    }

    public static void listAllBranches(){
        System.out.println("***********************************");
        System.out.println("List of branches in " + bank.getName() + ":");
        for (int i = 0; i < bank.getBranches().size(); i++){
            System.out.println((i+1) + ". " + bank.getBranches().get(i).getBranchName()
            + ", " + bank.getBranches().get(i).getCustomers().size());
        }
        System.out.println("***********************************");
    }
}
