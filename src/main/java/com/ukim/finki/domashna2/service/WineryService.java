package com.ukim.finki.domashna2.service;

import com.ukim.finki.domashna2.model.WineryInfo;
import com.ukim.finki.domashna2.repository.WineryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WineryService {

    @Autowired
    private WineryRepository wineryRepository;

    public List<WineryInfo> getAllWineries() {
        return wineryRepository.findAll();
    }
}
