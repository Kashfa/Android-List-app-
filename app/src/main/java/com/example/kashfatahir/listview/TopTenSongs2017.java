package com.example.kashfatahir.listview;

import java.util.ArrayList;

/**
 * Created by kashfatahir on 20/03/2018.
 */

public class TopTenSongs2017 {

    private ArrayList<Song> list;

    public TopTenSongs2017() {
        list = new ArrayList<Song>();

        list.add(new Song(1, "Selena Gomez", "Bad Liar"));
        list.add(new Song(2, "Cardi B", "Bodak Yellow"));
        list.add(new Song(3, "Calvin Harris feat. Frank Ocean & Migos", "Slide"));
        list.add(new Song(4, " Luis Fonsi & Daddy Yankee feat. Justin Bieber", "Despacito"));
        list.add(new Song(5, "Lil Uzi Vert", "Lil Uzi Vert"));
        list.add(new Song(6, "Kendrick Lama", "Humble"));
        list.add(new Song(7, "J Balvin & Willy William feat. Beyonce", "Mi Gente"));
        list.add(new Song(8, "Harry Styles", "Signs of the times"));
        list.add(new Song(9, "The Weeknd feat. Daft Punk", "I feel it coming"));
        list.add(new Song(10, "Portugal. The Man", "Feel it still"));

    }

        public ArrayList<Song> getList() {return new ArrayList<Song>(list);}

        }





