package com.ukim.finki.domashna2.controller;

import com.ukim.finki.domashna2.model.WineryInfo;
import com.ukim.finki.domashna2.service.WineryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class WineryController {

    @Autowired
    private WineryService wineryService;

    @GetMapping("/Wineries")
    public String listWineries(Model model) {
        List<WineryInfo> wineries = wineryService.getAllWineries();
        model.addAttribute("wineries", wineries);
        return "Wineries";
    }

    @GetMapping("/Home")
    public String home() {
        return "Home";
    }

    @GetMapping("/About")
    public String about() {
        return "AboutUs";
    }

    @GetMapping("/Map")
    public String map() {
        return "Map";
    }


}

//  http://localhost:8080/Wineries

