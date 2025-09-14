package org.yeah;

public class Main {
    public static void main(String[] args) {
        Playlist chillPlay = new Playlist.Builder()
                .setTitle("Chill")
                .setAuthor("Ayat")
                .setGenre("Hip-Hop")
                .setPublic(true)
                .setDescription("for chilling and coding")
                .addTrack(new Track("Swim", "Chase Atlantic", 229))
                .addTrack(new Track("DAISIES", "Justin Bieber", 176))
                .build();

        Playlist workoutPlay = new Playlist.Builder()
                .setTitle("Workout")
                .setAuthor("Ayat")
                .setGenre("Pop")
                .setPublic(false)
                .setDescription("For training")
                .addTrack(new Track("reasons", "OG Buda", 191))
                .addTrack(new Track("That's What I Like", "Bruno Mars", 190))
                .build();

        System.out.println(chillPlay);
        System.out.println(workoutPlay);
    }
}
