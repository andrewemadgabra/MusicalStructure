package com.example.andrew.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);


        Button song = (Button) findViewById(R.id.SONG);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(Album.this, Song.class);
                startActivity(songIntent);
            }
        });
        Button album = (Button) findViewById(R.id.ALBUM);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ALBUMIntent = new Intent(Album.this, Album.class);
                startActivity(ALBUMIntent);
            }
        });
        Button ARTIST = (Button) findViewById(R.id.ARTIST);
        ARTIST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ARTISTIntent = new Intent(Album.this, Artist.class);
                startActivity(ARTISTIntent);
            }
        });
    }
}