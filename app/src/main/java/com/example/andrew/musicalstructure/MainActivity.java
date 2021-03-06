package com.example.andrew.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button song = (Button) findViewById(R.id.SONG);

        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, Song.class);
                startActivity(songIntent);
            }
        });
        Button album = (Button) findViewById(R.id.ALBUM);
        album.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ALBUMIntent = new Intent(MainActivity.this, Album.class);
                startActivity(ALBUMIntent);
            }
        });
        Button ARTIST = (Button) findViewById(R.id.ARTIST);
        ARTIST.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ARTISTIntent = new Intent(MainActivity.this, Artist.class);
                startActivity(ARTISTIntent);
            }
        });
        Button payment = (Button) findViewById(R.id.Payment);
        payment.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
