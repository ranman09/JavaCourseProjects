package com.armo;

import java.util.ArrayList;

public interface Saveable {
    int save(ArrayList<String> readValues);
    void printValues();
    String getPlayer(String playerName);
}
