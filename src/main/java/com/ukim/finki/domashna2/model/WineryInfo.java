package com.ukim.finki.domashna2.model;

import com.google.maps.model.LatLng;

public class WineryInfo {
    public String name;
    public String address;
    public LatLng location;
    public float rating;

    public int numRatings;

    public WineryInfo(String name, String address, LatLng location, float rating,int numRatings) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.rating = rating;
        this.numRatings=numRatings;
    }
}