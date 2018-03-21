package com.example.kashfatahir.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopTenSongs2017 topTenSongs2017 = new TopTenSongs2017();
        ArrayList<Song> list = topTenSongs2017.getList();

        TopTenSongs2017Adapter topTenSongs2017Adapter = new TopTenSongs2017Adapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(topTenSongs2017Adapter);

    }

    public void onListItemClick(View listItem) {
        Song selectedSong = (Song) listItem.getTag();

        Log.d("MainActivity", selectedSong.getArtist());

        Intent intent = new Intent(this, SongActivity.class);
        intent.putExtra("song", selectedSong);

        startActivity(intent);

    }
}
