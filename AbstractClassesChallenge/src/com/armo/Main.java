package com.armo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	    String name1 = "b";
//	    String name2 = "a";
//
//	    // a to b = -1
//        // b to a = 1
//      System.out.println(name1.compareTo(name2));

        MyLinkedList myLinkedList = new MyLinkedList();
        String data = "B A E D";
        String [] splitData = data.split(" ");
        for (String getData: splitData){
            myLinkedList.add(getData);
        }

        for (String name: myLinkedList.getValues()){
            System.out.println(name);
        }
    }
}
