package com.armo;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String name, double duration){

        if (findSong(name) >= 0){
            return false;
        }

        songs.add(new Song(name,duration));
        return true;
    }

    private int findSong(String songName){
        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getName() == songName){
                return i;
            }
        }

        return -1;
    }

    public int querySong(String songName){
        return findSong(songName);
    }



}
