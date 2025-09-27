package org.yeah;

public class OldMusicPlayer implements MusicPlayer {
    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".mp3")) {
            System.out.println("Playing MP3: " + fileName);
        } else {
            System.out.println("Error: supports only MP3 files!");
        }
    }
}
