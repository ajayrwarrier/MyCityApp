package com.example.ajayrwarrier.mycityapp;

import android.media.Image;

/**
 * Created by Ajay R Warrier on 30-10-2016.
 */
public class Place {
    int name;
    int address;
    int icon;

    Place(int name, int address, int icon){

        this.name = name;
        this.address=address;
        this.icon=icon;

    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
