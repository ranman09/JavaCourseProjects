package com.armo;

public class Main {

    public static void main(String[] args) {
//	    BankAccount account1 = new BankAccount();
//
//	    account1.setAccountNumber(12);
//	    account1.setCustomerName("Ryan Maniego");
//	    account1.setBalance(13000);
//	    account1.setEmail("ryanellmaniego.rm@gmail.com");
//	    account1.setPhoneNumber(9231838628l);
//
//        System.out.println("Account details: \n" +
//                "Account number: " + account1.getAccountNumber() + "\n" +
//                "Customer name:" + account1.getCustomerName() + "\n" +
//                "Balance: " + account1.getBalance() + "\n" +
//                "Email : " + account1.getEmail() + "\n" +
//                "Phone Number : " + account1.getPhoneNumber() + "\n");
//
//        account1.depositFunds(500);
//        account1.withdrawFunds(13500);

        VipCustomer vip1 = new VipCustomer("Ryan", 100_000.0d, "ryan@mail.com");
        VipCustomer vip2 = new VipCustomer("Rodel", "rodel@mail.com");
        VipCustomer vip3 = new VipCustomer();

        printObject(vip1);
        printObject(vip2);
        printObject(vip3);


    }

    public static void printObject(VipCustomer vip){
        System.out.println("Object details: \n" +
                "Name : " + vip.getName() + "\n" +
                "Credit Limit: " + vip.getCreditLimit() + "\n" +
                "Email: " + vip.getEmail() + "\n") ;
    }
}
