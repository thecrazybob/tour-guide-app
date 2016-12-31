package com.example.android.abudhabitourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IslandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.yas_island, R.string.yas_island_address, R.drawable.yas_island));
        locations.add(new Location(R.string.sir_bani_yas_island, R.string.sir_bani_yas_island_address, R.drawable.sir_bani_yas_island));
        locations.add(new Location(R.string.saadiyat_island, R.string.saadiyat_island_address, R.drawable.saadiyat_island));
        locations.add(new Location(R.string.maryah_island, R.string.maryah_island_address, R.drawable.maryah_island));
        locations.add(new Location(R.string.reem_island, R.string.reem_island_address, R.drawable.reem_island));
        locations.add(new Location(R.string.nurai_island, R.string.nurai_island_address, R.drawable.nurai_island));
        locations.add(new Location(R.string.delma_island, R.string.delma_island_address, R.drawable.delma_island));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.island_activity);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

    }
}
