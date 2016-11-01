package com.example.ajayrwarrier.mycityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainattr);
        ArrayList<Place> placeArrayList = new ArrayList<>();
        placeArrayList.add(new Place(R.string.pooramname,R.string.pooramdate,R.drawable.pooram));
        placeArrayList.add(new Place(R.string.vadakname,R.string.vadakaddress,R.drawable.vadak));
        placeArrayList.add(new Place(R.string.shakthanname,R.string.shakthanaddress,R.drawable.shakthan_thampuran_palace));
        PlaceAdapter placeAdapter= new PlaceAdapter(this,placeArrayList);
        ListView listView= (ListView)findViewById(R.id.attrlist);
        listView.setAdapter(placeAdapter);

    }
}