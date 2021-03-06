package com.example.andrew.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);


        Button song = (Button) findViewById(R.id.SONG);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(Artist.this, Song.class);
                startActivity(songIntent);
            }
        });
        Button album = (Button) findViewById(R.id.ALBUM);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ALBUMIntent = new Intent(Artist.this, Album.class);
                startActivity(ALBUMIntent);
            }
        });
        Button ARTIST = (Button) findViewById(R.id.ARTIST);
        ARTIST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ARTISTIntent = new Intent(Artist.this, Artist.class);
                startActivity(ARTISTIntent);
            }
        });
        Button homepage = (Button) findViewById(R.id.Homepage);
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homepageIntent = new Intent(Artist.this, MainActivity.class);
                startActivity(homepageIntent);
            }
        });
    }
}