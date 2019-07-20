package com.armo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //creating all locations for our map
        locations.put(0,new Location(0, "You in your house coding Java."));
        locations.put(1,new Location(1, "You are in the Road"));
        locations.put(2,new Location(2, "You are in the Hill"));
        locations.put(3,new Location(3, "You are in the Building"));
        locations.put(4,new Location(4, "You are in the Valley"));
        locations.put(5,new Location(5, "You are in the Forest"));

        //we are now adding all exit to each locations

        locations.get(1).addExit("E", 2);
        locations.get(1).addExit("W", 3);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("S", 4);

        locations.get(2).addExit("N",5);

        locations.get(3).addExit("E",1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("E", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("E", 2);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","E");

        int loc = 1;

        while(true){
            System.out.println(locations.get(loc).getLocationDescription());

            if (loc == 0){
                break;
            }

            String rawDirection = scanner.nextLine().toUpperCase();

            if (rawDirection.length() > 1){
                String [] words = rawDirection.split(" ");
                for (String word: words){
                    if(vocabulary.containsKey(word)){
                        rawDirection = vocabulary.get(word);
                    }
                }

            }

            if (locations.get(loc).getExits().containsKey(rawDirection)) {
                loc = locations.get(loc).getExits().get(rawDirection);
            } else {
                System.out.println("You cannot go in that direction.");
            }


        }
    }
}
