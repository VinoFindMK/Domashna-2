package com.ukim.finki.domashna2.service;

import com.ukim.finki.domashna2.model.WineryInfo;
import com.ukim.finki.domashna2.repository.WineryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class WineryService {

    @Autowired
    private WineryRepository wineryRepository;

    public Page<WineryInfo> getAllWineries(Pageable pageable) {
        return wineryRepository.findAll(pageable);
    }


    public Page<WineryInfo> searchWineries(String query, Pageable pageable) {
        return wineryRepository.findByNameContainingIgnoreCase(query, pageable);
    }


    public void saveWineryToDB(WineryInfo winery) {

        Optional<WineryInfo> existingWinery = wineryRepository.findByName(winery.getName());
        if (!existingWinery.isPresent()) {
            wineryRepository.save(winery);
           // System.out.println(winery);
        }
    }
    public String getWineryNameById(Long id) {
        // Assuming you have a method in your repository to find by ID
        WineryInfo winery = wineryRepository.findById(id).orElse(null);

        // Check if the winery is found, and return its name
        return (winery != null) ? winery.getName() : "Unknown Winery";
    }

}
