package com.armo;

public abstract class ListItem {

    private Object value;
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract void setNext(ListItem newItem);
    abstract ListItem previous();
    abstract void setPrevious(ListItem newItem);
    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
