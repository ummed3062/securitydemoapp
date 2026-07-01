package com.mru.securitydemoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentApi {
    
    @GetMapping("/home")
    String homePage(){
        return "Welcome to the Home API";
    }

    @GetMapping("/course")
    String coursePage(){
        return "Welcome to the Course API";
    }

    @GetMapping("/profile")
    String profilePage(){
        return "Welcome to the Profile API";
    }

}
