package com.example.ajayrwarrier.mycityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);
        ArrayList<Place> placeArrayList = new ArrayList<>();
        placeArrayList.add(new Place(R.string.selexname,R.string.selexaddr,R.drawable.selex));
        placeArrayList.add(new Place(R.string.cityname,R.string.cityaddr,R.drawable.citycentre));
        placeArrayList.add(new Place(R.string.shobhaname,R.string.shobhaaddr,R.drawable.shobhamall));
        placeArrayList.add(new Place(R.string.epname,R.string.epaddr,R.drawable.supermarket));
        PlaceAdapter placeAdapter= new PlaceAdapter(this,placeArrayList);
        ListView listView= (ListView)findViewById(R.id.malllist);
        listView.setAdapter(placeAdapter);

    }
}