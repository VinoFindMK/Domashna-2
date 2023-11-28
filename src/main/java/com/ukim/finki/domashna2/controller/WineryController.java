package com.ukim.finki.domashna2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Controller
@RequestMapping
public class WineryController {

    @GetMapping("/display")
    public String displayWineryData(Model model) {

        String csvFilePath =  "unique_winery_data.csv";
       // System.out.println(csvFilePath);

        try {
            String content = Files.readString(Path.of(csvFilePath));
            model.addAttribute("csvContent", content);
        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("error", "Error reading CSV file.");
        }

        return "wineryData";
    }
}
