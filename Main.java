package org.yeah;

public class Main {
    public static void main(String[] args) {
        MusicPlayer oldPlayer = new OldMusicPlayer();
        oldPlayer.play("song.mp3");
        oldPlayer.play("track.wav");

        System.out.println();

        AdvancedMusicPlayer advancedPlayer = new AdvancedMusicPlayer();
        MusicPlayer adapter = new MusicPlayerAdapter(advancedPlayer);
        adapter.play("track.wav");
        adapter.play("song.mp3");
    }
}
