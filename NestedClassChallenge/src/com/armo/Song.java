package com.armo;

public class Song {
    private String name;
    private double duration;

    public Song(String title, double duration) {
        this.name = title;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.getDuration();
    }
}
