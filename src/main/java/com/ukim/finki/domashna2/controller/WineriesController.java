package com.ukim.finki.domashna2.controller;

import com.ukim.finki.domashna2.model.WineryInfo;
import com.ukim.finki.domashna2.service.WineryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class WineriesController {

    @Autowired
    private WineryService wineryService;

    @GetMapping("/Wineries")
    public String listWineries(@RequestParam(required = false) String query, Model model, @PageableDefault(size = 10) Pageable pageable) {
        Page<WineryInfo> wineriesPage;

        if (query != null && !query.isEmpty()) {
            wineriesPage = wineryService.searchWineries(query, pageable);
        } else {
            wineriesPage = wineryService.getAllWineries(pageable);
        }

        model.addAttribute("wineriesPage", wineriesPage);
        model.addAttribute("query", query);
        return "Wineries";
    }


}

//  http://localhost:8080/Wineries

