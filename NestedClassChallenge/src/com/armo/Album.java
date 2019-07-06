package com.armo;

import java.util.ArrayList;

public class Album {
    private String title;
    private SongList songList = new SongList();

    public Album(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs(){
        return songList.getSongList();
    }

    public boolean addSong(String name, double duration){
        return songList.addSong(name,duration);
    }

    private int findSong(String songName){
        return songList.findSong(songName);
    }

    public int querySong(String songName){
        return findSong(songName);
    }

    //nested class
    private class SongList{
        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<>();
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }

        private int findSong(String songName){
            for (int i = 0; i < this.songList.size(); i++){
                if (this.songList.get(i).getName() == songName){
                    return i;
                }
            }

            return -1;
        }

        public boolean addSong(String name, double duration){
            if (findSong(name) >= 0){
                return false;
            }

            songList.add(new Song(name,duration));
            return true;
        }





    }



}
