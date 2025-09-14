package org.yeah;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String title;
    private final String author;
    private final String genre;
    private final boolean isPublic;
    private final String description;
    private final List<Track> tracks;

    private Playlist(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.isPublic = builder.isPublic;
        this.description = builder.description;
        this.tracks = builder.tracks;
    }

    @Override
    public String toString() {
        return "Playlist (" +
                "title: '" + title + '\'' + ", author: '" + author + '\'' + ", genre: '" + genre + '\'' + ", Public:" + isPublic + ", description: '" + description + '\'' + ", tracks: " + tracks + ')';
    }

    public static class Builder {
        private String title;
        private String author;
        private String genre;
        private boolean isPublic;
        private String description;
        private List<Track> tracks = new ArrayList<>();

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setPublic(boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder addTrack(Track track) {
            this.tracks.add(track);
            return this;
        }

        public Playlist build() {
            if (title == null || title.isEmpty()) {
                throw new IllegalStateException("Need title!");
            }
            return new Playlist(this);
        }
    }
}
