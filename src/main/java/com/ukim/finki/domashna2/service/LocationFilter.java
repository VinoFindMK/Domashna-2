package com.ukim.finki.domashna2.service;

import com.google.maps.model.PlacesSearchResult;

public class LocationFilter {

    public static boolean shouldIncludeWinery(PlacesSearchResult result) {
        return result.formattedAddress.contains("North Macedonia");
    }
}