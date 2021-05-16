package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startercard;
    CardView maincard;
    CardView dessertcard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startercard = findViewById(R.id.card_view_straters);
        maincard = findViewById(R.id.card_view_main);
        dessertcard = findViewById(R.id.card_desert);

        startercard.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent starteActivityintent = new Intent(MainActivity.this,StartersActivity.class);
                startActivity(starteActivityintent);

            }
        }));

        maincard.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent MainCourseActivityintent = new Intent(MainActivity.this,MainCourseActivity.class);
                startActivity(MainCourseActivityintent);

            }
        }));

        dessertcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DessertActivityintent = new Intent(MainActivity.this,DessertActivity.class);
                startActivity(DessertActivityintent);
            }
        });

        TextView emailtextview = findViewById(R.id.text_email);
        emailtextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchemailapp = new Intent(Intent.ACTION_SENDTO);
                launchemailapp.setData(Uri.parse("mailto:kushagragupta28@gmail.com")); // only email apps should handle this
                startActivity(launchemailapp);
            }
        });


    }
}