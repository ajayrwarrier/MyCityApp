package com.example.ajayrwarrier.mycityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        ArrayList<Place> placeArrayList = new ArrayList<>();
        placeArrayList.add(new Place(R.string.bharathname,R.string.bharathaddr,R.drawable.bharath_hotel));
        placeArrayList.add(new Place(R.string.spoonname,R.string.spoonaddr,R.drawable.copper_spoon));
        placeArrayList.add(new Place(R.string.shobhaname,R.string.shobhaaddr,R.drawable.sapphire));
        placeArrayList.add(new Place(R.string.epname,R.string.epaddr,R.drawable.mingspalace));
        PlaceAdapter placeAdapter= new PlaceAdapter(this,placeArrayList);
        ListView listView= (ListView)findViewById(R.id.restaurantlist);
        listView.setAdapter(placeAdapter);

    }
}