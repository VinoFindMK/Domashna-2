package com.ukim.finki.domashna2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/Home")
    public String home() {
        return "Home";
    }

}

//  http://localhost:8080/Home

