package com.armo;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationId;
    private final String locationDescription;
    private Map<String, Integer> exits; //all locations can have their own map of exits.

    public Location(int locationId, String locationDescription) {
        this.locationId = locationId;
        this.locationDescription = locationDescription;
        exits = new HashMap<>();
        exits.put("Q",0);
    }

    public void addExit(String direction, int locationId){
        exits.put(direction, locationId);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits); // here we will return a copy of the exits map not reference it.
    }
}
