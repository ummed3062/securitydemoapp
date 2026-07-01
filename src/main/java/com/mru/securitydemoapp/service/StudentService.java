package com.mru.securitydemoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mru.securitydemoapp.entity.Student;
import com.mru.securitydemoapp.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;


    @Autowired
    PasswordEncoder passwordEncoder;
    
    public Student registration(Student student){


        Student newStudent = new Student();
        newStudent.setEmail(student.getEmail());
        newStudent.setName(student.getName());
        newStudent.setPassword(passwordEncoder.encode(student.getPassword()));

        return studentRepo.save(newStudent);

    }
}
