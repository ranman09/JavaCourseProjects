package com.armo;

import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);
    static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {

	    boolean quit = false;
	    int select = 1;

        showSelection();

	    while (!quit){

            System.out.print("\nSelect an option: ");
            select = s.nextInt();
            s.nextLine();

            switch (select) {
                case 1:
                    showSelection();
                    break;
                case 2:
                    printListContacts();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    updateExistingContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    searchContact();
                    break;
                case 7:
                    System.out.println("Quiting program");
                    quit = true;
                    break;
                case 8:
                    testSearch();

            }
        }
    }

    public static void showSelection(){
        System.out.println("***************************************");
        System.out.println("Contact Numbers Phone");
        System.out.println("\t 1. Show menu selection");
        System.out.println("\t 2. All contacts");
        System.out.println("\t 3. Add new contact");
        System.out.println("\t 4. Update existing contact");
        System.out.println("\t 5. Remove a contact");
        System.out.println("\t 6. Search a contact");
        System.out.println("\t 7. Quit");
        System.out.println("***************************************");
    }

    public static void printListContacts(){
        myPhone.listContact();
    }

    public static void addNewContact(){
        myPhone.storeContact();
    }

    public static void updateExistingContact(){
        myPhone.modifyContact();
    }

    public static void removeContact(){
        myPhone.removeContact();
    }

    public static void searchContact(){
        myPhone.query();
    }

    public static void testSearch(){
        Contacts contacts = Contacts.createContact("Ryan","09231838628");
        System.out.println(myPhone.findContact(contacts));
    }
}
