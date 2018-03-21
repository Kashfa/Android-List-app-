package com.example.kashfatahir.listview;

import java.io.Serializable;

/**
 * Created by kashfatahir on 20/03/2018.
 */

    public class Song implements Serializable {

        private Integer ranking;
        private String artist;
        private String title;

        public Song(Integer ranking, String artist, String title) {
            this.ranking = ranking;
            this.artist = artist;
            this.title = title;
        }

        public Integer getRanking() {
            return ranking;
        }

        public String getArtist() {
            return artist;
        }

        public String getTitle() {
            return title;
        }

    }

