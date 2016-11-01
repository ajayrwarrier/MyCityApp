package com.example.ajayrwarrier.mycityapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ajay R Warrier on 30-10-2016.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> placeArrayList) {

        super(context, 0, placeArrayList);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listview, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView nameTextView =(TextView)listItemView.findViewById(R.id.name);
        nameTextView.setText(currentPlace.getName());
        TextView addrTextView =(TextView)listItemView.findViewById(R.id.address);
        addrTextView.setText(currentPlace.getAddress());
        ImageView iconView =(ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentPlace.getIcon());

return listItemView;
}
}
