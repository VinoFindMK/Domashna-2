package com.ukim.finki.domashna2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "winery", schema = "winery")
public class WineryInfo {
    public String name;
    public String address;
    public String location;
    public float rating;
    public int numRatings;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public WineryInfo(String name, String address, String location, float rating,int numRatings) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.rating = rating;
        this.numRatings=numRatings;


    }


    public WineryInfo() {

    }
}