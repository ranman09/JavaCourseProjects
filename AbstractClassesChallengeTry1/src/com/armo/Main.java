package com.armo;

public class Main {

    public static void main(String[] args) {
	    MyLinkedList myLinkedList = new MyLinkedList();

	    String rawData = "9 8 7 8 9 2 3 1";
	    String [] splitData = rawData.split(" ");
	    for (String data: splitData){
	        myLinkedList.add(new Node(data));
			System.out.println("Added: " + data);
        }

	    myLinkedList.traverse(myLinkedList.getRoot());

	    myLinkedList.remove(new Node("8"));
		myLinkedList.traverse(myLinkedList.getRoot());
		myLinkedList.remove(new Node("1"));
		myLinkedList.traverse(myLinkedList.getRoot());
		myLinkedList.remove(new Node("1"));
		myLinkedList.traverse(myLinkedList.getRoot());
		myLinkedList.remove(new Node("3"));
		myLinkedList.traverse(myLinkedList.getRoot());
		myLinkedList.add(new Node("4"));
		myLinkedList.traverse(myLinkedList.getRoot());
		myLinkedList.remove(new Node("4"));
		myLinkedList.traverse(myLinkedList.getRoot());
		myLinkedList.remove(new Node("7"));
		myLinkedList.traverse(myLinkedList.getRoot());
		myLinkedList.remove(new Node("9"));
		myLinkedList.traverse(myLinkedList.getRoot());
		myLinkedList.remove(new Node("2"));
		myLinkedList.traverse(myLinkedList.getRoot());


    }
}
