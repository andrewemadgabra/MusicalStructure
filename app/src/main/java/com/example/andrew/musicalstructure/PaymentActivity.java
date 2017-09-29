package com.example.andrew.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button homepage = (Button) findViewById(R.id.Homepage);
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homepageIntent = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(homepageIntent);
            }
        });
    }
}
