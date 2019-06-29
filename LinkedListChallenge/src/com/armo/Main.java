package com.armo;

import java.util.*;

public class Main {

    static LinkedList<Song> playlist = new LinkedList<>();
    static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {


        albums.add(new Album("Air Supply"));

        albums.get(0).addSong("Air Supply Track 1",1.23);
        albums.get(0).addSong("Air Supply Track 2",1.40);
        albums.get(0).addSong("Air Supply Track 3",2.23);
        albums.get(0).addSong("Air Supply Track 4",3.23);
        albums.get(0).addSong("Air Supply Track 5",1.50);

        albums.add(new Album("Bee gees"));

        albums.get(1).addSong("Bee gees Track 1",1.50);
        albums.get(1).addSong("Bee gees Track 2",2.50);
        albums.get(1).addSong("Bee gees Track 3",3.50);
        albums.get(1).addSong("Bee gees Track 4",1.30);
        albums.get(1).addSong("Bee gees Track 5",1.20);

        printAlbum(albums);

        addSongToPlaylist("Bee gees Track 5");
        addSongToPlaylist("Bee gees Track 6"); // not in the list
        addSongToPlayList(albums.get(0), 2);
        addSongToPlayList(albums.get(1), 3);
        addSongToPlayList(albums.get(0), 4);
        addSongToPlayList(albums.get(1), 5);
        addSongToPlayList(albums.get(0), 6); // not in the list

        printAlbum(albums);

        printPlaylist();

        runPlayList();

    }

    private static void printAlbum(ArrayList<Album> arrayListAlbum){
        for (Album toCheckAlbum: arrayListAlbum){
            System.out.println("Album Title: " + toCheckAlbum.getTitle());
            System.out.println("Song List:");
            for (Song toCheckSong:toCheckAlbum.getSongs()){
                System.out.println(toCheckSong.toString());
            }
            System.out.println("================================");
        }

    }

    private static void printPlaylist(){
        System.out.println("Song in Playlist:");
        for (Song song: playlist){
            System.out.println(song.toString());
        }
        System.out.println("================================");
    }

    private static void addSongToPlaylist(String songName){
        boolean added = false;
        //song is in a album
        for (Album albumToCheck: albums){
            int index = albumToCheck.querySong(songName);
            if ( index >= 0){
                playlist.add(albumToCheck.getSongs().get(index));
                added = true;
            }
        }

        if (added)
            System.out.println("Song "+ songName + " successfully added.");
        else
            System.out.println("Song is not in any Album.");

        System.out.println("================================");

    }

    private static void addSongToPlayList(Album albumToCheck, int trackNumber){
        boolean added = false;

        if (trackNumber != 0 && trackNumber <= albumToCheck.getSongs().size()){

            trackNumber -= 1;
            playlist.add(albumToCheck.getSongs().get(trackNumber));
            added = true;

        }

        if (added){
            System.out.println("Song " + albumToCheck.getSongs().get(trackNumber) + " successfully added.");
        } else  {
            System.out.println("Track number is not the album");
        }

        System.out.println("================================");
    }

    private static void listOptions(){
        System.out.println("Please select: \n" +
                "0 - quit \n" +
                "1 - forward \n" +
                "2 - backward \n" +
                "3 - replay current\n" +
                "4 - list playlist \n" +
                "5 - remove current in playlist \n" +
                "6 - selection");
        System.out.println("================================");
    }

    private static void runPlayList(){
        ListIterator<Song> i = playlist.listIterator();

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to your Play list");
        listOptions();

        if (!playlist.isEmpty()) {
            System.out.println("Now playing: " + i.next().toString());
            System.out.println("================================");
            boolean quit = false;

            while(!quit) {
                System.out.print("Enter Action: ");
                int sel = s.nextInt();
                s.nextLine();

                switch (sel){
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        // skip next song
                        if (i.hasNext()) {
                            System.out.println("Now playing: " + i.next());
                            System.out.println("================================");
                        }else {
                            System.out.println("No more songs in the playlist");
                            System.out.println("================================");
                        }
                        break;
                    case 2:
                        // skip backward song
                        if(i.hasPrevious()){
                            System.out.println("Now playing: " + i.previous());
                            System.out.println("================================");
                        }else {
                            System.out.println("At the start of the list");
                            System.out.println("================================");
                        }
                        break;
                    case 3:
                        //replay current song
                        if (i.hasPrevious()){
                            i.previous();
                        }
                        System.out.println("Now playing: " + i.next());
                        System.out.println("================================");
                        break;
                    case 4:
                        //list playlist
                        printPlaylist();
                        break;
                    case 5:
                        //remove current song from playlist
                        i.remove();
                        System.out.println("Removed current song in the play list");
                        System.out.println("================================");
                        break;
                    case 6:
                        //list selection
                        listOptions();
                        break;


                }

            }


        }

    }




















}
