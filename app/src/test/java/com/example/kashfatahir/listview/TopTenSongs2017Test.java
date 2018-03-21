package com.example.kashfatahir.listview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kashfatahir on 20/03/2018.
 */

public class TopTenSongs2017Test {

    @Test
    public void getListTest() {
    TopTenSongs2017 topTenSongs2017 = new TopTenSongs2017();
    assertEquals(10, topTenSongs2017.getList().size());
}
}


