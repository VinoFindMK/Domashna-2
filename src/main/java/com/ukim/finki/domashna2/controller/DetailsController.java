package com.ukim.finki.domashna2.controller;

import com.ukim.finki.domashna2.model.WineryInfo;
import com.ukim.finki.domashna2.service.WineryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DetailsController {

    @Autowired
    private WineryService wineryService;

    @GetMapping("Details/{id}")
    public String details(@PathVariable Long id, Model model) {
        WineryInfo winery = wineryService.getWineryById(id);
        model.addAttribute("winery", winery);
        return "Details";
    }
}



//  http://localhost:8080/Details/1

