package com.example.android.abudhabitourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.yas_mall, R.string.yas_island_address));
        locations.add(new Location(R.string.ad_mall, R.string.ad_mall_address));
        locations.add(new Location(R.string.khalidiyah_mall, R.string.khalidiyah_mall_address));
        locations.add(new Location(R.string.marina_mall, R.string.marina_mall_address));
        locations.add(new Location(R.string.wahda_mall, R.string.wahda_mall_address));
        locations.add(new Location(R.string.wtc_mall, R.string.wtc_mall_address));
        locations.add(new Location(R.string.raha_mall, R.string.raha_mall_address));
        locations.add(new Location(R.string.deer_townsquare, R.string.deer_townsquare_address));
        locations.add(new Location(R.string.mushrif_mall, R.string.mushrif_mall_address));
        locations.add(new Location(R.string.dalma_mall, R.string.dalma_mall_address));
        locations.add(new Location(R.string.bawadi_mall, R.string.bawadi_mall_address));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.malls_activity);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

    }
}
