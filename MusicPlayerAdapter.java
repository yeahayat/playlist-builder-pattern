package org.yeah;

public class MusicPlayerAdapter implements MusicPlayer {
    private final AdvancedMusicPlayer advancedPlayer;

    public MusicPlayerAdapter(AdvancedMusicPlayer advancedPlayer) {
        this.advancedPlayer = advancedPlayer;
    }

    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".wav")) {
            advancedPlayer.playWav(fileName);
        } else {
            System.out.println("Error: only works with WAV files!");
        }
    }
}
