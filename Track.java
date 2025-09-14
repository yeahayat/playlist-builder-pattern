package org.yeah;

public class Track {
    private final String title;
    private final String artist;
    private final int duration; // in seconds

    public Track(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return title + " by " + artist + " (" + minutes + "m " + seconds + "s)";
    }
}
