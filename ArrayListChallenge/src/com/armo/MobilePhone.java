package com.armo;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contacts> contactList = new ArrayList<Contacts>();
    private Scanner s = new Scanner(System.in);

    public MobilePhone() {
    }

    public void storeContact(){
        System.out.print("Enter contact name: ");
        String name = s.nextLine();
        System.out.print("Enter contact number: ");
        String number = s.nextLine();

        Contacts contact = Contacts.createContact(name,number);

        this.contactList.add(contact);
        System.out.println("- Successfully added " + contact.getName() + " with number " + contact.getNumber());
    }

    public void removeContact(){
        System.out.print("Enter contact name to remove: ");
        String name = s.nextLine();

        int contactIndex = findContact(name);

        if (contactIndex != -1){
            contactList.remove(contactIndex);
            System.out.println("- Successfully removed " + name);
        } else {
            System.out.println("- Contact not found.");
        }
    }

    public void listContact(){
        if (contactList.size() > 0) {
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println((i + 1) + ". " + contactList.get(i).getName() + " " + contactList.get(i).getNumber());
            }
        } else  {
            System.out.printf("- No contacts found.");
        }
    }

    public void modifyContact(){
        System.out.print("Enter contact name to modify: ");
        String name = s.nextLine();

        int contactIndex = findContact(name);

        if (contactIndex != -1) {
            System.out.print("Enter new contact name: ");
            name = s.nextLine();
            System.out.print("Enter new contact number: ");
            String contactNumber = s.nextLine();

            contactList.set(contactIndex, new Contacts(name,contactNumber));

            System.out.println("- Successfully modified contact.");
        } else {
            System.out.println("- Contact not found");
        }
    }

    public void query(){
        System.out.print("Enter contact name to search: ");
        String name = s.nextLine();

        int contactIndex = findContact(name);

        if (contactIndex != -1) {
            System.out.println("- Contact found");
            System.out.println((contactIndex+1) + ". " + contactList.get(contactIndex).getName() +
                    " " + contactList.get(contactIndex).getNumber());
        } else {
            System.out.println("- Contact not found");
        }

    }

    private int findContact(String name){
        for (int i = 0; i < (contactList.size()); i++){
            if (contactList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;

    }

    public int findContact(Contacts contacts){
        return contactList.indexOf(contacts);
    }
}
