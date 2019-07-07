package com.armo;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList() {
        root = null;
    }

    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean add(ListItem newItem) {

        if (newItem != null){

            if (root == null){
                root = newItem;
                return true;
            }

            ListItem itemCompare = root;
            while (itemCompare != null) {
                int compare = itemCompare.compareTo(newItem);
                if (compare < 0){
                    // item greater, put to next if possible
                    // move to next until there is no more data or null
                    if (itemCompare.next() != null){
                        itemCompare = itemCompare.next();
                    } else {
                        // end of the list because null is detected
                        itemCompare.setNext(newItem);
                        newItem.setPrevious(itemCompare);
                        return true;
                    }
                } else if (compare > 0){
                    // item lesser, put to previous if possible
                    if (itemCompare.previous() != null){
                        // item found in previous
                        itemCompare.previous().setNext(newItem);
                        newItem.setPrevious(itemCompare.previous());
                        newItem.setNext(itemCompare);
                        itemCompare.setPrevious(newItem);
                    } else {
                        //no item found in previous, meaning at root
                        newItem.setNext(this.root);
                        this.root.setPrevious(newItem);
                        root = newItem;
                    }
                    return true;
                } else {
                    System.out.println(newItem.getValue() + " is already in the list.");
                    return false;
                }
            }

        }

        return false;
    }

    @Override
    public boolean remove(ListItem item) {

        if (item != null){
            System.out.println("Deleting " + item.getValue());
        }

        ListItem itemCompare = root;

        while(itemCompare != null) {
            int compare = itemCompare.compareTo(item);

            if (compare == 0){
                if(itemCompare == root){
                    root = itemCompare.next();

                } else {
                    itemCompare.previous().setNext(itemCompare.next());
                    if (itemCompare.next() != null){
                        itemCompare.next().setPrevious(itemCompare.previous());
                    }

                }

                return true;

            } else {
                itemCompare = itemCompare.next();
            }

        }

        return false;
    }

    @Override
    public void traverse(ListItem startRoot) {
        if (startRoot == null){
            System.out.println("List is empty");
        } else {
            while(startRoot != null){
                System.out.println(startRoot.getValue());
                startRoot = startRoot.next();
            }
        }
    }
}
