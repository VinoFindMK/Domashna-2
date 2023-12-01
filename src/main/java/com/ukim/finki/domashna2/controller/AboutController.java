package com.ukim.finki.domashna2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class AboutController {

    @GetMapping("/About")
    public String about() {
        return "AboutUs";
    }

}

//  http://localhost:8080/About

