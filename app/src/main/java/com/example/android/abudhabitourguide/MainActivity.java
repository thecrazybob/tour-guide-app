package com.example.android.abudhabitourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find all TextViews
        TextView malls = (TextView) findViewById(R.id.malls);
        TextView family = (TextView) findViewById(R.id.family_attractions);
        TextView culture = (TextView) findViewById(R.id.cultural_places);
        TextView islands = (TextView) findViewById(R.id.islands);

        // Set Listeners on All TextViews and Navigate to the specified activity
        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MallsActivity.class);
                startActivity(intent);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CulturalActivity.class);
                startActivity(intent);
            }
        });

        islands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IslandActivity.class);
                startActivity(intent);
            }
        });

    }
}
