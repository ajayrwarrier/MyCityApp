package com.example.ajayrwarrier.mycityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Hospitals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        ArrayList<Place> placeArrayList = new ArrayList<>();
        placeArrayList.add(new Place(R.string.jubilename,R.string.jubileaddress,R.drawable.jubilee));
        placeArrayList.add(new Place(R.string.elitename,R.string.eliteaddress,R.drawable.elite));
        placeArrayList.add(new Place(R.string.mothername,R.string.motheraddress,R.drawable.mother_hospital));
        placeArrayList.add(new Place(R.string.metroname,R.string.metroaddress,R.drawable.alg_metropolitan_hospital_jpg));
        PlaceAdapter placeAdapter= new PlaceAdapter(this,placeArrayList);
        ListView listView= (ListView)findViewById(R.id.hospitallist);
        listView.setAdapter(placeAdapter);
    }
}