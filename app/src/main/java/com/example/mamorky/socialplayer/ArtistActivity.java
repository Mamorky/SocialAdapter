package com.example.mamorky.socialplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import adapter.ArtistAdapter;

public class ArtistActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArtistAdapter artistAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        recyclerView = (RecyclerView)findViewById(R.id.recylcerArtist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        artistAdapter = new ArtistAdapter();

        recyclerView.setAdapter(artistAdapter);
    }
}
