package com.example.android.abudhabitourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CulturalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.zayed_mosque, R.string.zayed_mosque_address));
        locations.add(new Location(R.string.heritage_village, R.string.heritage_village_address));
        locations.add(new Location(R.string.al_hosn, R.string.al_hosn_address));
        locations.add(new Location(R.string.women_craft, R.string.women_craft_address));
        locations.add(new Location(R.string.qasr_muwaiji, R.string.qasr_muwaiji_address));
        locations.add(new Location(R.string.emirates_park, R.string.emirates_park_address));
        locations.add(new Location(R.string.ad_falcon, R.string.ad_falcon_address));
        locations.add(new Location(R.string.aj_fort, R.string.aj_fort_address));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.cultural_activity);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

    }
}
