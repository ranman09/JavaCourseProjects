package com.armo;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    void setNext(ListItem newItem) {
        this.rightLink = newItem;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    void setPrevious(ListItem newItem) {
        this.leftLink = newItem;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) this.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
