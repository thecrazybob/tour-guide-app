package com.example.android.abudhabitourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.ad_corniche, R.string.ad_corniche_address));
        locations.add(new Location(R.string.yas_marina_circuit, R.string.yas_marina_circuit_address));
        locations.add(new Location(R.string.ferrari_world, R.string.ferrari_world_address));
        locations.add(new Location(R.string.yas_waterworld, R.string.yas_waterworld_address));
        locations.add(new Location(R.string.wadi_adventure, R.string.wadi_adventure_address));
        locations.add(new Location(R.string.marina_eye, R.string.marina_eye_address));
        locations.add(new Location(R.string.bounce_abudhabi, R.string.bounce_abudhabi_address));
        locations.add(new Location(R.string.khalifa_park, R.string.khalifa_park_address));
        locations.add(new Location(R.string.umm_al_emarat_park, R.string.umm_al_emarat_park_address));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.family_activity);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

    }
}
