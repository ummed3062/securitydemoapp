package com.mru.securitydemoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mru.securitydemoapp.entity.Student;
import com.mru.securitydemoapp.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentApi {


    @Autowired
    StudentService studentService;
    
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
    



    @PostMapping("/register")
    Student studentRegister(@RequestBody Student student){
        return studentService.registration(student);
    }




}
