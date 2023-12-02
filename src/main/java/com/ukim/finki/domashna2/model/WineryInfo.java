package com.ukim.finki.domashna2.model;

import com.google.maps.model.OpeningHours;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "winery", schema = "winery")
public class WineryInfo {
    @Column(unique = true)
    public String name;
    public String address;
    public String location;
    public float rating;
    public int numRatings;
    public OpeningHours openingHours;
    public String placeId;
    public String phoneNumber;
    public String[] workingHours;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public WineryInfo(String name, String address, String location, float rating, int numRatings, OpeningHours openingHours,String placeId) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.rating = rating;
        this.numRatings=numRatings;
        this.openingHours=openingHours;
        this.placeId=placeId;
    }

    public WineryInfo() {

    }
}