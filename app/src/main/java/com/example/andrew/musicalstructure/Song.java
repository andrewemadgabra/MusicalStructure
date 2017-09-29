package com.example.andrew.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by andrew on 9/27/2017.
 */

public class Song extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);


        Button song = (Button) findViewById(R.id.SONG);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(Song.this, Song.class);
                startActivity(songIntent);
            }
        });
        Button album = (Button) findViewById(R.id.ALBUM);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ALBUMIntent = new Intent(Song.this, Album.class);
                startActivity(ALBUMIntent);
            }
        });
        Button ARTIST = (Button) findViewById(R.id.ARTIST);
        ARTIST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ARTISTIntent = new Intent(Song.this, Artist.class);
                startActivity(ARTISTIntent);
            }
        });
        Button Details = (Button) findViewById(R.id.Details);
        Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ARTISTIntent = new Intent(Song.this, Album.class);
                startActivity(ARTISTIntent);
            }
        });
        Button homepage = (Button) findViewById(R.id.Homepage);
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homepageIntent = new Intent(Song.this, MainActivity.class);
                startActivity(homepageIntent);
            }
        });
    }
}
