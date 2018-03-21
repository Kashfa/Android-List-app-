package com.example.kashfatahir.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kashfatahir on 20/03/2018.
 */

    public class TopTenSongs2017Adapter extends ArrayAdapter<Song>{
        public TopTenSongs2017Adapter(Context context, ArrayList<Song> list) {
            super(context, 0, list);}

           @Override
           public View getView(int position, View listItemView, ViewGroup parent) {

               Song currentSong = getItem(position);

               if (listItemView == null) {
                   listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);

               }

               TextView ranking = listItemView.findViewById(R.id.ranking);
               ranking.setText(currentSong.getRanking().toString());

               TextView artist = listItemView.findViewById(R.id.artist);
               artist.setText(currentSong.getArtist());

               TextView title = listItemView.findViewById(R.id.title);
               title.setText(currentSong.getTitle());

               listItemView.setTag(currentSong);

               return listItemView;


           }
        }





