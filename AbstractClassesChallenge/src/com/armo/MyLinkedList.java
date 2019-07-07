package com.armo;

import java.util.ArrayList;

public class MyLinkedList {
    private ArrayList<String> values = new ArrayList();
    private int listIndex;
    private int searchIndex;

    public MyLinkedList() {
        this.values = new ArrayList<>();
        this.listIndex = 0;
        this.searchIndex = 0;
    }

    public ArrayList<String> getValues() {
        return this.values;
    }

    public String moveNext(){
        if (this.values.size() <= 0 || this.listIndex >= this.values.size()){
            return null;
        }
        this.listIndex++;
        return this.values.get(this.listIndex - 1);
    }

    public String movePrevious(){
        if (this.values.size() <= 0 || this.listIndex <= 0){
            return null;
        }
        this.listIndex--;
        return this.values.get(this.listIndex);
    }

    public int compareTo(String string){
        return this.values.get(this.listIndex).compareTo(string);
    }

    public int compareTo(int index, String string){
        return this.values.get(this.searchIndex).compareTo(string);
    }

    public void remove(){
        this.values.remove(this.listIndex);
    }

    public void add(String string){

        if (getValues().size() != 0){
            if (compareTo(searchIndex,string) > 0){
                getValues().add(0,string);
                searchIndex = 0;
            } else if (compareTo(searchIndex, string) < 0){
                if (searchIndex < getValues().size()-1){
                    searchIndex++;
                    add(string);
                } else {
                    getValues().add(string);
                    searchIndex = 0;
                }

            }
        } else {
            getValues().add(string);
        }

    }









}
