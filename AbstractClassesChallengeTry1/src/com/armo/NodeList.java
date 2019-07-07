package com.armo;

public interface NodeList {
    boolean add(ListItem newItem);
    boolean remove(ListItem item);
    void traverse(ListItem startRoot);
}
