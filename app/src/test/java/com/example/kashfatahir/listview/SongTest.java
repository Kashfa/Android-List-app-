package com.example.kashfatahir.listview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kashfatahir on 20/03/2018.
 */

public class SongTest {

    Song song;

    @Before
    public void before() {
        song = new Song(13, "Lorde", "Royal");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)13, song.getRanking());

    }

    @Test
    public void getArtistTest() {
        assertEquals("Lorde", song.getArtist());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Royal", song.getTitle());

    }
}

